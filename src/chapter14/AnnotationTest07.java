package chapter14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationTest07 {
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
    @ActionListenerFor(listener = OkListener.class)
    private JButton ok = new JButton("确定");
    @ActionListenerFor(listener = CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init(){
        final JPanel jPanel = new JPanel();
        jPanel.add(ok);
        jPanel.add(cancel);
        mainWin.add(jPanel);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }
    public static void main(String[] args) {
        final AnnotationTest07 annotationTest07 = new AnnotationTest07();
        annotationTest07.init();
    }
}
class OkListener implements ActionListener{

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"点击了确认按钮");
    }
}
class  CancelListener implements ActionListener{

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"单击了取消按钮");
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface  ActionListenerFor{

    Class<? extends ActionListener>  listener();
}