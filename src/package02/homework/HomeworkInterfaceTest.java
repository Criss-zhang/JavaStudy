package package02.homework;

public class HomeworkInterfaceTest {
    public  void test(HomeworkInterface homeworkInterface){
        homeworkInterface.helloWorld();
    }

    public static void main(String[] args) {
        HomeworkInterfaceTest homeworkInterfaceTest = new HomeworkInterfaceTest();
        homeworkInterfaceTest.test(new HomeworkInterface() {
            @Override
            public void helloWorld() {
                System.out.println("就不说hello world");
            }
        });
    }
}
