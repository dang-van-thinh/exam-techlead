package org.level;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exam4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(3);
        integers.add(7);
        System.out.println(plus(integers));
        System.out.println(minus(integers));
    }

    static List<Integer> plus(List<Integer> input){
         Collections.sort(input, Collections.reverseOrder());
         return input;
    }
    static List<Integer> minus(List<Integer> input){
        Collections.sort(input);
        return input;
    }
}
