package org.level.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exam3_3 {
    public static void main(String[] args) {
        int[] intput = {3, 10, 2, 1, 20};
        subLongest(intput);
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong mang : ");
        int number = scanner.nextInt();

        int[] numberInteger = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap phan tu thu " + i + " trong mang : ");
            int input = scanner.nextInt();
            numberInteger[i] = input;
        }
        return numberInteger;
    }

    static void subLongest(int[] input) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> sub = new ArrayList<>();
        // Duyệt qua từng phần tử
        for (int i = 0; i < input.length; i++) {
            if (sub.isEmpty() || input[i] > sub.get(sub.size() - 1)) {
                sub.add(input[i]); // Nếu sub rỗng hoặc phần tử lớn hơn phần tử cuối cùng
            } else {
                // Tìm vị trí để thay thế trong sub
                for (int j = 0; j < sub.size(); j++) {
                    if (input[i] <= sub.get(j)) {
                        sub.set(j, input[i]); // Thay thế với giá trị nhỏ hơn hoặc bằng
                        break; // Thoát vòng lặp
                    }
                }
            }
            // Lưu trạng thái sub vào result
            result.add(new ArrayList<>(sub));
            System.out.println(result);
        }

    }
}