package package01.homework02;

import java.util.Arrays;

/**
 * 这个是班主任类
 * 班主任包含老师属性，所以就组合了老师类
 * 班主任包含多个学生，所以将学生数组引入了该类中
 * 班主任是要主管一个班级，所以包含grade属性
 */
public class Master {
   private Teacher teacher;
   private Student[] arrStudent;
   private String grade;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getArrStudent() {
        return arrStudent;
    }

    public void setArrStudent(Student[] arrStudent) {
        this.arrStudent = arrStudent;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Master(Teacher teacher, Student[] arrStudent, String grade) {
        this.teacher = teacher;
        this.arrStudent = arrStudent;
        this.grade = grade;
    }

    public Master() {
    }

    @Override
    public String toString() {
        return "Master{" +
                "teacher=" + teacher +
                ", arrStudent=" + Arrays.toString(arrStudent) +
                ", grade='" + grade + '\'' +
                '}';
    }
}
