package exercises_14;
import java.util.Scanner;
import java.util.Random;
public class exercises_14 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter:");
		int n=scanner.nextInt();
		int arr[][]=new int[n][n];
		Random random=new Random();
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				arr[i][j]=random.nextInt(2);
			}
				
		}
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
