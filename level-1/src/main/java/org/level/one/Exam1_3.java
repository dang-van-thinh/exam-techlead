package org.level.one;

import java.util.Scanner;

public class Exam1_3 {
    public static void main(String[] args) {
        System.out.println("Binh phuong : "+ square());
    }
    static double square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        double number = scanner.nextDouble();
        return Math.sqrt(number);
    }
}
