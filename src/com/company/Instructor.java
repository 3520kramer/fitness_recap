package com.company;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, double hours) {
        setName(name);
        setCpr(cpr);
        setHours(hours);
    }

    public double getSalary(double hours) {
        return hours * 199;
    }
}
