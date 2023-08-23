package nyplab2_1.ö;
import java.util.Scanner;

public class main {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		//sorunun 1. bolumu
		System.out.println("bir sayi giriniz:Gireceğiniz sayi 1,2,3 den birisi olmalıdır:");
		int s=scan.nextInt();
		System.out.println("bir sayi giriniz:Gireceğiniz sayi islemin kaça kadar devam edeceğini belirleyecek:");
		int n=scan.nextInt();
		if(s==1)
		{
			int total=0;
			for(int i=0;i<n;i++)
			{
				total=total+i;
			}
			System.out.println("sonuc:"+total);
		}
		else if(s==2)
		{
			int impact=1;
			for(int i=1;i<n;i++)
			{
				impact=impact*i;
			}
			System.out.println("sonuc:"+impact);
			
		}
		else if(s==3)
		{
			int islem=1;
			for(int i=1;i<n;i++)
			{
				if(i%3==0)
				{
					islem=islem+i;
				}
			}
			System.out.println("sonuc:"+islem);
			
		}
		else if(s!=1 || s!=2 || s!=3)
		{
			System.out.println("yanlis sayi girdiniz:");
		}
		//sorunun 2. bolumu
		System.out.println("asal carpanlarını sorgulayacağımız sayiyi giriniz:");
		int num=scan.nextInt();
		int arr[]=new int[1000]; 
		for(int i=0;i<=100;i++)
		{
			arr[i]=0;
		}
		int kontrolsayac=0;
		int asalsayac=0;
		for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrolsayac++;
                }
            }
            if (kontrolsayac == 0) {
                arr[asalsayac]=i;
                asalsayac++;
            }
            kontrolsayac = 0;
        }
		asalsayac=0;
		System.out.println("sayinin asal carpanları");
		while(arr[asalsayac]!=0)
		{
			System.out.print( arr[asalsayac] );
			asalsayac++;
		}
		
			
		
		
		
		
		
		
		
		
	}
}
