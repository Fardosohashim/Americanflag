package Areaofcircle;

import java.util.Scanner;

public class binaryoftwonumbers {
    public static void main(String[] args) {
       // int inputFirstBinaryNumber = 10;
        //int inputSecondBinaryNumber = 11;
          Scanner sc =new Scanner(System.in);

          System.out.println("Enter the First binary Number: ");
          String x = sc.next();//10

          System.out.println("Enter the second Number: ");
          String y = sc.next();//11

          //used to parse the String value as signed decimal value
        //Radix is the parameter that specifies the number system to be used example(binary of two number )
       int n1 =Integer.parseInt(x,2);
       int n2= Integer.parseInt(y,2);
        int n3=n1+n2;
// convert the numeric value between different bases

        System.out.println("n1 : "+ Integer.toBinaryString(n1));
        System.out.println("n2 : "+ Integer.toBinaryString(n2));
        System.out.println("n3 = n1+n2 : "+ Integer.toBinaryString(n3));

    }
}
