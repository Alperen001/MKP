import java.util.Scanner;

public class MKP {

	public static void main(String[] args) {
		int a, b,c,d,e,f;
		double toplam;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Armut Ka� Kilo?");
		a=inp.nextInt();
		System.out.println("Elma Ka� Kilo?");
		b=inp.nextInt();
		System.out.println("Domates Ka� Kilo?");
		c=inp.nextInt();
		System.out.println("Muz Ka� Kilo?");
		d=inp.nextInt();
		System.out.println("Patl�can Ka� Kilo?");
		e=inp.nextInt();
		
		toplam=(a*2.14)+(b*3.67)+(c*1.11)+(d*0.95)+(e*5);
		System.out.println("Toplam Tutar: "+toplam+" TL");

	}
}
