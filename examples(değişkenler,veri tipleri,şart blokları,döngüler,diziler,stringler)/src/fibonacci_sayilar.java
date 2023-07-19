
public class fibonacci_sayilar {
	public static void main(String[] args){
		System.out.print("0-1000 arasindaki fibonacci sayilar:");
	     int sayi[]=new int[20];
	     int i,a=1,b=1,sonuc=0;
	     sayi[0]=1;
	     sayi[1]=1;
	     for(i=2;i<999;i++)
	     {
	         if(sayi[i]==sayi[i-1]+sayi[i-2])
	         {
	             a=b;
	             b=sonuc;
	             sonuc=a+b;
	             System.out.println(sonuc);
	         }
	     }
	   
	 
     }

}
