package OðuzKaðan_Dönmez_203405025;

import java.util.Scanner;

public class HeartRateTest {
	
	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);
    
		System.out.print("Lütfen adýnýzý giriniz: ");
        String adGir=input.nextLine();
        
        System.out.print("Lütfen soyadýnýzý giriniz: ");
        String soyadGir=input.nextLine();
        
        System.out.print("Lütfen doðum tarihinizi giriniz: ");
        int dogumTarihiGir=input.nextInt();
        
        HeartRate HeartRateObject = new HeartRate(adGir, soyadGir, dogumTarihiGir);
	
        HeartRateObject.show();
        
        input.close();
	}
}
