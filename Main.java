package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number:");
        int n1 = scan.nextInt();
        System.out.println("enter the second number:");
        Scanner scan1 = new Scanner(System.in);
        int n2 = scan1.nextInt();
        Scanner scan3 = new Scanner(System.in);
        int n3 = scan3.nextInt();

        if (n1 == n2 == n3)
        {
            System.out.println("the numbers entered are equal");

        }
        else if (n1!=n2!=n3)
        {
            System.out.println(" the numbers entered is different");
        }











    }
}
