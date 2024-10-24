package org.level;

import java.math.BigDecimal;
import java.util.*;

public class Exam8 {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String,String>> products = new HashMap<>();
        do {
            System.out.println("========Menu===========");
            System.out.println("1. Thêm sản phẩm mới vào danh sách.\n" +
                    "2.Hiển thị danh sách tất cả các sản phẩm.\n" +
                    "3.Tìm thông tin sản phẩm dựa trên mã sản phẩm.\n " +
                    "4.Xóa sản phẩm khỏi danh sách dựa trên mã sản phẩm.\n" +
                    "5.Cập nhật thông tin sản phẩm.\n");
            System.out.println("6. Thoat");
            System.out.println("===========================");
            System.out.println("Nhap chuc nang ban muon: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Nhap so luong san pham muon nhap : ");
                    int number = scanner.nextInt();
                    products = input(number);
                    break;
                }
                case 2: {
                    show(products);
                    break;
                }
                case 3: {
                    System.out.println("Nhap ma san pham : ");
                    String code = scanner.next();

                    Object result = find(code, products);
                    if (result != null) {
                        System.out.println(find(code, products));
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap ma san pham muon xoa: ");
                    String code = scanner.next();
                    Object result = find(code, products);
                    if (result != null) {
                        products.remove(code);
                        System.out.println("Xoa thanh cong");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Nhap ma san pham muon thay doi : ");
                    String code = scanner.next();
                    System.out.println("Nhap thong tin muon thay doi (ten , gia , so luong) : ");
                    scanner.nextLine();
                    String info = scanner.nextLine();
                    System.out.println(info);
                    System.out.println("Nhap gia tri thay doi : ");
                    String value = scanner.nextLine();
                    System.out.println(value);
                    if (products.containsKey(code)){
                        products.get(code).put(info,value);
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

    static Map<String, Map<String,String>> input(int number) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String,String>> products = new HashMap<>();
        for (int i = 0; i < number; i++) {
            Map<String,String> description = new HashMap<>();
            System.out.println("Nhap ma SP : ");
            String code = scanner.next();

            System.out.println("Nhap ten san pham : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            description.put("ten",name);
            System.out.println("Nhap gia: ");
            String price = scanner.next();
            description.put("gia",price);
            System.out.println("Nhap so luong: ");
            String quantity = scanner.next();
            description.put("so luong",quantity);

            products.put(code, description);
        }
        return products;
    }

    static void show(Map<String,Map<String,String>> input) {
        System.out.println(input);
    }

    static Object find(String code, Map<String, Map<String,String>> input) {
            if (input.containsKey(code)) {
                return input.get(code);
            }
        System.out.println("Khong tim thay san pham phu hop");
        return null;
    }
}
