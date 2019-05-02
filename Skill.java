package com.alladin;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    private List<ProgrammingLanguage> categories;
    private int experience;
    private String position;
    private List<Employment> employments;
    private EnglishLevel level;

    public Skill(int experience,
                 String position, EnglishLevel level) {
        this.categories = new ArrayList<>();
        this.experience = experience;
        this.position = position;
        this.employments = new ArrayList<>();
        this.level = level;
    }

    public void addCategory(ProgrammingLanguage language) {
        categories.add(language);
    }
    public void addEmployment(Employment employment){
        employments.add(employment);
    }

    public List<ProgrammingLanguage> getCategories() {
        return categories;
    }

    public int getExperience() {
        return experience;
    }

    public String getPosition() {
        return position;
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public EnglishLevel getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Skill" +
                " category = " + categories +
                ", experience = " + experience +
                ", position = " + position + '\'' +
                ", employment = " + employments +
                ", level = " + level;
    }
}

