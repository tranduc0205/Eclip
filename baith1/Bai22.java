package Bai1;

public class Bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24; // nhập thẳng dữ liệu
        int m = 36;

        int bcnn = 0;
        int max = (n > m) ? n : m;

        for (int i = max; ; i++) {
            if (i % n == 0 && i % m == 0) {
                bcnn = i;
                break;
            }
        }

        System.out.println("BCNN cua " + n + " va " + m + " la: " + bcnn);
	}

}
