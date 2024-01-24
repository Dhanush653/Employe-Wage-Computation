package com.bridgelabz.wagecomputation;

public static void main(String[] args) {

    int emphr = 0;
    int totalEmpWage = 0;
    int totalWorkingDays = 0;
    while ( emphr <= hours_in_month && totalWorkingDays < working_days) {
        totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
        totalEmpWage += emphr;
        System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +emphr);
    }
    totalEmpWage = emphr * emp_rate_per_hour;
    System.out.println("Total Emp Wage: " + totalEmpWage);
}
}