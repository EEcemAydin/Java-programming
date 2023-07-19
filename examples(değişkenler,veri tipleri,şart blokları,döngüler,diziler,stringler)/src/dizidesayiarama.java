import java.util.Scanner;
public class dizidesayiarama {
	public static void main(String[] args){
		int arr[]= {15,34,49,93,72};
		int aranan_sayi;
		int control=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("aranilacak sayiyi giriniz:");
		aranan_sayi=scan.nextInt();
		for(int diziler:arr)
		{
			if(diziler==aranan_sayi)
			{
				control=1;
			}
			else
			{
				control=0;
			}
		}
		if(control==0)		
		{
			System.out.println("aranan sayi verilen dizide bulunmuyor!");
		}
		if(control==1)
		{
			System.out.println("aranan sayi verilen dizide bulunuyor!");
		}
	}
}
