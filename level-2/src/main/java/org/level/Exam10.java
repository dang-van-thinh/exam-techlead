package org.level;

import java.util.*;

public class Exam10 {
    public static void main(String[] args) {
classify(input());
    }

    static List<Double> input() {
        Scanner scanner = new Scanner(System.in);
        List<Double> points = new ArrayList<>();

        System.out.println("So luong diem can nhap: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap gia tri thu " + i + " : ");
            double point = scanner.nextDouble();
            points.add(point);
        }
        return points;
    }

    static void classify(List<Double> input) {
        Map<String, Integer> count = new HashMap<>();
        count.put("cao", 0);
        count.put("tb", 0);
        count.put("truot", 0);
        for (Double point : input) {
            if (point >= 8) {
                count.put("cao", count.get("cao") + 1);
            }
            if (point >= 5 && point < 8) {
                count.put("tb", count.get("tb") + 1);
            }
            if (point < 5) {
                count.put("truot", count.get("truot") + 1);
            }
        }

        System.out.println(count);
    }
}
