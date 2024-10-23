package org.level.three;

import java.util.Arrays;

public class Exam3_5 {
    public static void main(String[] args) {
        int[] numbers = {5,1, 2, 3, 7, 8, 20};
        System.out.println(smallest(numbers));
    }

    static int smallest(int[] input){
        Arrays.sort(input);
            int smallNumber = 1;
        for (int num:input) {
            if (smallNumber < num){
                break;
            }
            smallNumber+=num;
        }
return smallNumber;
    }
}
