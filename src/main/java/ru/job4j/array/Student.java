package ru.job4j.array;

public class Student {

    private String name;
    private String surname;
    private Integer age;

    public Student() {
    }

    public Student(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + '}';
    }
}
