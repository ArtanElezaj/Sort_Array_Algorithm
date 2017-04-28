package com.artan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,1,9,4};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] input){
        int temp=0;
        for(int i = 0; i< input.length; i++){
            for(int j = 0; j< input.length-1; j++){
                if(input[j+1]<input[j]){
                    temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return input;
    }
}
