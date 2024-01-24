package com.bridgelabz.wagecomputation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;
    private List<Integer> dailyWageList;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.dailyWageList = new ArrayList<>();
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public void addDailyWage(int dailyWage) {
        this.dailyWageList.add(dailyWage);
    }

    public List<Integer> getDailyWageList() {
        return dailyWageList;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is " + totalEmpWage;
    }
}
