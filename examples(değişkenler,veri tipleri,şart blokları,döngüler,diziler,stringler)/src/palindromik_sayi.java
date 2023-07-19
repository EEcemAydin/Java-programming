import java.util.Scanner;
public class palindromik_sayi {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	    System.out.println("kelimeyi giriniz");
	    String palindromik=input.nextLine();
	    char palindromikdizi[]=palindromik.toCharArray();
	    int i;
	    for(i=0;i<(palindromikdizi.length/2)-1;i++)
	    {
	        if(palindromikdizi[i]==palindromikdizi[palindromikdizi.length-i-1])
	        {
	            System.out.println("palindromik sayidir");
	            
	        }
	        else
	        {
	            System.out.println("palindromik sayi degildir");
	        }
	    }
		
	}
	
	
    

}
