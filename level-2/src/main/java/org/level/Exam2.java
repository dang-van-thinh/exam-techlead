package org.level;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam2 {
    public static void main(String[] args) {
menu();
    }

    static void menu(){
        Set<String> countrySet = new HashSet<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("========Menu===========");
            System.out.println("1. Thêm các tên quốc gia vào HashSet");
            System.out.println("2. Hiển thị danh sách các quốc gia đã thêm vào");
            System.out.println("3. Kiểm tra xem một quốc gia có tồn tại trong HashSet hay không.");
            System.out.println("4. Xóa một quốc gia cụ thể khỏi HashSet");
            System.out.println("5. Tính số lượng các quốc gia có trong HashSet");
            System.out.println("6. Thoat");
            System.out.println("===========================");
            System.out.println("Nhap chuc nang ban muon: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1: {
                    System.out.println("Nhap so luong quoc gia ban muon them vao: ");
                    int number = scanner.nextInt();

                    for (int i = 0; i < number-1; i++) {
                        System.out.println("Nhap quoc gia so "+i+" : ");
                        String name= scanner.next();
                        countrySet.add(name.toLowerCase());
                    }
                    break;
                }
                case 2:{
                    System.out.println("Hien thi: "+countrySet);
                    break;
                }
                case 3: {
                    System.out.println("Nhap ten quoc gia ban muon tim: ");
                    String name = scanner.next();

                    if (countrySet.contains(name.toLowerCase())){
                        System.out.println("Ten quoc gia co ton tai !");
                    }else {
                        System.out.println("Ten quoc gia khong ton tai !");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Nhap ten quoc gia can xoa : ");
                    String name = scanner.next();
                    countrySet.remove(name);
                    break;
                }
                case 5:{
                    System.out.println("So quoc gia co o trong danh sach "+countrySet.size());
                    break;
                }
                case 6:{
                    return;
                }
            }
        }while (true);
    }
}

