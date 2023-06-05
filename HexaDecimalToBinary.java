package Areaofcircle;

import java.util.Scanner;

public class HexaDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal value: ");
        String hex = input.nextLine();

        String binary = hexToBinary(hex);

        System.out.println("The binary equivalent of " + hex + " is " + binary);
    }

    public static String hexToBinary(String hex) {
        String binary = "";
        String digits = "0123456789ABCDEF";
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int index = digits.indexOf(c);
            String hexBinary = Integer.toBinaryString(index);
            while (hexBinary.length() < 4) {
                hexBinary = "0" + hexBinary;
            }
            binary += hexBinary;
        }
        return binary;
    }
}
