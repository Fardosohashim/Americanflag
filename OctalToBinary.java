package Areaofcircle;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter an octal number: ");
        String octal = input.nextLine();

        String binary = "";

        for (int i = 0; i < octal.length(); i++) {
            int digit = octal.charAt(i) - '0';
            String binaryDigit = Integer.toBinaryString(digit);
            while (binaryDigit.length() < 3) {
                binaryDigit = "0" + binaryDigit;
            }
            binary += binaryDigit;
        }

        System.out.println("The binary representation of " + octal + " is " + binary);
    }

}