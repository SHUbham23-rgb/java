package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i =0, j=1,sum = 0,avg = 0;
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        for (i=0;i<5;i++)
        {
            System.out.println("Enter marks of subject:"+j++ );

            array[i] =s.nextInt();
            sum = sum + array[i];
        }
        avg = sum / 5;
        if ( sum >= 80 )
        {
            System.out.println("GRADE A");
        } else if  (sum < 80  && sum >= 60)
        {
            System.out.println("GRADE B");
        }else if ( sum <60  && sum >= 40)
        {
            System.out.println("GRADE C");

        }else
        {
            System.out.println("GRADE D");
        }





    }
}
