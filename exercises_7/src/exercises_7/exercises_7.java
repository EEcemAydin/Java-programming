package exercises_7;
import java.util.Scanner;
public class exercises_7 {
	public static void main(String args[]) {
		Scanner scan=new Scanner (System.in);
		for(int i=0;i<10000;i++)
		{
			int secim=1;
			int sayac=0;
			double ort;
			double toplam=0;
			double arr[]=new double[100];
			if(secim==1)
			{
				System.out.println("kaç litre benzin harcadı?");
				double benzin_litresi=scan.nextDouble();
				System.out.println("kaç kilometre yol alındı?");
				double kilometre=scan.nextDouble();
				arr[i]=(kilometre)/(benzin_litresi);
				sayac++;
				
				
			}
			System.out.println("çıkış için -1,devam için 1 e basınız!");
			secim=scan.nextInt();
			if(secim==-1)
			{
				
				for(int j=0;j<sayac;j++)
				{
					toplam=toplam+arr[i];

				}
				ort=toplam/sayac;
				System.out.println("toplam ortalama kilometre/litre:"+ort);
			}
			
		}
			
		
		
	}

}
