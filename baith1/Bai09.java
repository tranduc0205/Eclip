package Bai1;

public class Bai09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 10;
    int giaithua = 1;  // nếu số i lớn hơn 12 thì dùng long ( nhưng từ i=21 thì long cũng tính sai)
    for (int i =1; i<= n; i++) {
    	giaithua *= i;
    }
    System.out.println("S(n) =" + giaithua);
	}

}
