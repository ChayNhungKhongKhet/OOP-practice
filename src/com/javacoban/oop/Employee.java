package com.javacoban.oop;

import java.util.Scanner;

public abstract class Employee  {
    private String name;
    private String gender;
    private String dob;
    private String address;
    private int id;

    public Employee(String name, String gender, String dob, String address, int id) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.id = id;
    }

    public Employee() {

    }

    public void inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter gender is male or female: ");
        gender = sc.nextLine();
        System.out.println("Enter dob: ");
        dob = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter id: ");
        id = Integer.parseInt(sc.nextLine());
    }
    @Override
    public String toString() {
        return name+" "+gender+" "+dob+" "+address+" "+id;
    }
    public void showInfo(){
        System.out.println(toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
