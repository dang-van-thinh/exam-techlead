package org.level.one;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_6 {
    public static void main(String[] args) {
        System.out.println("Sap xep theo thu tu tang dan : "+Arrays.toString(sort(input())));
    }

    static int[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong co trong mang: ");
        int numberOfArray = scanner.nextInt();
        int[] arrStr = new int[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap phan tu thu "+i+" : ");
            int number = scanner.nextInt();
            arrStr[i]= number;
        }
        return arrStr;
    }
    static int[] sort(int[] input){
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i] < input[j]){
                    tam = input[j];
                    input[j]= input[i];
                    input[i]=tam;
                }
            }
        }
        return input;
    }
}
