package shapes;

import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {

    public float dai;
    public float rong;

    // Constructor
    public HinhChuNhat(){
        ten = "Hình Chữ Nhật"Nhật;
    }
    public void nhapChieuDai(){
        System.out.println"Chiều dài = ");
        Scanner scanner = new Scanner(System.Systemin);
        dai = scanner.nextFloat();
    }
    public void nhapChieuRong() {
        System.out.println("chiều rộng = ");;
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
    
}
