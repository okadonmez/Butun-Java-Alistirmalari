package OðuzKaðan_Dönmez_203405025;

import java.util.Scanner;

public class HealtyProfileTest {

	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);
        
		System.out.print("Lütfen hastanýn adýný giriniz: ");
        String adGir=input.nextLine();
        
        System.out.print("Lütfen hastanýn soyadýný giriniz: ");
        String soyadGir=input.nextLine();
        
        System.out.print("Lütfen hastanýn cinsiyetini giriniz: ");
        String cinsiyetGir=input.nextLine();
        
        System.out.print("Lütfen hastanýn doðum tarihini giriniz: ");
        int dogumTarihiGir=input.nextInt();
        
        System.out.print("Lütfen hastanýn boyunu giriniz: ");
        double boyGir=input.nextDouble();
        
        System.out.print("Lütfen hastanýn kilosunu giriniz: ");
        double kiloGir=input.nextDouble();
        
        HealtyProfile HealtyProfileObject = new HealtyProfile(adGir, soyadGir, cinsiyetGir, dogumTarihiGir, boyGir, kiloGir);
	
        HealtyProfileObject.show();
        
        input.close();
	}
}
