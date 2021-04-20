package package01.homework01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Homework0501 {
    public static void main(String[] args) throws Exception{
        Student student01 = new Student();
        Student student02 = new Student();
        Student student03 = new Student();
        student01.setName("student01");
        student02.setName("student02");
        student03.setName("student03");
        student01.setEmail("1@qq.com");
        student02.setEmail("2@qq.com");
        student03.setEmail("3@qq.com");
        student01.setAddress("01");
        student02.setAddress("02");
        student03.setAddress("03");
        Student[] arrStudent = new Student[3];
        arrStudent[0] = student01;
        arrStudent[1] = student02;
        arrStudent[2] = student03;

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("请输入任意字母并按回车键：");
        String line =null;
        while((line=bufr.readLine())!=null)    {
            for (int i = 0; i < arrStudent.length;i++){
                if (line.equals(arrStudent[i].getName())){
                    System.out.println("1"+arrStudent[i]);
                    break;
                }else if (line.equals(arrStudent[i].getAddress())){
                    System.out.println("2"+arrStudent[i]);
                    break;
                }else if (line.equals(arrStudent[i].getEmail())){
                    System.out.println("3"+arrStudent[i]);
                    break;
                }if (i == arrStudent.length-1){
                    System.out.println("输入不对，请重新输入");
                }

            }

        }
        bufw.close();




    }
}

class  Student{
    private String name;
    private int age;
    private String gender;
    private long phone;
    private String address;
    private String email;

    public Student() {
    }

    public void eat( ){
        System.out.println(this.name +"进行吃饭");
    }
    public void drink( ){
        System.out.println(this.name +"正在进行喝");
    }
    public void play( ){
        System.out.println(this.name+"正在玩");
    }
    public void sleep( ){
        System.out.println(this.name +"正在睡觉");
    }
    public Student(String name, int age, String gender, long phone, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}