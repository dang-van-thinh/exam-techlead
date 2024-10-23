package org.level.one;

import java.util.Scanner;

public class Exam1_1 {
    public static void main(String[] args) {
        System.out.println("Tong hai so : "+sum());
    }
    static int sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b : ");
        int b = scanner.nextInt();

        return a+b;
    }
}
