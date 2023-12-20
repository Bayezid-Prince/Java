package sqa_Intern_Qtec;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        // Calling the reverseString method and print the result
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
    // Method to reverse a string using StringBuilder
    private static String reverseString(String input) {
        // Use StringBuilder to efficiently build the reversed string
        return new StringBuilder(input).reverse().toString();
    }
}
