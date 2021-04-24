package package02.enmu;

public enum Gender implements GenderInterface{
    MALE("女"){
        @Override
        public void info() {
            System.out.println("女");
        }
    },
    FEMALE("男"){
        @Override
        public void info() {
            System.out.println("男");
        }
    };


    private String name;
    private Gender(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
