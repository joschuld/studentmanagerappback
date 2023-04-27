package com.joschu.studentmanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true)
    private Long id;
    private String studentName;
    private String studentGrade;
    private String parentName;
    private String parentEmail;
    private String parentPhone;
    private String address;
    private String imageUrl;
    @Column(nullable = false, updatable = true)
    private String studentID;

    public Student(){}

    public Student(String studentName, String studentGrade, String parentName, String parentEmail, String parentPhone, String address, String imageUrl, String studentID) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.parentName = parentName;
        this.parentPhone = parentPhone;
        this.address = address;
        this.imageUrl = imageUrl;
        this.studentID = studentID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                ", parentName='" + parentName + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", address='" + address + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}




