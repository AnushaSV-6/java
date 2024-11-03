package com.company.java;

import java.util.Scanner;

public class Converter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Kilometer you want to convert:");
        float km=sc.nextFloat();
        double conv=(km*0.621371)/1;
        System.out.println("The converted value is:");
        System.out.println(conv+"miles");
    }
}
