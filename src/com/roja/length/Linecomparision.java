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
 * @version :1.3
 * @since :10-08-2021
 **/
class linecmp{
    private double x1,y1,x2,y2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
public class Linecomparision {
    public static  double calculate_length(double x1,double y1,double x2,double y2) {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }
    static void compare(double length1, double length2) {
        if (length1 == length2)
            System.out.println("length1 is equal to length2");
        else if (length1 > length2)
            System.out.println("length1 is greater than length2");
        else
            System.out.println("length1 is shorter than length2");
    }

    public static void main(String[] args) {
        linecmp l1=new linecmp();
        l1.setX1(5);
        l1.setX2(6);
        l1.setY1(3);
        l1.setY2(6);
        System.out.println(" x1 is =" + l1.getX1()+" x2 is = " +l1.getX2()+" y1 = "+l1.getY1()+" y2 = "+l1.getY2());
        linecmp l2=new linecmp();
        l2.setX1(3);
        l2.setX2(7);
        l2.setY1(6);
        l2.setY2(7);
        System.out.println(" x1 is =" + l2.getX1()+" x2 is = " +l2.getX2()+" y1 = "+l2.getY1()+" y2 = "+l2.getY2());
        double length1=calculate_length(l1.getX1(),l1.getY1(),l1.getX2(),l1.getY2());
        System.out.println("line1 = " +length1);
        double length2=calculate_length(l2.getX1(),l2.getY1(),l2.getX2(),l2.getY2());
        System.out.println("line2 = " +length2);
        compare(length1,length2);
    }
}
