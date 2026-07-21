package com.harsh.org;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr= {2,3,4,5};
        int target = 9;
        int required;

        HashMap<Integer,Integer> map = new HashMap<>(); //Key are numbers , values are index
        for(int i=0;i<arr.length;i++){
            required = target-arr[i];
            if(map.containsKey(required)){
                int index = map.get(required);
                System.out.printf("Required pair is %d and %d ",arr[i],arr[index]);
                return;
            }
            else{
                map.put(arr[i],i);
            }

        }





        //BRUTE FORCE
        for(int i=0;i< arr.length;i++){
            for(int j= i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.printf("Two numbers are %d and %d",arr[i],arr[j]);
                }
            }

        }
    }
}
