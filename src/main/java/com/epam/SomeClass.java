package com.epam;

public class SomeClass {
    private String name;
    private int age;
    private int height;
    private String sex;

    public SomeClass( String name, int age, int height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }


    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
