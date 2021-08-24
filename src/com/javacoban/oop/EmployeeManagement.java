package com.javacoban.oop;

import java.util.ArrayList;


public class EmployeeManagement extends Employee{
    public ArrayList<Employee> addEmployee() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        System.out.println("Enter info of employees: ");
        Employee employee = new Employee() {
            @Override
            public void inputEmployee() {
                super.inputEmployee();
            }
        };
        employee.inputEmployee();
        listEmployee.add(employee);
        return listEmployee;
    }

    public ArrayList<Employee> removeEmployee(ArrayList<Employee> listEmployees,Employee employees) {
        for(int i=0;i<listEmployees.size();i++){
            if (listEmployees.get(i).equals(employees)){
                listEmployees.remove(i);
            }
        }
        return listEmployees;
    }

    public void findEmployee(ArrayList<Employee> listEmployee, String keyWord) {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getName().equals(keyWord)) {
                listEmployee.get(i).showInfo();
            } else {
                System.out.println("Null");
            }
        }
    }
    public void displayInfoOfficers(ArrayList<Officer> allOfficers){
        for (Officer dpl:allOfficers){
            System.out.println(dpl.getName()+" "+dpl.getGender()+" "+dpl.getDob()+" "+dpl.getAddress()+" "+dpl.getId()
                    +" "+dpl.getDepartment()+" "+dpl.getLevel());
        }
    }
    public void displayInfoEmployees(ArrayList<Employee> listEmployee){
        for (Employee dpl:listEmployee){
            System.out.println(dpl.getName()+" "+dpl.getGender()+" "+dpl.getDob()+" "+dpl.getAddress()+" "+dpl.getId());
        }
    }
    public void quit(){
        return ;
    }
}