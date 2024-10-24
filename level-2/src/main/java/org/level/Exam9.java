package org.level;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
count();
    }

    static void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap : ");
        String input = scanner.nextLine();

        String[] text = input.toLowerCase().trim().split("\\W+");

        System.out.println(Arrays.toString(text));
        Map<String, Integer> count = new HashMap<>();

        for (String word: text) {
            if(count.containsKey(word)){
                count.put(word,count.get(word)+1);
            }else {
                count.put(word,1);
            }
        }

        count.forEach((s, integer) -> System.out.println(s+" "+integer));

    }


}
