package exercises_13;
import java.util.Scanner;
public class exercises_13 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz:");
		int num=scanner.nextInt();
		if((2*num+1)%3==0)
		{
			System.out.println(+num);
		}
		else
		{
			System.out.println("beşgensel sayi degildir!");
		}
		
	}

}
