package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class Employeewage {

    int working_day = 0;
    int working_hrs = 0;
    int total_wage = 0;
    Random random = new Random();

    public void getemployee (){
                //UC-5-Calculate Wage For A Month
        while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_day < Constants.WORKING_DAY) {
                       working_day++;
            System.out.println("Day=" + working_day);
            int empAttendance = random.nextInt() % 2;
            //UC 1 Checking for Employee is Present or Absent
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                //UC-3-Employee Work Part Time Or Full Time
                int emp_type = random.nextInt() % 2;
                if (emp_type < 0) {
                    emp_type = -emp_type;
                }
                //UC-4-Solving Using Switch Case Statement
                switch (emp_type) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employye is Part Time");
                        total_wage = total_wage+(Constants.WAGE_PER_HR * Constants.PART_TIME_HR);
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee Is Full Time");
                        total_wage = total_wage +(Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;

                }
            }
        }
    }
    public void setwage ()
    {
        System.out.println("Total Wage=" + total_wage);
        System.out.println("Total Working Hrs" + working_hrs);
    }


    public static void main(String[] args) {
        // Welcome Message for User
        Employeewage emp = new Employeewage();
        emp.getemployee();
        emp.setwage();
        }
    }

