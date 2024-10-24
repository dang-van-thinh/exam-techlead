package org.level;

import java.util.*;

public class Exam5 {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(operation(nums1,13)));
    }

    static int[] operation(int[] inputs,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i++) {
            int complete = target - inputs[i];

            if (map.containsKey(complete)) {
                return new int[] { map.get(complete), i };
            }

            map.put(inputs[i],i);
        }
        throw new NullPointerException("Dont");
    }
}
