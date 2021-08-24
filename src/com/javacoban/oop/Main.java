package com.javacoban.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Officer officer=new Officer();
        ArrayList<Officer> allOfficers =officer.inputInfo();
        EmployeeManagement employeeManagement =new EmployeeManagement();
        ArrayList<Employee> listEmployee=employeeManagement.addEmployee();
        System.out.println("Enter new object employee: ");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter gender is male or female: ");
        String gender = sc.nextLine();
        System.out.println("Enter dob: ");
        String dob = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter employees want delete:");
        Employee employee=new Employee(name,gender,dob,address,id) {
            @Override
            public String getAddress() {
                return super.getAddress();
            }
        };
        employeeManagement.removeEmployee(listEmployee,(employee));
        System.out.println("Enter name want search");
        String keyWord=sc.nextLine();
        employeeManagement.findEmployee(listEmployee,keyWord);
        employeeManagement.displayInfoOfficers(allOfficers);
        employeeManagement.displayInfoEmployees(listEmployee);
        employeeManagement.quit();
    }
}
