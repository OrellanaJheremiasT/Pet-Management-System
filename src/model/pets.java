package model;

public class pets {
    final private String name;
    final private String type;
    private int age;

    public pets(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%15S %15S %5d\n", name, type, age);

    }   

}

