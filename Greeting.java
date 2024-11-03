
// Basic greeting Message

package com.company.java;
import java.util.Scanner;

public class Greeting {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.next();
        System.out.println("Enter your Gender:");
        String gender=sc.next();
        System.out.println("hello "+name+",have a good day!!");
    }
}
