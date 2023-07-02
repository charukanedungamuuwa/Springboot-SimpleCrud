package com.example.simplecrud.Demo;

import jakarta.persistence.*;

@Entity
public class demo {
    @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
private Long id;
    @Column(name = "studentname", nullable = false)
    private String studentname;
    @Column(name = "course", nullable = false)

    private String course;
    @Column(name = "fee", nullable = false)
    private int fee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public demo() {
    }
}
