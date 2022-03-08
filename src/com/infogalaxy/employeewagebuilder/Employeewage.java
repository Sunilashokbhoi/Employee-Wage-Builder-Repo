package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class Employeewage {
    public static void main(String[] args) {
        // Welcome Message for User
        System.out.println(" Welcome Employee Wage Builder Made By Sunil Bhoi ");
        //UC-2 Calculate Daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        int total_wage = 0;
        Random random = new Random();
        int empAttendance = random.nextInt() % 2;
        //UC 1 Checking for Employee is Present or Absent
        if (empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            //UC-3-Employee Work Part Time Or Full Time
            int emp_type = random.nextInt() % 2;
            if (emp_type == 0) {
                System.out.println("Employye is Part Time");
                total_wage = WAGE_PER_HR * PART_TIME_HR;
            } else {
                System.out.println("Employee Is Full Time");
                total_wage = WAGE_PER_HR * FULL_TIME_HR;
            }
        }
        System.out.println("Total Wage=" + total_wage);
    }
}
