package com.harsh.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingNumber {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                    System.out.print("Enter array size: ");
                    int size = Integer.parseInt(br.readLine());
                    int[] arr = new int[size];

                    System.out.println("Enter array elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.parseInt(br.readLine());
                    }
                    findMissing(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findMissing(int[] arr) {
        int result=0;

        for(int i = arr.length+1; i>=0;i--){
            result +=i;
        }

        int actual=0;
        for(int num: arr){
            actual+=num;
        }

        int missing = result-actual;
        System.out.println("Missing Number is: "+missing);
    }


}
