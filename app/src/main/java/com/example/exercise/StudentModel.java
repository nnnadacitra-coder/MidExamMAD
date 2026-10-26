package com.example.exercise;

public class StudentModel {
    Integer id;
    String name, studentId;
    int hasEnrolled;

    public StudentModel(String name, String studentId, int hasEnrolled) {
        this.name = name;
        this.studentId = studentId;
        this.hasEnrolled = hasEnrolled;
    }

    public StudentModel(Integer id, String name, String studentId, int hasEnrolled) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.hasEnrolled = hasEnrolled;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getHasEnrolled() {
        return this.hasEnrolled;
    }

    public void setHasEnrolled(int hasEnrolled) {
        this.hasEnrolled = hasEnrolled;
    }
}