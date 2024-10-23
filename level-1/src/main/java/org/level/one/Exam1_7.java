package org.level.one;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(output(input())));
    }

    static String[] input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so luong chuoi trong mang : ");
        int number = scanner.nextInt();
        String[] arrStr = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Nhap chuoi vao mang : ");
            String str = scanner.next();
            arrStr[i] = str;
        }
        return arrStr;
    }

    static String[] output(String[] input){
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i].compareTo(input[j]) < 0){
                    tam = input[j];
                    input[j]= input[i];
                    input[i]=tam;
                }
            }
        }
        return input;
    }

}
