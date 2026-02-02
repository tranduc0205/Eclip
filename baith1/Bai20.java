package Bai1;

public class Bai20 {
    public static void main(String[] args) {

        int n = 16; // nhập thẳng dữ liệu
        boolean laSoChinhPhuong = false;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                laSoChinhPhuong = true;
                break;
            }
        }

        if (laSoChinhPhuong) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }
}
