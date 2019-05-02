package com.alladin;

public class Job {
    private Skill skill;
    private Salary salary;
    private City city;

    public Job(Skill skill, Salary salary, City city) {
        this.skill = skill;
        this.salary = salary;
        this.city = city;
    }

    public Skill getSkill() {
        return skill;
    }

    public Salary getSalary() {
        return salary;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Job" +
                "skill = " + skill +
                ", salary = " + salary +
                ", city = " + city ;
    }
}
