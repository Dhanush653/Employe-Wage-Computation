package com.bridgelabz.wagecomputation;

public class EmployeeWage {
    public static final int part_time = 1;
    public static final int full_time = 2;
    public static final int emp_rate_per_hour = 20;
    public static final int working_days = 2;

    public static void main(String[] args) {

        int emphr = 0;
        int empWage = 0;
        totalEmpWage = 0;
        for (int day =0; day< working_days;day++)
            int empCheck =(int) Math.floor(Math.random() *10) % 3;
        switch (empCheck) {
            case part_time:
                emphr = 4;
                break;
            case full_time:
                emphr = 8;
                break;
            default:
                emphr = 1;
        }
        empWage = emphr * emp_rate_per_hour;
        totalEmpWage += empWage;
        System.out.println("Emp Wage: " + empWage);
    }
    System.out.println("Total Emp Wage: " + totalEmpWage);
}