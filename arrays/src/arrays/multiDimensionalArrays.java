package arrays;

public class multiDimensionalArrays {
	public static void main(String[] args){
		String city[][]=new String[3][3];
		city[0][0]="Istanbul";
		city[0][1]="Bursa";
		city[0][2]="Kocaeli";
		city[1][0]="Trabzon";
		city[1][1]="Ordu";
		city[1][2]="Rize";
		city[2][0]="Izmir";
		city[2][1]="Denizli";
		city[2][2]="Aydin";
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				if(i==0)
				{
					System.out.println("marmara bölgesindesiniz!");
					System.out.println(city[i][j]);
					
				}
				if(i==1)
				{
					System.out.println("karadeniz bölgesindesiniz!");
					System.out.println(city[i][j]);
				}
				if(i==2)
				{
					System.out.println("ege bölgesindesiniz!");
					System.out.println(city[i][j]);
				}
				
			}
			
		}
			
	}

}
