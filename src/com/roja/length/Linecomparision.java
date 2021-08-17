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

public class Linecomparision {

    public static  double calculate_length(double x1,double y1,double x2,double y2) {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    public static double compareTo(double length1, double length2) {
        if (length1 == length2)
            return 0;
        else if (length1 > length2)
            return 1;
        else
            return -1;
    }

    public static double comparision(double comparator){
        if (comparator==0)
            System.out.println("length1 is equal to length2");
        else if (comparator==1)
            System.out.println("length1 is greater than length2");
        else
            System.out.println("length1 is lesser than legth2");
        return comparator;
    }

    public static double getInput(){
        inputLineComparision line1=new inputLineComparision();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the x1,y1,x2,y2 coordinate values for line1");
        line1.setX1 (input.nextInt());
        line1.setY1 (input.nextInt());
        line1.setX2 (input.nextInt());
        line1.setY2 (input.nextInt());
        System.out.println(" x1 is =" + line1.getX1()+" x2 is = " +line1.getX2()+" y1 = "+line1.getY1()+" y2 = "+line1.getY2());

        inputLineComparision line2=new inputLineComparision();
        System.out.println("enter the x1,y1,x2,y2 coordinate values for line2");
        line2.setX1 (input.nextInt());
        line2.setY1 (input.nextInt());
        line2.setX2 (input.nextInt());
        line2.setY2 (input.nextInt());
        System.out.println(" x1 is =" + line2.getX1()+" x2 is = " +line2.getX2()+" y1 = "+line2.getY1()+" y2 = "+line2.getY2());

        double length1 = calculate_length(line1.getX1(), line1.getY1(), line1.getX2(), line1.getY2());
        System.out.println("length for line1 = " +length1);

        double length2 = calculate_length(line2.getX1(), line2.getY1(), line2.getX2(), line2.getY2());
        System.out.println("length for line2 = " +length2);


        double comparator=compareTo(length1,length2);
        comparision(comparator);
        return comparator;
    }
    public static void main(String[] args) {
        getInput();
    }
}
