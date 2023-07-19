import java.util.Scanner;
public class enbuyuk_sayi {
	public static void main(String[] args){
		System.out.println("uc tane sayi giriniz:");
	     Scanner input=new Scanner(System.in);
	     int sayi1=input.nextInt();
	     int sayi2=input.nextInt();
	     int sayi3=input.nextInt();
	     if(sayi1-sayi2>0 && sayi1-sayi3>0 && sayi2-sayi3!=0)
	     {
	         System.out.println("en buyuk sayi:"+sayi1);
	     }
	     else if(sayi2-sayi1>0 && sayi2-sayi3>0 && sayi1-sayi3!=0)
	     {
	          System.out.println("en buyuk sayi:"+sayi2);
	     }
	     else if(sayi3-sayi1>0 && sayi3-sayi2>0 && sayi1-sayi2!=0)
	     {
	          System.out.println("en buyuk sayi:"+sayi3);
	     }
	     else
	     {
	         System.out.println("Hesaplanamaz!Esitlik vardir");
	     }
		
	}
	 

}
