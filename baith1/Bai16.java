// Liệt kê các ước của số nguyên dương n
package Bai1;

public class Bai16 {

	public static void main(String[] args) {
	int n= 10;
	System.out.println("Cac uoc cua so nguyen duong " + n + " la :"); //println= in ra xong xuong dong
	for(int i=1; i<=n ; i++) {
		if (n % i == 0) {
		System.out.print(i +" ");}
	}
	}

}
