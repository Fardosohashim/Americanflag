package Areaofcircle;

import java.util.Scanner;

public class BinaryTOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);

        System.out.println("The octal representation of " + binary + " is " + octal);
    }
}
