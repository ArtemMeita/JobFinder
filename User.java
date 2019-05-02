package com.alladin;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Skill skill;
    private Salary salary;
    private City city;

    public User(String firstName, String lastName, int age, Skill skill, Salary salary, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skill = skill;
        this.salary = salary;
        this.city = city;
    }


    public Salary getSalary() {
        return salary;
    }

    public Skill getSkill() {
        return skill;
    }


    public City getCity() {
        return city;
    }
}
