package com.company.java;

import java.util.Scanner;

public class CgpaCal {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks scored");
        System.out.println("Enter subject 1:");
        float a=sc.nextFloat();
        System.out.println("Enter subject 2:");
        float b=sc.nextFloat();
        System.out.println("Enter subject 3:");
        float c=sc.nextFloat();
        float cgpa=(a+b+c)/30;
        System.out.println("the Cgpa is :"+cgpa);

    }
}
