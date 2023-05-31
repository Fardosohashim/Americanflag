package Areaofcircle;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("the first number: ");
        double A = in.nextDouble();

        System.out.print("the second number: ");
        double B = in.nextDouble();

        System.out.print("the third number: ");
        double C = in.nextDouble();

        System.out.print("The average value is " + average(A, B, C)+"\n" );
    }

    public static double average(double A, double B, double C)
    {
        return (A + B + C) / 3;
    }
}


