package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1,n2,n3;
            System.out.println("ENTER THE FIRST number:");
            Scanner s = new Scanner(System.in);
            n1=s.nextInt();
        System.out.println("ENTER THE SECOND number:");
        Scanner s2 = new Scanner(System.in);
        n2=s2.nextInt();
        System.out.println("ENTER THE THIRD number:");
        Scanner s3 = new Scanner(System.in);
        n3=s3.nextInt();
        if (n1 == n2 && n3 == n2)
        {
            System.out.println("All NUMBERS ENTERED ARE EQUAL");
        }else
        {
            System.out.println("ALL NUMBERS ENTERED ARE DIFFERENT");
        }


























    }
}
