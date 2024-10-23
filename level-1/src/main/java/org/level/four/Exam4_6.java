package org.level.four;

import java.util.Arrays;

public class Exam4_6 {
    public static void main(String[] args) {
        int[] input = {-10, -5, 0, 1, 2, 3, 4};
        System.out.println(maximum(input));
    }

    static int maximum(int[] input) {
        // sx
        int[] arr = arrange(input);
        int n = arr.length;

        System.out.println(Arrays.toString(arr));
        int maxNumberPlus = (arr[n - 1] * arr[n - 2] * arr[n - 3]);
        int maxNumberMinus = (arr[0] * arr[1] * arr[n - 1]);
        if (maxNumberMinus > maxNumberPlus) {
            return maxNumberMinus;
        } return maxNumberPlus;
    }

    static int[] arrange(int[] input) {
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[i] < input[j]) {
                    tam = input[j];
                    input[j] = input[i];
                    input[i] = tam;
                }
            }
        }
        return input;
    }
}
