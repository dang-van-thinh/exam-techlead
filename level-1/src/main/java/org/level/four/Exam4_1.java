package org.level.four;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4_1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] input) {
        int tam;
        int dem = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[i] > input[j+1]) {
                    tam = input[ j + 1 ];
                    input[j+1] = input[j];
                    input[j] = tam;
                    dem++;
                }
            }
        }
        System.out.println(dem);
        return input;
    }

}
