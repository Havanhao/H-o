package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    // Constructor
    public HinhTru(){
        ten = "Hình Trụ";
    }
    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chiều Cao = ");
        Scanner scanner = new scanner(System.in);
        chieuCao = scanner.nextFloat();

    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
    

