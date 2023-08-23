package exercises_5;
import java.util.Scanner;
public class exercises_5 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("dolar cinsinden satış tutarını giriniz:");
		double satış=scan.nextDouble();
		double maas=200.0+((satış*9.0)/100);
		System.out.println("maaş:"+maas);
	}

}
