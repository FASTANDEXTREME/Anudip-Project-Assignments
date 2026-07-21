package com.harsh.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number");
            num = Integer.parseInt(br.readLine());
            if(checkPrime(num)){
                System.out.print("Number is Prime");
            }
            else{
                System.out.println("Not prime");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkPrime(int x) {
        if (x <= 1) {
            return false;
        }
        int check = (int)Math.floor(Math.sqrt(x));

        for(int i =2; i<=check;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
