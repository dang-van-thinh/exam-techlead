package org.level.one;

import java.util.Scanner;

public class Exam1_10 {
    public static void main(String[] args) {
        System.out.println("So luong phan tu co chu cai 'a' la: "+countKeyA(input()));
    }

    static String[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang: ");
        int numberOfArray = scanner.nextInt();

        String[] arrStr = new String[numberOfArray];

        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Nhap gia tri phan tu thu "+i+" ");
            String str = scanner.next();
            arrStr[i]=str;
        }
        return arrStr;
    }

    static int countKeyA(String[] input){
        int count=0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == 'a'){
                    count++;
                    i++;
                }
            }
        }
        return count;
    }

}
