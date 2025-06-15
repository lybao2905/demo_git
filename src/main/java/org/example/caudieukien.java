package org.example;

import java.util.Scanner;

public class caudieukien {
    public static void main(String[] args) {
//       điều kiện sai
        if (2 > 9) {
            System.out.println("điều kiện đúng ");
        }
//        viết chường trình kiểm tra xem hôm nay có phải nga đi học khong
        int day = 4;
        if (day == 4 || day == 8) {
            System.out.println("hôm nay đi học");
        }
//        câu if..else
//        if(điều kiện){thực hiện logic1} else {thực hiện logic2}
        int a = 8;
        int b = 10;
        if (a > b) {
            System.out.println("số a lớn số b");
        } else {
            System.out.println("số b lớn số a");
        }
//        yêu cầu: viết chương trình cho phép người dùng nhập số tuổi, kiểm tra xem đã đủ tuổi học đại học nha
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tuổi: ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("bạn đủ tuổi học đại học");
        } else {
            System.out.println("bạn chưa đủ tuổi");
        }
// toán tử 3 ngôi -> điểu kiện ? thực hiện logic 1 đúng : thực hiện logic 2
        String result = (age > 18) ? "bạn đủ tuổi học đại học" : "bạn chưa đủ tuổi ";
        System.out.println(result);
//    if(diểu kiện 1){thực hiện logic1}else if(điêều kiện 2){thực hiện logic2)else
        int c = 10;
        if (c == 10) {
            System.out.println("số 10");
        } else if (c == 11) {
            System.out.println("11");
        } else if (c == 12) {
            System.out.println("số 12");
        } else {
            System.out.println("vui long nhập lại số");
        }
//        viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán, lý, hóa sau đó tính điểm trung bình nếu điểm trung bình <5 -> học sinh yếu

//        System.out.println("nhập số toán:");
//        float toán = scanner.nextInt();
//        System.out.println("nhập số lý:");
//        float lý = scanner.nextInt();
//        System.out.println("nhập số hóa:");
//        float hóa = scanner.nextInt();
//
//        float dtb = (toán + lý + hóa) / 3;
//
//        if (0 < dtb && dtb <= 5) {
//            System.out.println("học sinh yếu");
//        } else if (5.1 <= dtb && dtb <= 6) {
//            System.out.println("học sinh trung bình");
//        } else if (6.1 <= dtb && dtb <= 7) {
//            System.out.println("học sinh khá");
//        } else if (7.1 <= dtb && dtb <= 8) {
//            System.out.println("học sinh giỏi");
//        } else if (8.1 <= dtb && dtb <= 10) {
//            System.out.println("học sinh xuất sắc");
//        } else {
//            System.out.println("vui lòng nhập lại");
//        }
//    }
//    Scanner scanner1 = new Scanner(System.in);
//
//        System.out.print("Nhập tên khách hàng: ");
//    String ten = scanner1.nextLine();
//
//        System.out.print("Nhập số kw tiêu thụ: ");
//    int kw = scanner1.nextInt();
//
//    int tienDien = 0;
//
//        if (kw <= 50) {
//        tienDien = kw * 500;
//    } else if (kw <= 100) {
//        tienDien = 50 * 500 + (kw - 50) * 650;
//    } else if (kw <= 150) {
//        tienDien = 50 * 500 + 50 * 650 + (kw - 100) * 850;
//    } else if (kw <= 200) {
//        tienDien = 50 * 500 + 50 * 650 + 50 * 850 + (kw - 150) * 1100;
//    } else {
//        tienDien = 50 * 500 + 50 * 650 + 50 * 850 + 50 * 1100 + (kw - 200) * 1300;

//    }
//
//        System.out.println("Khách hàng: " + ten);
//        System.out.println("Tiêu thụ: " + kw + " kWh");
//        System.out.println("Tiền điện phải trả: " + tienDien + " đồng");
//}
        //switch case
//        switch (giá trị đem đi so sánh){
//            case giá trị so sánh
//                    thực hiện logic
//                    break

        int d = 15;
        switch (d){
            case 5:
                System.out.println("số 5");
                break ;
            case 10:
                System.out.println("số 10");
                break;
            default:
                System.out.println("vui lòng kiễm tra lại");

        }
//        lưu ý: nên switch case - giá trị so sánh là giá trị cụ thể, điểu kiện đơn giản (==)
        }
}


