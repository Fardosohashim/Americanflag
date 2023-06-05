package Areaofcircle;

import java.util.Scanner;

public class octualnumber {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String octal = Integer.toOctalString(decimal);

            System.out.println("The octal representation of " + decimal + " is " + octal);
        }
    }

