package org.level.four;

import java.util.Arrays;

public class Exam4_3 {
    // chua chay duco
    public static void main(String[] args) {
        String[] input = {"programming", "programmer", "program"};
//        String[] input = {"abcdefg", "abcde", "abcdef", "ab", "abc"};
        System.out.println("ket qua: "+ substringLength(input));;
    }

    static int substringLength(String[] input){
        System.out.println(Arrays.toString(arrange(input)));
        String[] newInput = arrange(input);
        char[] smallestWord = newInput[0].toCharArray(); // lay chuoi ngan nhat torng tap hop de so sanh

        int countResult = 0; // so chuoi dai nhat trong tap hop
        for (int i = 0; i < smallestWord.length; i++) {
            int countCurrent = 0;
            //p
            System.out.println("21 : "+smallestWord[i]);
            for (int j = 1; j < input.length; j++) { // duyet qua tat ca cac chuoi trong mang
                char[] charWord = input[j].toCharArray();
                System.out.println("23 : "+Arrays.toString(charWord));

                for (int k = 0; k < charWord.length; k++) { // duyet qua tung ky tu trong tpap hop voi mang ky tu dai nhat
                    System.out.println("27 : "+smallestWord[i] +" "+charWord[k]);
                    if (smallestWord[i] == charWord[k]){ // giong nhau
                        countCurrent+=1;

                    }
                }
            }

            if (countCurrent == input.length){
                countResult +=1;
            }
        }
        return countResult;
    }
    static String[] arrange(String[] input){
        String tam;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[i].compareTo(input[j]) < 0) {
                    tam = input[j];
                    input[j]=input[i];
                    input[i]=tam;
                }
            }
        }
        return input;
    }
}
