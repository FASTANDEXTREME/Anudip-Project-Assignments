package com.harsh.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) {
        int option;

        System.out.print("""
                Palindrome of what?
                1. String
                2. Number
                Enter your option:""");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1 -> {
                    System.out.print("Enter the string to check:");
                    String s = br.readLine();
                    if (stringPalindrome(s)) {
                        System.out.println("Its palindrome string");
                    } else {
                        System.out.println("Its not palindrome string");
                    }
                }
                case 2 -> {
                    System.out.print("Enter the number to check:");
                    int num = Integer.parseInt(br.readLine());
                    if (numberPalindrome(num)) {
                        System.out.println("Its palindrome Number");
                    } else {
                        System.out.println("Its not palindrome Number");
                    }
                }
                default -> System.out.println("Not valid option");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean numberPalindrome (int x){
        int temp = x;
        int reversedNumber = 0;

        while (temp != 0) {
            int y = temp % 10;
            reversedNumber = reversedNumber * 10 + y;
            temp /= 10;
        }
        return (reversedNumber==x);
    }

    public static boolean stringPalindrome(String x) {
        int i = 0;
        int j = x.length() - 1;

        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
