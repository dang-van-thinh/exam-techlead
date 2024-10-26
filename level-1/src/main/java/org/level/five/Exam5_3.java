package org.level.five;

import java.util.ArrayList;
import java.util.List;

public class Exam5_3 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5,4,4,4,4,2, 4};
        System.out.println(outDuplicate(input));
    }

    static List<Integer> outDuplicate(int[] input){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            boolean check =true;
            for (int j = 0; j < result.size() ; j++) {
                if (input[i] == result.get(j)){
                    check =false;
                }
            }
            if (check){
                result.add(input[i]);
            }
        }
        return result;
    }
}
