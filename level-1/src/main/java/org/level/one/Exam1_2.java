package org.level.one;

import java.util.Scanner;

public class Exam1_2 {
    public static void main(String[] args) {
        System.out.println("So luong ky tu trong chuoi : "+countString());
    }
    static int countString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = scanner.next();
        return str.trim().length();
    }
}
