package Areaofcircle;

import java.util.Scanner;

public class convertIntegerToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to convert into a binary");
        int num= sc.nextInt();
        System.out.println("Binary Number is: "+ Integer.toBinaryString(num));


    }
}
