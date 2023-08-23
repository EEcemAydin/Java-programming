package exercises_1;
import java.util.Scanner;
public class exercises_1 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a degree in Celsius");
		double celsius=scan.nextDouble();
		double fahrenheit=((9.0/5)*celsius)+32;
		System.out.print(+celsius+"Celsius is"+fahrenheit+"Fahrenheit");
		
		
	}

}
