package com.bridgelabz.wagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int full_time = 1;
        int part_time = 2;
        int emp_rate_per_hour = 20;

        int emphr = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() *10) % 2;

        if (empCheck == part_time)
            emphr = 4;
        else if (empCheck == full_time)
            emphr = 8;
        else
            emphr = 1;
        empWage = emphr * emp_rate_per_hour;
        System.out.println("Emp Wage: " + empWage);
    }
}