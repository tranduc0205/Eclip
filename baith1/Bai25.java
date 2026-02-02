package Bai1;

public class Bai25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nam = 2024; // nhập năm trực tiếp trong code

        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {   // || là hoặc 
            System.out.println(nam + " la nam nhuan");
        } else {
            System.out.println(nam + " khong phai la nam nhuan");
        }
	}

}
  // nếu chia hết cho 4 va khong chia het cho 100 hoac chia het cho 400 thi do la nam nhuan