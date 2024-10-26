package org.level.three;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3_3 {
    public static void main(String[] args) {
        // chua duoc
        System.out.println(subLongest(input()));
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

    static int subLongest(int[] input){
        int number = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < input[i-1]){
                input[i]=input[i+1];

            }else {
                i++;
            }
        }
        return input.length;
    }

    // chưa được

}
