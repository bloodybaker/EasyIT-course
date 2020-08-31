package com.company.task2;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Human(String name, int age,
                 double height,
                 double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void say() {
        System.out.println(
                "Name: " + name + "\n" +
                " Age: " + age +
                " Height: " + height +
                " Weight: " + weight);
    }
}