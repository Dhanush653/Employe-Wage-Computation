package com.bridgelabz.wagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int full_time = 1;
        double empCheck = Math.floor(Math.random() *10) % 2;

        if (empCheck == full_time)
            System.out.println("Present");
        else
            System.out.println("Absent");
    }
}
