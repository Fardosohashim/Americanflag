package Areaofcircle;

import java.util.Scanner;

public class HexadecimaToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = input.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("The decimal equivalent of " + hex + " is " + decimal);
    }
}
