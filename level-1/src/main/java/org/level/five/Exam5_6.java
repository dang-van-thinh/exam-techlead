package org.level.five;

public class Exam5_6 {
    public static void main(String[] args) {
String input = "    helloo    wwooo  sad";
        System.out.println(trimAll(input));
    }

    static String trimAll(String input){
        return input.trim().replaceAll("\\s+"," ");
    }
}
