package Day02;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // Relational operators:
        if (num1 == num2) {
            System.out.println("Entered both numbers are equal");
        } else if (num1 != num2) {
            System.out.println("Entered both numbers are not equal");
        }
        if (num1 > num2) {
            System.out.println("Number1 is greater than Number2");
        } else if (num1 >= num2) {
            System.out.println("Number1 is greater than or equals to Number2");
        } else if (num1 < num2) {
            System.out.println("Number1 is less than Number2");
        } else if (num1 <= num2) {
            System.out.println("Number1 is less than or equals to Number2");
        }
    }
}
