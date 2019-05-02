package com.alladin;

public class Salary {
    private int lowRangeSalary;
    private int highRangeSalary;

    public Salary( int lowRangeSalary, int highRangeSalary){
        this.lowRangeSalary = lowRangeSalary;
        this.highRangeSalary = highRangeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return lowRangeSalary == salary.lowRangeSalary &&
                highRangeSalary == salary.highRangeSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "lowRangeSalary=" + lowRangeSalary +
                ", highRangeSalary=" + highRangeSalary +
                '}';
    }
}
