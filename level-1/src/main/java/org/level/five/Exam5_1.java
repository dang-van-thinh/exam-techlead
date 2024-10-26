package org.level.five;

import java.util.Arrays;

public class Exam5_1 {
    public static void main(String[] args) {
        int[]input = {1,4,6,3,8,3};
        System.out.println(Arrays.toString(reverses(input)));
    }
    
    static int[] reverses(int[] input){
        int left = 0;
        int right = input.length -1;

        int tam;
        while (left<right){
                tam = input[left];
                input[left]=input[right];
                input[right]=tam;
            left++;
            right--;
        }
        return input;
    }
}
