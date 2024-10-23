package org.level.two;

import java.util.Arrays;

public class Exam2_1 {
    public static void main(String[] args) {
int[] input = {70, 11, 20, 4, 100};
        System.out.println(numberSecond(input));
    }

    static int numberSecond(int[] input){
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length -1; j++) {
                if (input[i] > input[j]){
                    tam = input[j];
                    input[j]=input[i];
                    input[i]=tam;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        return input[1];
    }
}
