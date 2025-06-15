package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("hello Bảo");
            System.out.println("hello");
// lệnh nhập
            Scanner scanner = new Scanner(System.in);

//            biến - nơi lưu trữ dự liệu
//            <kiễu dữ liệu> <tên biến> = <giá trị khởi tạo>

//            kiểu dữ liệu dạng primative value: byte, short, int, long, float, string, boolean, double,..
//            kiểu dữ liệu tham chiêếu: string, array, class, object và interface

            int age = 18;
            double salary = 1500.15;
//            char name = "Bảo";
            String name1 ="Bảo";
            boolean islogin = true;// false
//          hằng số - giá trị không đổi
            final double pi = 3.14159;
//yêu cầu: cho phép người dùng vào tên mình và xuất ra màn hin h2

//ô nhập
            System.out.println("Nhập tên người dùng: ");
//nhận giá trị từ người dùng nhập và gắn vào biến
            String name = scanner.nextLine();
//xuất ra màn hình
            System.out.println("Xin chào " + name);
// yều cầu: viết chường trình cho sinh viên nhập vào tên, lớp, và tuổi (scanner.nextInt()) và in ra màn hình
//          Nhâp tên sinh viên
//            System.out.println("Nhập tên sinh viên: ");
//            String ten = scanner.nextLine();
////            nhập lớp
//            System.out.println("Nhập lớp: ");
//            String lop  = scanner.nextLine();
////            nhập số tuổi
//            System.out.println("Nhập số tuổi: ");
//            int tuoi  = scanner.nextInt();
//            System.out.println("Xin chào " + ten + "," + " hiện dang " + age + "tuổi" + "," + "Học lớp" + lop);

        }
    }
}
