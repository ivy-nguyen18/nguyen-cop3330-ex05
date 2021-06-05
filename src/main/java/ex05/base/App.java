/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex05.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String x = input.nextLine();
        int n1 = Integer.parseInt(x);

        System.out.print("What is the second number? ");
        String y = input.nextLine();
        int n2 = Integer.parseInt(y);

        Calculations answer = new Calculations(n1,n2);


        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",
                n1, n2, answer.addition(n1,n2),
                n1, n2, answer.subtraction(n1,n2),
                n1, n2, answer.multiplication(n1,n2),
                n1, n2, answer.division(n1,n2));

    }
}
