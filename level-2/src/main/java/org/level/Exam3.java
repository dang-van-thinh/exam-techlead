package org.level;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
menu();
    }
    static void menu(){
        Map<String,Integer> person = new HashMap<>();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("========Menu===========");
            System.out.println("\n" +
                    "1.Thêm các cặp key-value vào HashMap.\n" +
                    "2.Hiển thị danh sách tên của tất cả các người trong HashMap.\n" +
                    "3.Tìm tuổi của một người dựa trên tên của họ.\n" +
                    "4.Xóa một người cụ thể khỏi HashMap.\n" +
                    "5.Kiểm tra xem một người có tồn tại trong HashMap hay không.\n" +
                    "6.Thoát \n"
            );
            System.out.println("===========================");
            System.out.println("Nhap chuc nang ban muon: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:{
                    System.out.println("Nhap so luong nguoi ban muon nhap : ");
                    int number = scanner.nextInt();

                    for (int i = 0; i < number; i++) {
                        System.out.println("Nhap ten : ");
                        String name = scanner.next();
                        System.out.println("Nhap tuoi: ");
                        int age = scanner.nextInt();

                        person.put(name,age);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Danh sach nguoi: "+person);
                    break;
                }
                case 3:{
                    System.out.println("Nhap ten de hien thi tuoi : ");
                    String name = scanner.next();
                    if (person.containsKey(name)){
                        System.out.println("Tuoi "+person.get(name));
                    }else {
                        System.out.println("ten khong ton tai");
                    }

                    break;
                }
                case 4:{
                    System.out.println("Nhap ten de xoa : ");
                    String name = scanner.next();
                    person.remove(name);
                    System.out.println(person);
                    break;
                }
                case 5:{
                    System.out.println("Nhap ten de kiem tra : ");
                    String name = scanner.next();
                    if (person.containsKey(name)){
                        System.out.println("Co nhes");
                    }else {
                        System.out.println("Khong co dau");
                    }
                    break;
                }
                case 6: {
                    return;
                }
            }
        }while (true);
    }
}
