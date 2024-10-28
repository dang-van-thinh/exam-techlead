package org.level.three;

public class Exam3_7 {
    public static void main(String[] args) {
    String input = "GEEG";
    if (palindrome(input)){
        System.out.println(input);
    }else {
        System.out.println("Khong trung");
    }
    }

    static boolean palindrome (String input){
        input= input.replaceAll("\\s+","").toLowerCase();
        int left = 0;
        int right = input.length()-1;
        int count=0;
        while (left<right){
            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
            count++;
        }
        System.out.println(input.length());
        System.out.println(input);
        return true;
    }
}
