package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class Employeewage {
    public static void main(String[] args){
        System.out.println(" Welcome Employee Wage Builder Made By Sunil Bhoi ");
        //Create Random Object and generate 0 or 1 using % operator
        Random random =new Random();
        int empAttendance = random.nextInt()%2;
        //UC 1 Checking for Employee is Present or Absent
        if(empAttendance==0){
            System.out.println("Employee is Absent");
        } else{
            System.out.println("Employee is Present");
        }


    }
}
