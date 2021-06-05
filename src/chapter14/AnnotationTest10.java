package chapter14;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.annotation.*;
import java.util.Set;

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes({"Persistent","Id","Property"})
public class AnnotationTest10 extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv){
        PrintStream ps = null;
        try {
            for (Element t:roundEnv.getElementsAnnotatedWith(Persistent.class)){
                 Name className = t.getSimpleName();
                 Persistent persistent = t.getAnnotation(Persistent.class);
                 ps = new PrintStream(new FileOutputStream(className+".hbm.xml"));
                ps.println("0001");
                ps.println("0002");
                ps.println("0003");
                ps.println("0004");
                ps.println("0005");
                ps.println("class name = "+t);
                ps.println("table ="+persistent.table());
                for (Element f : t.getEnclosedElements()){
                    if (f.getKind() == ElementKind.FIELD){
                         Id id = f.getAnnotation(Id.class);
                         if (id != null){
                             ps.println("id ="+f.getSimpleName());
                             ps.println("column = "+id.column());
                             ps.println("type = "+id.type());
                             ps.println("generator class = "+id.generator());
                         }
                        final Property p = f.getAnnotation(Property.class);
                         if (p != null){
                             ps.println("id ="+f.getSimpleName());
                             ps.println("column = "+p.column());
                             ps.println("type = "+p.type());
                         }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (ps!=null){
                try {
                    ps.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
@interface Persistent{
    String table();
}

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@interface Id{
    String column();
    String type();
    String generator();
}


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
@interface Property{
    String column();
    String type();
}