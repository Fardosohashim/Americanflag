package Areaofcircle;

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        String octalNum, hexNum;
        int DecNum;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        octalNum = in.nextLine();

        DecNum = Integer.parseInt(octalNum, 8);
        hexNum = Integer.toHexString(DecNum);

        System.out.print("Equivalent hexadecimal number: "+ hexNum+"\n");
    }
    }

