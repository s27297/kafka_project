package com.example.demo.dto;


public class Cat {
    private Long id;
    private String color;
    private int age;
    private String name;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Cat [id=" + id + ", color=" + color + ", age=" + age + ", name=" + name + "]";
    }

    
}
