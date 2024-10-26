package org.level.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam5_4 {
    public static void main(String[] args) {
        // chua xong
outDuplicate();
    }

    static void outDuplicate(){
        List<Map<Character,Integer>> inputs = new ArrayList<>();
         inputs.add(new HashMap<Character,Integer>('x',1));
         inputs.add(new HashMap<Character,Integer>('x',2));
         inputs.add(new HashMap<Character,Integer>('y',1));

        for (Map<Character,Integer> input: inputs) {
           String key = input.toString();

        }

    }
}
