import java.util.Scanner;
public class arkadas_sayi {
	public static void main(String[] args){
		System.out.println("iki sayi giriniz:");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num1top=0,num2top=0;
		int i,j;
		for(i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
				num1top=num1top+i;
			}
		}
		for(j=1;j<num2;j++)
		{
			if(num2%j==0)
			{
				num2top=num2top+j;
			}
		}
		if(num1==num2top && num1top==num2)
		{
			System.out.println("bu sayilar arkadas sayidir!");
		}
		else
		{
			System.out.println("bu sayilar arkadas sayi degildir!");
		}
		
	}

}
