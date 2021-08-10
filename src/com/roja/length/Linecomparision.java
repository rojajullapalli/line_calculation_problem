package com.roja.length;

import java.util.Scanner;

/**
 * Linecomparision program is used to calculate the length of line
 * A Length as 2 Points (x1, y1) and (x2, y2)
 * Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
 *
 * @author :roja
 * @version :1.0
 * @since :10-08-2021
 */
public class Linecomparision {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision program");
        Scanner sc=new Scanner(System.in);//scanner is used to get input from the user
        System.out.println("enter the values for x1 and y1");
        //enter the first coordinate value for line1
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the value of x2 and y2");
        //enter the second coordinate value for line1
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length;//variable to store length after calculation
        //A Length as 2 Points (x1, y1) and (x2, y2)
        length= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));//Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
        System.out.println("the calculation of length is " +length);
    }
}

