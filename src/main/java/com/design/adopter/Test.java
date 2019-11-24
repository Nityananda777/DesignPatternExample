package com.design.adopter;

public class Test {
    public static void main(String args[]) {

        PayrollSystem payrollSystem = new PayrollSystemImpl();
        BillingSystem billingSystem = new ThirdPartyBillingSystem();

        Adopter adopter = new EmployeeAdapter(billingSystem);
        System.out.println("HR system passes employee string array to Adapter\n");
        adopter.processCompanySalary(payrollSystem.getEmployees());

    }
}
