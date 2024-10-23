package org.level.three;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3_1 {
    public static void main(String[] args) {
        System.out.println(secondSmall(input()));
    }

    static int[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong mang : ");
        int number = scanner.nextInt();

        int[] numberInteger = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap phan tu thu "+i+" trong mang : ");
            int input = scanner.nextInt();
            numberInteger[i]=input;
        }
        return numberInteger;
    }

    static int secondSmall(int[] input){
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length -1; j++) {
                if (input[i] < input[j]){
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
