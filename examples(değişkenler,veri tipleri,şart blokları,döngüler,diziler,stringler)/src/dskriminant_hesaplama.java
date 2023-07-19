import java.util.Scanner;
public class dskriminant_hesaplama {
	public static void main(String[] args){
		System.out.println("a,b,c degerlerini giriniz:");
	     Scanner input=new Scanner(System.in);
	     int a=input.nextInt();
	     int b=input.nextInt();
	     int c=input.nextInt();
	     
	     double diskriminant=(b*b)-(4*a*c);
	     double kok1,kok2;
	     if(diskriminant>0)
	     {
	         System.out.print("denklemin iki koku vardir");
	         kok1=(((-b)+Math.sqrt(diskriminant))/(2*a));
	         kok2=(((-b)-Math.sqrt(diskriminant))/(2*a));
	         System.out.print("kokler:"+kok1+kok2);
	     }
	     else if(diskriminant==0)
	     {
	         System.out.print("denklemin tek koku vardir.");
	         kok1=(-b)/(2*a);
	         System.out.print("kok:"+kok1);
	         
	     }
	     else
	     {
	         System.out.println("reel koku yoktur.");
	     }
		
	}
	 
    

}
