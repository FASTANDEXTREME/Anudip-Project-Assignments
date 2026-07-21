package com.harsh.org;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecondLargest {
    public static void main(String[] args) {
        int largest;
        int secondLargest= Integer.MIN_VALUE;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter size of Array:");
            int size = Integer.parseInt(br.readLine());
            int [] arr = new int[size];

            for(int i =0;i<arr.length;i++){
                System.out.print("Enter number:");
                arr[i]=Integer.parseInt(br.readLine());
            }

            largest= arr[0];


            for (int i : arr) {
                if (i > largest) {
                    secondLargest = largest;
                    largest = i;

                }
                else if (i> secondLargest && i!=largest){
                    secondLargest=i;
                }

            }
            System.out.print("Largest number is: " +largest);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element.");
            } else {
                System.out.println("Second largest number is: " + secondLargest);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
