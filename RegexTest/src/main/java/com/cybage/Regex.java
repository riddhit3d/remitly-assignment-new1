package com.cybage;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an string ");
        String input = scanner.nextLine();

        validateAndCalculateLength(input);
    }

    public static void validateAndCalculateLength(String input) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{7,10}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            int length = input.length();
            System.out.println(input + " is a valid string. Length: " + length);
        } else {
            System.out.println(input + " is not a valid string.");
        }
    }
}