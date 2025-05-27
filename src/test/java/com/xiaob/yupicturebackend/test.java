package com.xiaob.yupicturebackend;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class test {
    public static void main(String[] args){
        System.out.println("hello world");
        System.out.println(sort().get());
    }
    public static Optional<student> sort(){
        List<student> students = Arrays.asList(
                new student("张三",18,"男","北京"),
                new student("李四",19,"男","上海"),
                new student("王五",20,"男","广州"),
                new student("赵六",21,"男"," 深圳")
        );
        Optional<student> stu = students.stream()
                .max(Comparator.comparing(student::getAge));
        return stu;

    }

}

class student{
    private String name;
    private int age;
    private String sex;
    private String address;

    public student(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
