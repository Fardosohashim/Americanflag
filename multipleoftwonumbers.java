package Areaofcircle;

public class multipleoftwonumbers {
    public static void main(String[] args) {
        String binary1 = "10";
        String binary2 = "11";
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        int product = decimal1 * decimal2;
        //String binaryProduct="Binary of two numbers :";
        //System.out.println(binaryProduct);
        System.out.println("product of binary number is: "+ Integer.toBinaryString(product));
    }


}
