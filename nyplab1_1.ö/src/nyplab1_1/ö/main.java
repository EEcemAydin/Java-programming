package nyplab1_1.ö;
import java.util.Scanner;

public class main {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		//sorunun 1. bolumu:
		System.out.println("iki sayi giriniz:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int total=0;
		total=num1+num2;
		System.out.println("sonuc:"+total);
		
		//sorunun 2. bolumu:
		System.out.println("faktoriyelini hesaplayacağınız sayiyi giriniz:");
		int num=scan.nextInt();
		int faktoriyel=1;
		for(int i=1;i<=num;i++)
		{
			faktoriyel=faktoriyel*i;
			
		}
		System.out.println("sonuc:"+faktoriyel);
	
		
		
		
		
	}
}
