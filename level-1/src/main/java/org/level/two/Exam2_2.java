package org.level.two;

public class Exam2_2 {
    public static void main(String[] args) {
        String[] input = {"hello", "report","da","sahdjshjahd"};
        System.out.println( stringLongest(input));
    }

    static String stringLongest (String[] input) {
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[i].compareTo(input[j]) > 0) {
                    tam = input[j];
                    input[j]=input[i];
                    input[i]=tam;
                }
            }
        }
        return input[0];
    }
}
