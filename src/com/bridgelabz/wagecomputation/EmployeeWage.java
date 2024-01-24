package com.bridgelabz.wagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int full_time = 1;
        int emp_rate_per_hour = 20;
        int emphr = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() *10) % 2;

        int wage = emp_rate_per_hour * 8;
        System.out.println(wage);

        if (empCheck == full_time)
            System.out.println("Present");
        else
            System.out.println("Absent");
    }
}
