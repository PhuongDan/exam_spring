package com.example.exam_spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_spring")

public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private Integer saraly;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSaraly() {
        return saraly;
    }

    public void setSaraly(Integer saraly) {
        this.saraly = saraly;
    }
}
