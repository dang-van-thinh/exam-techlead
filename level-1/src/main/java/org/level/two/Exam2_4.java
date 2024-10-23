package org.level.two;

public class Exam2_4 {
    public static void main(String[] args) {
        int[] input = {1,2,3,15,30};
        System.out.println("Tong cac so chia het cho 3 va 5 : "+sum(input));
    }

    static int sum(int[] input){
        int sum= 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0 && input[i] % 5== 0){
                sum+=input[i];
            }
        }
        return sum;
    }
}
