import java.util.Scanner;
public class notortalaması {
	public static void main(String[] args){
		int puan[]=new int[7];
        Scanner scan =new Scanner(System.in);
        System.out.println("notlarinizi giriniz:");
        System.out.println("turkce:");
        puan[0]=scan.nextInt();
                
        System.out.println("matematik:");
        puan[1]=scan.nextInt();
                
        System.out.println("fizik:");
        puan[2]=scan.nextInt();
                
        System.out.println("kimya:");
        puan[3]=scan.nextInt();
           
        System.out.println("biyoloji:");
        puan[4]=scan.nextInt();
            
        System.out.println("cografya:");
        puan[5]=scan.nextInt();
                
        System.out.println("tarih:");
        puan[6]=scan.nextInt();
           
        double toplam=0;
        toplam=puan[0]+puan[1]+puan[2]+puan[3]+puan[4]+puan[5]+puan[6];
        double ort=(toplam/7);
        System.out.println("ortalama:"+ort);
	}

}
