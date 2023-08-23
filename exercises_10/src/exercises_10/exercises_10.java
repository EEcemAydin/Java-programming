package exercises_10;
import java.util.Scanner;
public class exercises_10 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("A single line containing a positive integer,n.");
		int n=scan.nextInt();
		if(n%2==1)
		{
			System.out.println("Weird");
		}
		if(n%2==0)
		{
			if(2<=n && n<=5)
			{
				System.out.println("Not Weird");
			}
			else if(6<=n && n<=20)
			{
				System.out.println("Weird");
			}
			else if(n>20)
			{
				System.out.println("Not Weird");
			}
		}
		
	}

}
