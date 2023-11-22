package Day02;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Summation of 2 numbers : " + (num1 + num2));
        System.out.println("substraction of 2 numbers : " + (num1 - num2));
        System.out.println("Multiplication of 2 numbers : " + (num1 * num2));
        System.out.println("Division of 2 numbers : " + (num1 / num2));
        System.out.println("Modulous of 2 numbers : " + (num1 % num2));
    }
}
