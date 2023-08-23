package exercises_3;
import java.util.Scanner;
public class exercises_3 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter today's day:");
		int day=input.nextInt();
		System.out.println("enter the number of days elapsed since today:");
		int add_day=input.nextInt();
		int finish_day;
		if(add_day>6)
		{
			add_day=add_day%6;
		}
		finish_day=day+add_day;
		if(day==0)
		{
			System.out.print("today is sunday");
			if(add_day==0)
			{
				System.out.print(" and the future day sunday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day monday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day tuesday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day wednesday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day thursday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day friday");
			}
			else 
			{
				System.out.print(" and the future day saturday");
			}
		}
		else if(day==1)
		{
			System.out.print("today is monday");
			if(add_day==0)
			{
				System.out.print(" and the future day monday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day tuesday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day wednesday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day thursday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day friday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day saturday");
			}
			else
			{
				System.out.print(" and the future day sunday");
			}
		}
		else if(day==2)
		{
			System.out.print("today is tuesday");
			if(add_day==0)
			{
				System.out.print(" and the future day tuesday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day wednesday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day thursday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day friday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day saturday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day sunday");
			}
			else
			{
				System.out.print(" and the future day monday");
			}
		}
		else if(day==3)
		{
			System.out.print("today is wednesday");
			if(add_day==0)
			{
				System.out.print(" and the future day wednesday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day thursday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day friday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day sunday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day saturday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day monday");
			}
			else
			{
				System.out.print(" and the future day tuesday");
			}
		}
		else if(day==4)
		{
			System.out.print("today is thursday");
			if(add_day==0)
			{
				System.out.print(" and the future day thursday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day friday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day sunday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day saturday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day monday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day tuesday");
			}
			else
			{
				System.out.print(" and the future day wednesday");
			}
		}
		else if(day==5)
		{
			System.out.print("today is friday");
			if(add_day==0)
			{
				System.out.print(" and the future day friday");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day saturday");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day sunday");
			}
			else if(add_day==3)
			{
				System.out.print(" and the future day monday");
			}
			else if(add_day==4)
			{
				System.out.print(" and the future day tuesday");
			}
			else if(add_day==5)
			{
				System.out.print(" and the future day wednesday");
			}
			else
			{
				System.out.print(" and the future day thursday");
			}
		}
		else
		{
			System.out.print("today is saturday");
			if(add_day==0)
			{
				System.out.print(" and the future day saturday ");
			}
			else if(add_day==1)
			{
				System.out.print(" and the future day monday ");
			}
			else if(add_day==2)
			{
				System.out.print(" and the future day tuesday ");
			}
			else if(finish_day==3)
			{
				System.out.print(" and the future day wednesday");
			}
			else if(finish_day==4)
			{
				System.out.print(" and the future day thusday");
			}
			else if(finish_day==5)
			{
				System.out.print(" and the future day friday");
			}
			else
			{
				System.out.print(" and the future day sunday");
			}
		}
		
		
		
		
		
		
	}

}
