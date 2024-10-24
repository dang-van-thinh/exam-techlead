package org.level;

import java.util.*;

public class Exam11 {
    public static void main(String[] args) {
menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionaries = new HashMap<>();
        do {
            System.out.println("========Menu===========");
            System.out.println("1. Thêm tu dien mới vào danh sách.\n" +
                    "2.Tra cuu tu dien.\n");
            System.out.println("3. Thoat");
            System.out.println("===========================");
            System.out.println("Nhap chuc nang ban muon: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Nhap tu : ");
                    scanner.nextLine();
                    String word = scanner.nextLine();
                    System.out.println("Dinh nghia cho tu : ");
                    String description = scanner.nextLine();
                    dictionaries.put(word,description);
                    break;
                }
                case 2 :{
                    System.out.println("Nhap tu can tim: ");
                    scanner.nextLine();
                    String key = scanner.nextLine();

                    if (dictionaries.containsKey(key)){
                        System.out.println("Tim thay: "+key+" : "+dictionaries.get(key));
                    }else {
                        System.out.println("Khong tim thay tu phu hop");
                    }
                    break;
                }

                default: {
                    System.out.println("Khong co chuc nang phu hop !");
                    break;
                }
            }
        } while (true);
    }
}
