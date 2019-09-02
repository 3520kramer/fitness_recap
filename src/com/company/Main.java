package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creates list of employees
        List<Employee> employeeList = new ArrayList<>();

        // Creates and adds objects of employees to list
        employeeList.add(new AdministrationPersonnel("Johanne", "223344-5566"));
        employeeList.add(new AdministrationPersonnel("Kasper", "445566-7788"));
        employeeList.add(new Instructor("Jørgen", "334455-6677", 12.5));
        employeeList.add(new Instructor("Katrine", "556677-8899", 28));

        // Prints List
        System.out.println("Name\t\tCPR\t\t\t\tHours\t\tSalary\t\tVacation");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(Employee e : employeeList){
            System.out.print(e.getName() + "\t\t" + e.getCpr() + "\t\t");
            if(e instanceof AdministrationPersonnel){
                System.out.print(e.getHours() + "\t\t" + e.getSalary() + "\t\t");
                System.out.print(((AdministrationPersonnel) e).getVacation() + "\n");
            }else if(e instanceof Instructor){
                System.out.print(e.getHours() + "\t\t");
                System.out.print(((Instructor) e).getSalary(e.getHours()) + "\n");
            }
        }

        System.out.println("\n");

        // Creates list of fitness members
        List<Member> memberList = new ArrayList<>();

        // Creates and adds objects of members to list
        memberList.add(new Member("Søren", "123456-1234", true));
        memberList.add(new Member("Sanne", "654321-4321", false));
        memberList.add(new Member("Hans", "234567-2345", true));
        memberList.add(new Member("Hanne", "765432-5432", false));

        // Prints list
        System.out.println("Name\t\tCPR\t\t\t\tMember Type\t\tFee");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        for (Member m : memberList) {
            System.out.print(m.getName() + "\t\t" + m.getCpr() + "\t\t");
            if(m.isFullMember()){
                System.out.print("Full \t\t\t");
            }else{
                System.out.print("Basic \t\t\t");
            }
            if(m.isFullMember()){
                System.out.print(299 + "\t\n");
            }else{
                System.out.print(199 + "\t\n");
            }
        }
        System.out.println("\n");

        // Prints name and CPR of both employees and members
        System.out.println("Name\t\tCPR");
        System.out.println("- - - - - - - - - - - -");
        for(Employee e : employeeList){
            System.out.println(e.getName() + "\t\t" + e.getCpr());
        }
        for(Member m : memberList){
            System.out.println(m.getName() + "\t\t" + m.getCpr());
        }
    }
}