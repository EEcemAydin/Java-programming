package arrays;

public class arrays {
	public static void main(String[] args){
		double mylist[]={1.2,1.3,4.5,7.6};
		double total=0;
		double max=mylist[0];
		for(double process:mylist)
		{
			total+=process;
			//aslında islem olarak yazdığım for'un i'li kısmı
			if(max<process)
			{
				max=process;
			}
			
		}
		System.out.println("total:"+total);
		System.out.println("the biggest number:"+max);
		
		
	}		
	
}
