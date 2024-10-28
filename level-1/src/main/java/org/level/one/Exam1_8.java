package org.level.one;

import java.util.Scanner;

public class Exam1_8 {
    public static void main(String[] args) {
        median(input());
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong co trong mang: ");
        int numberOfArray = scanner.nextInt();
        int[] arrStr = new int[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            int number = scanner.nextInt();
            arrStr[i] = number;
        }
        return arrStr;
    }

    static int[] arrange(int[] input){
        int tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i] < input[j]){
                    tam = input[j];
                    input[j]=input[i];
                    input[i]=tam;
                }
            }
        }
        return input;
    }

    // trung vi :
    // neu so luong phan tu le thi se co gia tri o vi tri phan tu la o giua , chia doi deu
    // neu so luong phan tu chan thi se la tong hai gia tri o giua / 2
    static void median(int[] inputArr) {
        int[] input=arrange(inputArr);
        if (input.length % 2 == 0) {
            int locationLeft = (input.length / 2) - 1;
            System.out.println("value left " + input[locationLeft]);
            int locationRight = (input.length / 2);
            System.out.println("location " + locationRight);
            System.out.println("value right " + input[locationRight]);
            float number = (float) (input[locationLeft] + input[locationRight]) / 2;
            System.out.println("So trung vi cua mang la : " + number);
        } else {
            System.out.println("So trung vi cua mang la : " + input[input.length / 2]);
        }
    }
}
