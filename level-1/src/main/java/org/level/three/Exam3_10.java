package org.level.three;

import java.util.Arrays;

public class Exam3_10 {
    public static void main(String[] args) {
        String[] input = {"apple", "banana", "orange", "kiwi", "strawberry"};
arrange(input);
    }

    static void arrange(String[] input){
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i].length() < input[j].length()){
                    tam = input[j];
                    input[j]= input[i];
                    input[i] = tam;
                }
            }
        }

        System.out.println(Arrays.toString(input));
    }
}
