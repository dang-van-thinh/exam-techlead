package org.level.three;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exam3_6 {
    public static void main(String[] args) {
        median(input());
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int[] arrStr1;
        int[] arrStr2;

        System.out.println("Nhap so luong co trong mang 1: ");
        int numberOfArray = scanner.nextInt();
        arrStr1 = new int[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            int number = scanner.nextInt();
            arrStr1[i] = number;
        }

        System.out.println("Nhap so luong co trong mang 2: ");
        int numberOfArray2 = scanner.nextInt();
        arrStr2 = new int[numberOfArray2];

        for (int i = 0; i < numberOfArray2; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            int number = scanner.nextInt();
            arrStr2[i] = number;
        }
        int[] dst = new int[arrStr1.length + arrStr2.length];

        System.arraycopy(arrStr1, 0, dst, 0, arrStr1.length);
        System.arraycopy(arrStr2, 0, dst, arrStr1.length, arrStr2.length);

        System.out.println(Arrays.toString(dst));
        return dst;
    }

    static void median(int[] input) {
        if (input.length % 2 == 0) {
            int locationLeft = (input.length / 2) - 1;
            System.out.println("value left "+input[locationLeft]);
            int locationRight = (input.length / 2);
            System.out.println("location "+locationRight);
            System.out.println("value right "+input[locationRight]);
            float number = (float) (input[locationLeft] + input[locationRight]) / 2;
            System.out.println("So trung vi cua mang la : " + number);
        } else {
            System.out.println("So trung vi cua mang la : " + input[input.length / 2]);
        }

    }
}
