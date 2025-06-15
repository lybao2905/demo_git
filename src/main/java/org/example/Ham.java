package org.example;

public class Ham {

//    hàm được định nghĩa ở đây
//    có 2 loại hàm
//    hàm không có giá trị trả về (hàm thực hiện logic)
//    static void tenHam(){}
    static void greeting(){
        System.out.println("Hello World");
    }
//    hàm có giá trị trả về
//    static < kiểu dữ liêu> tenHam(truyền tham số){}
    static double dtb(double diemToan, double diemly, double diemhHóa){
        double dtb = (diemhHóa +diemly +diemToan)/ 3;
        return dtb;
        }
    public static void main(String[] args) {
    greeting();

    double diemToan = 7;
    double diemLy = 8;
    double diemHoa = 9;
    double dtb = dtb(diemToan, diemLy, diemHoa);
    System.out.println(dtb);
    }
}
