package org.level.one;

import java.util.Scanner;

public class Exam1_4 {
    public static void main(String[] args) {
        System.out.println("So lon nhat trong mang : "+numberMax(input()));
    }
    static int[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong co trong mang: ");
        int numberOfArray = scanner.nextInt();
            int[] arr = new int[numberOfArray];

            for (int i = 0; i < numberOfArray; i++) {
                System.out.println("Nhap so thu "+i+" : ");
                int number = scanner.nextInt();
                arr[i]= number;
            }
            return arr;
    }
    static int numberMax(int[] input){
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i] > input[j]){
                    tam = input[i];
                    input[i]= input[j];
                    input[j]=tam;
                }
            }
        }
        return input[0];
    }
}
