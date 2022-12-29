import java.util.Scanner;

public class MKP {

	public static void main(String[] args) {
		int a, b,c,d,e,f;
		double toplam;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo?");
		a=inp.nextInt();
		System.out.println("Elma Kaç Kilo?");
		b=inp.nextInt();
		System.out.println("Domates Kaç Kilo?");
		c=inp.nextInt();
		System.out.println("Muz Kaç Kilo?");
		d=inp.nextInt();
		System.out.println("Patlýcan Kaç Kilo?");
		e=inp.nextInt();
		
		toplam=(a*2.14)+(b*3.67)+(c*1.11)+(d*0.95)+(e*5);
		System.out.println("Toplam Tutar: "+toplam+" TL");

	}
}
