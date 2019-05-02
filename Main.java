package com.alladin;

public class Main {
    public static void main(String[] args) {
        ProgrammingLanguage java = ProgrammingLanguage.JAVA;
        ProgrammingLanguage c = ProgrammingLanguage.C;
        ProgrammingLanguage php = ProgrammingLanguage.PHP;

        Employment fullDayOfficeWork = Employment.FULL_DAY_OFFICE_WORK;
        Employment fullDayRemoteWork = Employment.FULL_DAY_REMOTE_WORK;
        Employment freelance = Employment.FREELANCE;
        Employment relocatetousaoreurope =Employment.RELOCATETOUSAOREUROPE;

        Salary igorSalary = new Salary(200, 300);
        Salary javaDeveloperSalary = new Salary(200, 300);
        Salary phpDeveloperSalary = new Salary(300, 400);
        Salary artemSalary = new Salary(400, 600);
        Salary cDeveloperSalary = new Salary(700,900);

        Skill igorSkill = new Skill(2, "Programmer", EnglishLevel.BEGINNER);
        Skill javaDeveloperSkill = new Skill(0, "Java", EnglishLevel.BEGINNER);
        Skill ivanSkill = new Skill(0, "Java", EnglishLevel.BEGINNER);
        Skill phpDeveloperSkill = new Skill(1, "PHP Developer", EnglishLevel.NO_ENGLISH);
        Skill artemSkill = new Skill(0, "Junior java developer", EnglishLevel.ADVANCED);
        Skill cDeveloperSkill = new Skill(2,"C Developer",EnglishLevel.BEGINNER);


        igorSkill.addCategory(java);
        igorSkill.addCategory(c);
        igorSkill.addEmployment(fullDayOfficeWork);
        igorSkill.addEmployment(fullDayRemoteWork);

        artemSkill.addCategory(java);
        artemSkill.addEmployment(fullDayOfficeWork);
        artemSkill.addEmployment(fullDayRemoteWork);

        ivanSkill.addCategory(c);
        ivanSkill.addEmployment(freelance);

        javaDeveloperSkill.addCategory(c);
        javaDeveloperSkill.addEmployment(freelance);

        phpDeveloperSkill.addCategory(php);
        phpDeveloperSkill.addEmployment(fullDayOfficeWork);

        cDeveloperSkill.addCategory(c);
        cDeveloperSkill.addEmployment(relocatetousaoreurope);


        User ivan = new User("Ivan", "Prima", 34, ivanSkill, javaDeveloperSalary, City.KYIV);
        User igor = new User("Igor", "Kovalenko", 45, igorSkill, igorSalary, City.KYIV);
        User artem = new User("Artem", "Bondar", 28, artemSkill, artemSalary, City.KYIV);
        Job javaDeveloper = new Job(javaDeveloperSkill, javaDeveloperSalary, City.KYIV);
        Job phpDeveloper = new Job(phpDeveloperSkill, phpDeveloperSalary, City.KHARKIV);
        Job cDeveloper = new Job(cDeveloperSkill,cDeveloperSalary,City.KYIV);


        JobFinder founder = new JobFinder();
        founder.addJob(javaDeveloper);
        founder.addJob(phpDeveloper);
        founder.addJob(cDeveloper);


        founder.recommendJobByUser(ivan);


    }
}
