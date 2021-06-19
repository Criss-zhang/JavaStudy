package chapter15;

import java.io.FileInputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class FilterTest {
    public static void main(String[] args) {
        try (
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
                ){
            objectInputStream.setObjectInputFilter(new ObjectInputFilter() {
                @Override
                public Status checkInput(FilterInfo filterInfo) {
                    System.out.println("====执行数据过滤====");
                    final ObjectInputFilter serialFilter = Config.getSerialFilter();
                    if (serialFilter != null){
                         Status status = serialFilter.checkInput(filterInfo);
                         if (status != Status.UNDECIDED){
                             return status;
                         }
                    }
                    if (filterInfo.references() != 1){
                        return Status.REJECTED;
                    }
                    if (filterInfo.serialClass() != null && filterInfo.serialClass() != Person.class){
                        return Status.REJECTED;
                    }
                    return Status.UNDECIDED;
                }
            });
            final Person person = (Person) objectInputStream.readObject();
            System.out.println(person);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
