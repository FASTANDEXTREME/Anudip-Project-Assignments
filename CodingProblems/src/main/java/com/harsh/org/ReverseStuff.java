package com.harsh.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseStuff {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("1. Reverse String");
            System.out.println("2. Reverse Character");
            System.out.println("3. Reverse Number");
            System.out.println("4. Reverse Array");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter the String to be reversed: ");
                    String st = br.readLine();
                    String rs = stringReverse(st);
                    System.out.println("Reversed String is: " + rs);
                }
                case 2 -> {
                    System.out.print("Enter the String whom characters is to be reversed: ");
                    String st = br.readLine();
                    String cr = charReverse(st);
                    System.out.println("Reversed String is: " + cr);
                }

                case 3 -> {
                    System.out.print("Enter the Number to be reversed: ");
                    int num = Integer.parseInt(br.readLine());
                    int rev = numberReverse(num);
                    System.out.println("Reversed Number is: " + rev);
                }
                case 4 -> {
                    System.out.print("Enter the size of array:");
                    int num = Integer.parseInt(br.readLine());
                    int[] oa = new int[num];
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter number for Index " + i + ":3");
                        oa[i] = Integer.parseInt(br.readLine());
                    }
                    System.out.println("Reversed array is:");
                    oa = arrayReverse(oa);
                    for (int numbers : oa) {
                        System.out.print(numbers + " ");
                    }


                }

                default -> System.out.println("Invalid Choice!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String charReverse(String x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            sb.append(x.charAt(i));
        }
        return sb.toString();

    }

    public static String stringReverse(String x) {
        StringBuilder sb = new StringBuilder();
        String[] words = x.split(" +");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static int numberReverse(int x) {
        int reversedNumber = 0;
        int y = x;
        while (y != 0) {
            int temp = y % 10;
            reversedNumber = reversedNumber * 10 + temp;
            y = y / 10;
        }
        return reversedNumber;
    }

    public static int[] arrayReverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp;

        while (j > i) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

}


