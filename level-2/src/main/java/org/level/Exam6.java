package org.level;

import java.util.HashMap;
import java.util.Map;

public class Exam6 {
    public static void main(String[] args) {
        int[]prices = {7,1,2,3,1,2};
        System.out.println(price(prices));
    }

    static int price(int[] prices){
        int price = 0;
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (prices[i] - prices[j] > price ){
                    price = prices[i]- prices[j];
                }
            }
        }
        return price;
    }
}
