package exercises_6;
import java.util.Scanner;
public class exercises_6 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("üc tane sayı giriniz:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();

		int toplam=num1+num2+num3;
		System.out.println("sayıların toplamı:"+toplam);

		int carpım=num1*num2*num3;
		System.out.println("sayıların carpımı:"+carpım);

		int ortalama=toplam/3;
		System.out.println("ortalama:"+ortalama);
		
		if(num1>num2 && num2>num3)
		{
			System.out.println("en büyük sayi:"+num1+"en kücük sayi:"+num3);
		}
		else if(num2>num3 && num3>num1)
		{
			System.out.println("en büyük sayi:"+num2+"en kücük sayi:"+num1);
		}
		else if(num3>num1 && num1>num2)
		{
			System.out.println("en büyük sayi:"+num3+"en kücük sayi:"+num2);
		}
		else if(num1>num3 && num3>num2 )
		{
			System.out.println("en büyük sayi:"+num1+"en kücük sayi:"+num2);
		}
		else if(num2>num1 && num1>num3 )
		{
			System.out.println("en büyük sayi:"+num2+"en kücük sayi:"+num3);
		}
		else if(num3>num2 && num2>num1)
		{
			System.out.println("en büyük sayi:"+num3+"en kücük sayi:"+num1);
		}

		

	}











}


