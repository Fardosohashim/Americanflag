package Areaofcircle;

import java.util.Scanner;

public class HexadecimalToOctalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = input.nextLine();

        // Convert the hexadecimal number to decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert the decimal number to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("The octal equivalent of " + hex + " is " + octal);
    }
    }

