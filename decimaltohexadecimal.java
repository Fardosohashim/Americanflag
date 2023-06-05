package Areaofcircle;

import java.util.Scanner;

public class decimaltohexadecimal {
    public static void main(String[] args) {
        int decNum, Remainder;
        String HexDec_num = "";

        /* hexadecimal number digits */

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        decNum = in.nextInt();

        while (decNum > 0) {
            Remainder = decNum % 16;
            HexDec_num = hex[Remainder] + HexDec_num;
            decNum = decNum / 16;
        }
        System.out.print("Hexadecimal number is : " + HexDec_num + "\n");
    }
}

