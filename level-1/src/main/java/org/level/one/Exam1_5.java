package org.level.one;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_5 {
    public static void main(String[] args) {
        System.out.println("Chuoi ngan nhat: "+shortString(input()));
    }

    static String[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong co trong mang: ");
        int numberOfArray = scanner.nextInt();
        scanner.nextLine();
        String[] arrStr = new String[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap phan tu thu "+i+" : ");
            String string = scanner.nextLine();

            arrStr[i] = string;
        }
        return arrStr;
    }
    static String shortString(String[] input) {
        String stringTam;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i].length() > input[j].length()){
                    stringTam = input[j];
                    input[j]=input[i];
                    input[i]=stringTam;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        return input[0];
    }

}
