package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creates list of employees
        List<Employee> employeeList = new ArrayList<>();

        // Creates objects
        AdministrationPersonnel administrationPersonnel1 = new AdministrationPersonnel();
        AdministrationPersonnel administrationPersonnel2 = new AdministrationPersonnel();
        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor();

        // Modifies objects
        administrationPersonnel1.setName("Johanne");
        administrationPersonnel1.setCpr("223344-5566");

        administrationPersonnel2.setName("Kasper");
        administrationPersonnel2.setCpr("445566-7788");

        instructor1.setName("Jørgen");
        instructor1.setCpr("334455-6677");
        instructor1.setHours(12.5);

        instructor2.setName("Katrine");
        instructor2.setCpr("556677-8899");
        instructor2.setHours(28);

        // Adds objects to list
        employeeList.add(administrationPersonnel1);
        employeeList.add(instructor1);
        employeeList.add(administrationPersonnel2);
        employeeList.add(instructor2);

        // Prints List
        System.out.println("Name\t\tCPR\t\t\t\tHours\t\tSalary\t\tVacation");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(Employee e : employeeList){
            System.out.print(e.getName() + "\t\t" + e.getCpr() + "\t\t");
            if(e instanceof AdministrationPersonnel){
                System.out.print(((AdministrationPersonnel)e).getHours() + "\t\t");
                System.out.print(((AdministrationPersonnel) e).getSalary() + "\t\t");
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
