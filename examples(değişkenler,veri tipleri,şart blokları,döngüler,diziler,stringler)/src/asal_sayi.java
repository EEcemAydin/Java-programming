public class asal_sayi {
	public static void main(String[] args){
		int number=25;
		int sayac=0;
		for(int i=2;i<25;i++)
		{
			if(number%i==0)
			{
				sayac++;
			}
		}
		if(sayac!=0)
		{
			System.out.println("asal sayi değildir!");
		}
		else
		{
			System.out.println("asal sayidir!");
		}
	}

}
