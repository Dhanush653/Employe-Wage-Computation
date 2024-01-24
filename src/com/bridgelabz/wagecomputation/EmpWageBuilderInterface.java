package com.bridgelabz.wagecomputation;

import java.util.List;

public interface EmpWageBuilderInterface {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
   void computeEmpWage();
    List<EmployeeWage> getCompanyEmpWages();
}
