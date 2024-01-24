package com.bridgelabz.wagecomputation;
public interface EmpWageBuilderInterface {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();

}
