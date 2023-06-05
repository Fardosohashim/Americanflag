package Areaofcircle;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();

        int decimal = 0;
        int power = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * Math.pow(8, power);
            power++;
        }

        System.out.println("The decimal representation of " + octal + " is " + decimal);
    }
}
