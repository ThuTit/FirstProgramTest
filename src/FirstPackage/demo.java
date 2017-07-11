package FirstPackage;

import java.util.Scanner ;

import javax.swing.text.html.HTMLEditorKit.Parser;
public class demo {
	static int a, b;
	static int sum = 0, sub = 0;
	static int x = 0, y = 1, fibo;
	int [] z = new int [a];
	static Scanner scanIn = new Scanner(System.in);
	public static void main (String args[]){
		System.out.print("Nhap a = ");
		a = scanIn.nextInt();
		System.out.print("Nhap b = ");
		b = scanIn.nextInt();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		if(a > b){
			sub = a - b;
			System.out.println("a > b");
		}
		else {
			if(a < b){
				sub = b - a;
				System.out.println("a < b");
			}
			else {
				sub = 0;
				System.out.println("a = b");
			}
			sum = a + b ;
		System.out.println("Tong cua a va b la "+ sum);
		System.out.println("Hieu cua a va b la " + sub );
		// tinh tong tu 0 den a
		int sumA = 0;
		for (int i = 1; i<= a; i++){
			sumA += i;
		}
		System.out.println(sumA);
		}
		// in day fibonaci den phan tu thu a
		for (int j = 0; j< a; j++){
			fibo = x  ;
			x = y; 
			y= fibo + y;
		System.out.println(fibo);
		}
		
	}
}
