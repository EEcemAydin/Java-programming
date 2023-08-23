package exercises_4;
import java.util.Scanner;
public class exercises_4 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the exchange rate from dollars to RMB:");
		double doviz_kur=input.nextDouble();
		System.out.println("enter o to covert dollars to RMB and 1 vice versa:");
		int secim=input.nextInt();
		if(secim==0||secim==1)
		{
			if(secim==0)
			{
				System.out.println("enter the dollar amount:");
				double dolar_mik=input.nextDouble();
				double yuan=dolar_mik*doviz_kur;
				System.out.println("$"+dolar_mik+" "+yuan+"Yuan'dir.");
			}
			if(secim==1)
			{
				System.out.println("enter the RMB amount:");
				double yuan=input.nextDouble();
				double dolar_mik=yuan/doviz_kur;
				System.out.println(+yuan+"Yuan,"+"$"+dolar_mik);
			}
			
		}
		else
		{
			System.out.println("ıncorrect input!");
		}
		
		
		
		
	}

}
