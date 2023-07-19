import java.util.Scanner;
public class mukemmel_sayilar {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz:");
		int number=scan.nextInt();
		int i;
		int toplam=0;
		int control=0;
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				toplam=toplam+i;
				if(number%toplam==0)
				{
					control=1;	
				}
				else
				{
					control=0;
				}
			}
			
		}
		if(control==0)
		{
			System.out.println("mukemmel sayi degildir!");
			
		}
		else if(control==1)
		{
			System.out.println("mukemmel sayidir!");
		}
		
		
	}

}
