package org.level;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam15 {
    public static void main(String[] args) {
        findMaxAndMin(input());
    }

    static Set<Integer> input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu mang: ");
        int number = scanner.nextInt();
        Set<Integer> arrSet = new HashSet<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap gia tri: ");
            int value = scanner.nextInt();
            arrSet.add(value);
        }
        return arrSet;
    }

    static void findMaxAndMin(Set<Integer> input) {
        System.out.println("max "+Collections.max(input));
        System.out.println("min "+Collections.min(input));
    }
}

