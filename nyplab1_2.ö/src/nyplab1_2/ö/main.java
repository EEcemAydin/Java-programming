package nyplab1_2.ö;
import java.util.Scanner;

public class main {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		//sorunun 1. bolumu:
		System.out.println("bolunen ve bolen degerleri giriniz:");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		if(num2!=0)
		{
			double bolum=num1/num2;
			System.out.println("sonuc:"+bolum);
		}
		else if(num2==0)
		{
			System.out.println("bolunen sıfır olamaz islem yapılamaz!");
		}
		
		//sorunun 2.bolumu
		System.out.println("sayi giriniz:");
		int num=scan.nextInt();
		int total=0;
		for(int i=0;i<=num;i++)
		{
			total=total+i;
		}
		System.out.println("sonuc:"+total);
		
		
	}

}
