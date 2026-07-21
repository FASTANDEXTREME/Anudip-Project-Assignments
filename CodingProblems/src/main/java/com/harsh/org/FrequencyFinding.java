package com.harsh.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FrequencyFinding {
    public static void main(String[] args) {
        int option;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("""
                    Finding Frequency of
                    1. Numbers in array
                    2. Characters in String
                    Your Option:""");
            option = Integer.parseInt(br.readLine());

            switch (option){
                case 1 ->{
                    System.out.print("Enter the size of array:");
                    int num = Integer.parseInt(br.readLine());
                    int[] oa = new int[num];
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter number for Index " + i + ":");
                        oa[i] = Integer.parseInt(br.readLine());
                    }
                    arrayFrequency(oa);
                }

                case 2 ->{
                    System.out.print("Enter the string:");
                    String s = br.readLine();
                    stringFrequency(s);


                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void arrayFrequency(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println("Element "+e.getKey()+": "+e.getValue());
        }
    }


    public static void stringFrequency(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println("Element "+e.getKey()+": "+e.getValue());
        }
    }
}
