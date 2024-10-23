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
        for (int i = 1; i < input.length; i++) {
            boolean check = false;
            for (int j = 0; j < input.length - 1; j++) {
                if (input[i] < input[j]) {
                    tam = input[j];
                    input[j] = input[i];
                    input[i] = tam;
                    check = true;
                }
            }
            if (check) {
                dem++;
            } else {
                break;
            }
        }
        System.out.println(dem);
        return input;
    }

}
