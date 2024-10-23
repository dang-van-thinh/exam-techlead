package org.level.three;

import java.util.Scanner;

public class Exam3_2 {
    public static void main(String[] args) {
        System.out.println(maximum(input()));
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

    static int maximum(int[] input){
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                int operation = input[i] - input[j];
                if ( operation > result){
                    result = operation;
                }
            }
        }
        return result;
    }
}
