package com.harsh.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int option=0;

        System.out.print("""
                Remove Duplicates From
                1. Integer Array
                2. String
                Enter your option:""");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            option = Integer.parseInt(br.readLine());
            switch (option){
                case 1-> {
                    System.out.print("Enter array size: ");
                    int size = Integer.parseInt(br.readLine());
                    int[] arr = new int[size];

                    System.out.println("Enter array elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.parseInt(br.readLine());
                    }

                    removeDuplicateArray(arr);
                }
                case 2->{
                    System.out.print("Enter a string: ");
                    String str = br.readLine();

                    removeDuplicateString(str);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void removeDuplicateArray(int [] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }

    private static void removeDuplicateString(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char ch: str.toCharArray()){
            set.add(ch);
        }
        System.out.println(set);

    }
}
