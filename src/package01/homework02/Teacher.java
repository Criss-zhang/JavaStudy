package package01.homework02;

public class Teacher {
    private int age ;
    private String gender;
    private String name;
    private String keMu;


    public Teacher(int age, String gender, String name, String keMu) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.keMu = keMu;
    }

    public Teacher() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeMu() {
        return keMu;
    }

    public void setKeMu(String keMu) {
        this.keMu = keMu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", keMu='" + keMu + '\'' +
                '}';
    }
}
