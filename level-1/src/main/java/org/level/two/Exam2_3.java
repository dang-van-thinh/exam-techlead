package org.level.two;

import java.util.ArrayList;
import java.util.List;

public class Exam2_3 {
    public static void main(String[] args) {
        String[] input = {"axbycz", "wbxbycz"};
        System.out.println( subString(input));
    }

    static String subString(String[] input) {
        List<List<String>> result = new ArrayList<>();

 // chuyen tung doan  chuoi torng mamg thanh cac chuoi con
        // [a, ab, abc, abcd, abcde, b, bc, bcd, bcde, c, cd, cde, d, de, e]
        for (int k = 0; k < input.length; k++) {
            List<String> sub = new ArrayList<>();
            for (int i = 0; i < input[k].length(); i++) {
                for (int j = i + 1; j <= input[k].length(); j++) {
                    sub.add(input[k].substring(i, j));
                }
            }
            result.add(sub);
        }

        List<String> newResult = new ArrayList<>();
        for (int k = 0; k < result.get(0).size(); k++) {
            for (int j = 0; j < result.get(1).size(); j++) {
                if (result.get(0).get(k).equals(result.get(1).get(j))) {
                    newResult.add(result.get(0).get(k));
                }
            }
        }

        String temp;
        for (int i = 0; i < newResult.size(); i++) {
            for (int j = 0; j < newResult.size(); j++) {
                if (newResult.get(i).length() > newResult.get(j).length()){
                    temp=newResult.get(j);
                    newResult.set(j,newResult.get(i));
                    newResult.set(i,temp);
                }
            }
        }

        System.out.println(newResult);
        System.out.println(result.get(0));
        System.out.println( result.get(1));
        return newResult.get(0);
    }
}