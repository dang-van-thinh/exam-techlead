package org.level.four;

import java.util.Arrays;

public class Exam4_7 {
    public static void main(String[] args) {
        String[] input = {"the quick brown fox", "the lazy dog jumps over the fence", "the cat in the hat","ahe cat in the hat"};
        System.out.println(Arrays.toString(action(input)));
    }
// còn case là check theo alpha chữ cái nếu như độ dài 2 chuỗi bằng nhau
    static String[] action(String[] input) {
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[i].length() > input[j].length()) {
                    tam = input[j];
                    input[j] = input[i];
                    input[i] = tam;
                }
            }
        }
        return input;
    }
}
