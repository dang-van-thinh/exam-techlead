package org.level.three;

import java.util.Scanner;

public class Exam3_2 {
    public static void main(String[] args) {
        System.out.println(maximum(input()));
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong mang : ");
        int number = scanner.nextInt();

        int[] numberInteger = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap phan tu thu " + i + " trong mang : ");
            int input = scanner.nextInt();
            numberInteger[i] = input;
        }
        return numberInteger;
    }

    static int maximum(int[] input) {
        int max = input[0];
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }
        return max - min;
    }
}
