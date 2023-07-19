import java.util.Scanner;
public class kalınsesli_incesesli {
	public static void main(String[] args){
		String paragraph;
		char caracter;
		System.out.println("paragraf giriniz:");
		Scanner scan=new Scanner(System.in);
		paragraph=scan.nextLine();

		int i;
		for(i=0;i<paragraph.length();i++)
		{
			caracter=paragraph.charAt(i);
			if(caracter=='a' || caracter=='ı' ||caracter=='o' ||caracter=='u')
			{
				System.out.println("kalın sesli:"+caracter);
			}
			if(caracter=='e' || caracter=='i' ||caracter=='ö' ||caracter=='ü')
			{
				System.out.println("ince sesli:"+caracter);
			}
		}
		
		
	}

}
