package org.level.two;

public class Exam2_5 {
    public static void main(String[] args) {
int[] input =  {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Tong cac mang con co gia tri to nhat : "+subSum(input));
    }

    static int subSum(int[] input){
        int subSum = 0,valueCurrent = 0;;
        for (int i = 0; i < input.length; i++) {
            valueCurrent = valueCurrent + input[i];
            if ( valueCurrent > subSum){
                subSum = valueCurrent;
            }
            if (valueCurrent < 0){
                valueCurrent = 0;
            }
        }
        return subSum;
    }
}
