package org.level.one;

import java.util.Scanner;

public class Exam1_9 {
    public static void main(String[] args) {
        System.out.println("So tu : "+countString(input()));
    }

    static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        return scanner.nextLine();
    }

    static int countString(String input){
        if (!input.trim().isEmpty()){
            int count = 1;
            for (int i = 0; i < input.trim().length(); i++) {
                if ( input.trim().charAt(i) == ' '){
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
