package com.javacoban.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Officer extends Employee {
    private String department;
    private int level;

    public Officer() {
    }

    public Officer(String name, String gender, String dob, String address, int id, String department, int level) {
        super(name, gender, dob, address, id);
        this.department = department;
        this.level = level;
    }

    public double caculateSalary() {
        double salaryOfficer;
        return salaryOfficer = 2.5 * 10e6;
    }


    public void showInfo(ArrayList<Officer> officers) {
        for (Officer off : officers) {
            System.out.println(off.getName() + " " + off.getGender() + " " + off.getDob() + " " + off.getAddress() + " " + off.getId() + " " + off.getDepartment() + " " + off.getLevel());
        }

    }

    public ArrayList<Officer> inputInfo() {
        ArrayList<Officer> officers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter info of officers: ");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter gender male or female: ");
        String gender = sc.nextLine();
        System.out.println("Enter dob: ");
        String dob = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter department: ");
        String department = sc.nextLine();
        System.out.println("Enter level: ");
        int level = sc.nextInt();
        officers.add(new Officer(name, gender, dob, address, id, department, level));
        return officers;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
