package Areaofcircle;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("The decimal representation of " + binary + " is " + decimal);
    }
}

