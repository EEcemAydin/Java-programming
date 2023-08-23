package exercises_2;
import java.util.Scanner;
public class exercises_2 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter investment amount:");
		double yatırım_mik=input.nextDouble();
		System.out.println("enter annaual interest rate in percentage:");
		double faiz_oranı=input.nextDouble();
		System.out.println("enter number of years:");
		double yıl=input.nextDouble();
		double geri_dönüs=yatırım_mik*(1+faiz_oranı/100);
		System.out.println("accumulated value is"+geri_dönüs);
		
	}

}
