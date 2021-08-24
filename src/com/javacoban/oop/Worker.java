package com.javacoban.oop;

import java.util.Scanner;

public class Worker extends Employee{
    private String factory;

    public Worker() {
    }

    public Worker(String name, String gender, String dob, String address, int id, String factory) {
        super(name, gender, dob, address, id);
        this.factory = factory;
    }
    public double caculateSalary(){
        double salaryWorker;
        return  salaryWorker=3*10e6;
    }
    public void showInfo(Worker[] workers){
        for (Worker wk : workers)
        System.out.println(wk.getName()+" "+wk.getGender()+" "+wk.getDob()+" "+wk.getAddress()+" "+wk.getId()+" "+wk.getFactory());
    }
    public Worker[] inputInfo(int n){
        Worker[] workers = new Worker[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Enter info of workers " + (i + 1));
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            System.out.println("Enter gender male or female: ");
            String gender=sc.nextLine();
            System.out.println("Enter dob: ");
            String dob=sc.nextLine();
            System.out.println("Enter address: ");
            String address=sc.nextLine();
            System.out.println("Enter id: ");
            int id=sc.nextInt();
            System.out.println("Enter factory: ");
            String factory=sc.nextLine();
            workers[i]=new Worker(name,gender,dob,address,id,factory);
        }
        return workers;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
