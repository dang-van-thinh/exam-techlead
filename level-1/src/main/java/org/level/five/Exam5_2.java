package org.level.five;

import java.util.ArrayList;
import java.util.List;

public class Exam5_2 {
    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'd'};
        int target = 3;
chuck(input,target);
    }

    static void chuck(char[] input, int target) {
        List<List<Character>> chaLists = new ArrayList<>();
        List<Character> subList = new ArrayList<>();
        int count = 0;
        while (count < input.length) {

            if (subList.size() == target) {
                chaLists.add(new ArrayList<>(subList));
                subList.clear();
            }
            subList.add(input[count]);
            count++;
        }
        System.out.println(count);

        if (!subList.isEmpty()) {
            chaLists.add(new ArrayList<>(subList));
        }

        System.out.println(chaLists);
    }
}
