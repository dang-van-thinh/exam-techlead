package org.level;

import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        List<Integer> arr = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("========Menu===========");
            System.out.println("1. Them phan tu vao Arraylist");
            System.out.println("2. Hien thi phan tu vao Arraylist");
            System.out.println("3. Tinh tong cua cac phan tu vao Arraylist");
            System.out.println("4. Tim gia tri lớn nhat va be nhat trong Arraylist");
            System.out.println("5. Xoa mot phan tu trong Arraylist");
            System.out.println("6. Kiem tra mot phan tu co trong Arraylist");
            System.out.println("7. Thoat");

            System.out.println("===========================");
            System.out.println("Nhap chuc nang ban muon: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Nhap so phan tu ban muon nhap : ");
                    int number = scanner.nextInt();
                    for (int i = 0; i < number; i++) {
                        System.out.println("Nhap so thu " + i + " : ");
                        int input = scanner.nextInt();
                        arr.add(input);
                    }
                    break;
                }
                case 2: {
                    System.out.println("hien thi: " + arr);
                    break;
                }
                case 3: {
                    System.out.println("Tinh tong : ");
                    int sum = 0;
                    for (Integer number : arr) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                }
                case 4: {
                    Collections.sort(arr);
                    System.out.println("So lon nhat : " + arr.get(arr.size() - 1));
                    System.out.println("So be nhat : " + arr.get(0));
                    break;
                }
                case 5:{
                    System.out.println("Danh sach mang: "+arr);
                    System.out.println("Nhap vi tri phan tu muon xoa : ");
                    int location = scanner.nextInt();
                    if (location > arr.size()){
                        System.out.println("Khoong the xoa");
                        break;
                    }else {
                        arr.remove(location);
                        System.out.println("Danh sach mang: "+arr);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Dien gia tri can kiem tra : ");
                    int value= scanner.nextInt();
                    boolean check = false;
                    for (Integer number: arr) {
                        if (number.equals(value)){
                            check= true;
                        }
                    }
                    if (check){
                        System.out.println("co ton tai");
                    }else {
                        System.out.println("Khong ton tai");
                    }
                    break;
                }
                case 7: {
                    return;
                } default:{
                    System.out.println("Khong co chuc nang phu hop !");
                }
            }

        } while (true);
    }

}
