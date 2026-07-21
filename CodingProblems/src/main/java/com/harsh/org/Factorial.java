package com.harsh.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Number whos Factorial you want:");
            int num = Integer.parseInt(br.readLine());
            int result=1;

            for(int i=2;i<=num;i++) {
                result *=i;

            }
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
