public package shapes;

import java.util.Scanner;

public class HinnhVuong extends HinhChuNhat {
    //Constructor
    public HinhVuong(){
        ten = "Hình Vuông";
    }
    public void nhapCanh(){
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
