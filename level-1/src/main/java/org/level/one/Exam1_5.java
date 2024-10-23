package org.level.one;

import java.util.Scanner;

public class Exam1_5 {
    public static void main(String[] args) {
        System.out.println("Chuoi ngan nhat: "+shortString(input()));
    }

    static String[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong co trong mang: ");
        int numberOfArray = scanner.nextInt();
        String[] arrStr = new String[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap phan tu thu "+i+" : ");
            String number = scanner.next();
            arrStr[i]= number;
        }
        return arrStr;
    }
    static String shortString(String[] input) {
        String string = input[input.length - 1].trim();
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].length() < string.length()) {
                string = input[i];
            }
        }
        return string;
    }

}
