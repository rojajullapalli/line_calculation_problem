package com.roja.length;

import java.util.Scanner;

/**
 * linecomparision program is used to calculate the length of two lines
 * A Length of the first line (x1, y1) and (x2, y2)
 * calculate length of first line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
 * A Length of the second line (a1, b1) and (a2, b2)
 * calculate length of second line = sqrt( (a2 - a1) ^ 2 + (b2 - b1) ^ 2)
 * compare length of both lines are equal or greater or lesser than other
 *
 * @author : roja
 * @version :1.2
 * @since :10-08-2021
 **/
public class Linecomparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner is used to get input from the user
        System.out.println("enter the values of line1 first co-ordinate x1 and y1");
        //enter the first coordinate value for line1
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the value of line1 second co-ordinate x2 and y2");
        //enter the second coordinate value for line1
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length;//variable to store length after calculation
        //A Length as 2 Points (x1, y1) and (x2, y2)
        length= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));//Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
        System.out.println("the calculation of length is " +length);
        System.out.println("enter the values of line2 first co-ordinate a1 and b1");
        //enter the first coordinate value for line2
        int a1= sc.nextInt();
        int b1= sc.nextInt();
        System.out.println("enter the values of line2 second co-ordinate a2 and b2");
        //enter the second coordinate value for line2
        int a2= sc.nextInt();
        int b2= sc.nextInt();
        double length1;//variable to store length after calculation
        //A Length as 2 Points (a1, b1) and (a2, b2)
        length1=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));//Length of a Line = sqrt( (a2 - a1) ^ 2 + (b2 - b1) ^ 2)
        System.out.println("the calculation of length1 is" +length1);
        /**
         * checking length of the both lines are equal ,greater,lesser than other
         */
        if(length == length1)
            System.out.println("length and length1 are equal");
        else if (length > length1)
            System.out.println("length is greater than length1");
        else
            System.out.println("length is greater than length1");
    }
}
