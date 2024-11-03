package com.company.java;

import java.util.Scanner;

public class Comparition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenno = 10;
        System.out.println("Given number is 10,Enter the number:");
        int a = sc.nextInt();
        if (givenno > a) {
            System.out.println("The given number is greater");
        } else if (givenno < a) {
            System.out.println("The given number is smaller");
        }
        if (givenno==a){
            System.out.println("the given number is equal");
        }
    }
}