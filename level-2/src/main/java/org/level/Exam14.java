package org.level;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam14 {
    public static void main(String[] args) {
group();
    }

    static void group(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu mang 1: ");
        int number1 = scanner.nextInt();
        int[] arr1 = new int[number1];
        for (int i = 0; i < number1; i++) {
            System.out.println("Nhap gia tri: ");
            int value = scanner.nextInt();
            arr1[i] = value;
        }

        System.out.println("Nhap so luong phan tu mang 2: ");
        int number2 = scanner.nextInt();
        int[] arr2 = new int[number2];
        for (int i = 0; i < number2; i++) {
            System.out.println("Nhap gia tri: ");
            int value = scanner.nextInt();
            arr2[i] = value;
        }

        findDuplicate(arr1,arr2);
    }

    static void findDuplicate(int[] arr1 , int[] arr2){
        Set<Integer> setArr1 = new HashSet<>();
        Set<Integer> setArr2 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            setArr1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            setArr2.add(arr2[i]);
        }
        setArr1.retainAll(setArr2);
        System.out.println(setArr1);
        if (setArr1.isEmpty()){
            System.out.println("Khong co phan tu nao trung ");
        }else {
            System.out.println("Co phan tu trung "+setArr1);
        }
    }
}
