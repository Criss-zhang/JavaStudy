package package01.homework02;

public class Student {
    private int age ;
    private String name;
    private String grade;
    private String gender;

    public Student(int age, String name, String grade, String gender) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.gender = gender;
    }

    public Student() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
