package org.level.four;

import java.util.Arrays;

public class Exam4_7 {
    public static void main(String[] args) {
        String[] input = {"thinh","dev","hay","ad","a"};
        System.out.println(Arrays.toString(action(input)));
    }

    static String[] action(String[] input) {
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i].length() > input[j].length()) {
                    tam = input[j];
                    input[j] = input[i];
                    input[i] = tam;
                }
            }
        }
        return input;
    }
}
