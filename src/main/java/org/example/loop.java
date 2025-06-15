package org.example;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
//        System.out.println("hello World");
        //        System.out.println("hello World");
        //        System.out.println("hello World");
        //        System.out.println("hello World");
        //        System.out.println("hello World");

//        vòng lặp While
//        giá trị ban đầu
//                while(điểu kiện){
//                    thực hiện logic
//
//                    thay đổi giá trị ban đầu
//        }
//        yêu cầu: in ra 5 dòng 5 hello world
//        int i = 1; //giá trị ban đầu
//        while (i <= 5) { //điều kiện thực hiện vòng lặp
//            System.out.println("Hello World"); // thực hiện yêu cầu
//            i++; // i = i + 1 hoặc i+= 1 thay đổi giá trị ban đầu
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n:");
        int solan = scanner.nextInt();
        int lan = 1;
        while (lan <= solan) {
            System.out.println("Hello Testing 05");
            solan++;

//      vòng lặp do..while
//        giá trị ban đầu
//                do{
//                    thực hiện logic
//                            lam thay đổi giá trị ban đầu
//                }whilte(điều kiện)
            int index = 1;
            do {
                System.out.println("giá trị i: " + index);
                index++;
            } while (index <= 5);

//      vòng lặp for
//        for(giá trị khởi tạo: điều kiện; cập nhật giá trị khởi tạo)
            for (int j = 1; j <= 5; j++) {
                System.out.println("giá trị j: " + j);
            }
            System.out.println("nhập vào số n:");
            int n2 = scanner.nextInt();
            int tong2 = 0;
//            for (int k = 0; k <= n; k++) {
//                if (k % 2 == 0) {
//                    tong2 += k;
                }
            }
            }

//        tỏng chẵn



