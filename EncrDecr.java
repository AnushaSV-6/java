package com.company.java;

public class EncrDecr {
    public static void main(String[]args){
     char grade='B';
        System.out.println("B was the actual grade, after Encrypting...");
     grade=(char)(grade+8);  //casting
        System.out.println(grade);

        //decrypting
        grade=(char)(grade-8);
        System.out.println("After decrypting...The original Grade is");
        System.out.println(grade);
    }
}
