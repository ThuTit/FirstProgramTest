
package FirstPackage;
import java.util.Scanner;
public class Square {
	static int a;
	public static int chuVi(int b){
		return 4*b;
	}
	public static int dienTich(int c){
		return c*c;
	}
	public static void main (String[] args){
		Scanner scanIn = new Scanner (System.in);
		Square hinhVuong = new Square();
		System.out.print("Canh cua hinh vuong la: ");
		a = scanIn.nextInt();
		System.out.println("Chu vi cua hinh vuong la "+ Square.chuVi(a));
		System.out.println("Dien tich cua hinh vuong la "+ Square.dienTich(a));
		
	}
}
