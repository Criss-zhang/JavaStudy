package package01.homework02;

public class HomeworkTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        Student[] arrStudent = new Student[]{student};
        Teacher teacher = new Teacher();
        teacher.setAge(25);
        Master master = new Master();
        master.setArrStudent(arrStudent);
        Master[] arrMaster = new Master[]{master};
        School school = new School();
        school.setArrMaster(arrMaster);
        System.out.println(school);
    }
}
