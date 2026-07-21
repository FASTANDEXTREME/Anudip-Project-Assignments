package com.harsh.org;

// 01123581321

public class Fibonacci {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int result =0;

        System.out.print(x);
        System.out.print(y);

        for(int i =0;i<12;i++){
            result=x+y;
            System.out.print(result);
            x=y;
            y=result;
        }
    }

}
