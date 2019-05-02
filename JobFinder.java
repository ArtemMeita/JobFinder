package com.alladin;

import java.util.ArrayList;
import java.util.List;

public class JobFinder {
    private List<Job> jobs;

    public JobFinder() {
        jobs = new ArrayList<>();
    }

    public void recommendJobByUser(User user) {
        for (Job job : jobs) {

            Salary userSalary = user.getSalary();

            Salary jobSalary = job.getSalary();

            if (userSalary.equals(jobSalary) &&
                    compareSkills(job, user) &&
                    job.getCity() == user.getCity()) {
                System.out.println(job);
            }
        }
    }

    public void recommendJobByUserAnotherCity(User user) {
        for (Job job : jobs) {

            Salary userSalary = user.getSalary();

            Salary jobSalary = job.getSalary();

            if (userSalary.equals(jobSalary) &&
                    compareSkills(job, user) &&
                    job.getCity() != user.getCity()) {
                System.out.println(job);
            }

        }
    }

    private boolean compareSkills(Job job, User user) {

        Skill jobSkill = job.getSkill();

        Skill userSkill = user.getSkill();

        return jobSkill.getCategories().equals(userSkill.getCategories()) &&
                jobSkill.getEmployments().equals(userSkill.getEmployments()) &&
                jobSkill.getExperience() == userSkill.getExperience() &&
                jobSkill.getLevel() == userSkill.getLevel() &&
                jobSkill.getPosition().equals(userSkill.getPosition());
    }

    public void recommendJobByUserAnotherSalary(User user) {
        for (Job job : jobs) {

            Salary userSalary = user.getSalary();

            Salary jobSalary = job.getSalary();

            if (!userSalary.equals(jobSalary) &&
                    compareSkills(job, user) &&
                    job.getCity() == user.getCity()) ;
            System.out.println(job);
        }
    }


    public void addJob(Job job) {
        jobs.add(job);
    }

}
