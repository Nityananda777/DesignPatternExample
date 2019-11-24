package com.design.adopter;

/*
 * Client System which has employee information as String Array
 *
 */

public class PayrollSystemImpl implements  PayrollSystem {

    public String[][] getEmployees() {
        String[][] employees = new String[4][];

        employees[0] = new String[]{"100", "Dave", "Team Leader"};
        employees[1] = new String[]{"101", "Ram", "Developer"};
        employees[2] = new String[]{"102", "Raj", "Developer"};
        employees[3] = new String[]{"103", "Rahul", "Tester"};

        return employees;
    }

}
