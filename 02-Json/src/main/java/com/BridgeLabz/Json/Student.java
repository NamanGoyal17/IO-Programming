package com.BridgeLabz.Json;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private List <String> subject;
    private String studentClass;

    public Student(int id, String name, String studentClass , List<String> subject) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", studentClass='" + studentClass + '\'' +
//                ", subject=" + subject +
//                '}';
//    }

    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", "10th Grade" , Arrays.asList("Maths" , "English" , "Science"));
        //  System.out.println(student);
        Gson gson = new Gson();
        String json = gson.toJson(student);
        System.out.println(json);
    }
}