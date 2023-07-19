import java.util.Scanner;
public class kelimeyi_ters_cevirme {
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
	    System.out.println("isim giriniz:"); 
	    String isim=input.nextLine();
	    char ismintersi[]=isim.toCharArray();
	    int i;
	    for(i=0;i<(ismintersi.length/2);i++)
	    {
	        char temp;
	        temp=ismintersi[i];
	        ismintersi[i]=ismintersi[ismintersi.length-i-1];
	        ismintersi[ismintersi.length-i-1]=temp;
	        
	    }
	    System.out.println("ismin tersi");
	     for(i=0;i<ismintersi.length;i++)
	    {
	        System.out.print(ismintersi[i]);
	    }
		
	}
	

}
