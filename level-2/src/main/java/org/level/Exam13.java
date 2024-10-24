package org.level;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exam13 {
    public static void main(String[] args) {
showDuplicate(input());
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu mang: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap gia tri: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        return arr;
    }

    static void showDuplicate(int[] input) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int number : input) {
            // tra ra false neu nhu da co trong mang
            if (!set.add(number)) {
                duplicate.add(number);
            }
        }

        System.out.println("Gia tri trung lap: "+duplicate);
    }
}
