package org.level.three;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3_3 {
    public static void main(String[] args) {
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
        int[] newArr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            newArr[i] =1;
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i] < input[j]){
                    input[i]= Math.max(newArr[i],newArr[j])+1;
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < input.length; i++) {
            maxLength=  Math.max(maxLength,newArr[i]);
        }

        System.out.println(Arrays.toString(input));
        return maxLength;
    }

    // chưa được

}
