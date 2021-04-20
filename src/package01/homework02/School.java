package package01.homework02;

import java.util.Arrays;

public class School {
    private Master[] arrMaster;
    private String name;

    public School() {
    }

    public void setArrMaster(Master[] arrMaster) {
        this.arrMaster = arrMaster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School(Master[] arrMaster) {
        this.arrMaster = arrMaster;
    }

    public School(Master[] arrMaster, String name) {
        this.arrMaster = arrMaster;
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "arrMaster=" + Arrays.toString(arrMaster) +
                ", name='" + name + '\'' +
                '}';
    }
}
