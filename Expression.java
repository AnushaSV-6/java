package com.company.java;

import java.util.Scanner;

public class Expression {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for the given expression to find perimeter of rectangle:"+"2(l+b)");


        System.out.print("length in cm:");
        double length=sc.nextDouble();
        System.out.print("breath in cm:");
        double breath=sc.nextDouble();
        double area=2*length+2*breath;
        System.out.println("Result:"+area+"cm");
        
        /// simple another example
        int x=7;
        int a=7*49/7+35/7;
        System.out.println("value of a="+a);




    }
}
