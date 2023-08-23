package exercises_11;
import java.util.Scanner;
public class exercises_11 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length fom the center to a vertex:");
		double r=scanner.nextDouble();
		double s=2 * r * Math.sin(Math.PI/5);
		double area=(5*s*s)/(4* Math.tan(Math.PI/5));
		System.out.println("the area of the pentagon is " +area);
		scanner.close();
		
	}
	

}
