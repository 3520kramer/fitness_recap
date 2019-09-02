package com.company;

public class AdministrationPersonnel extends Employee {

    private int vacation;

    public AdministrationPersonnel(String name, String cpr) {
        setName(name);
        setCpr(cpr);
    }

    public double getHours() {
        return 37;
    }

    public double getSalary() {
        return 33000;
    }

    public int getVacation() {
        return 5;
    }

}
