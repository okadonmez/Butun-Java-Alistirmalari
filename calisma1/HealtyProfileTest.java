package O�uzKa�an_D�nmez_203405025;

import java.util.Scanner;

public class HealtyProfileTest {

	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);
        
		System.out.print("L�tfen hastan�n ad�n� giriniz: ");
        String adGir=input.nextLine();
        
        System.out.print("L�tfen hastan�n soyad�n� giriniz: ");
        String soyadGir=input.nextLine();
        
        System.out.print("L�tfen hastan�n cinsiyetini giriniz: ");
        String cinsiyetGir=input.nextLine();
        
        System.out.print("L�tfen hastan�n do�um tarihini giriniz: ");
        int dogumTarihiGir=input.nextInt();
        
        System.out.print("L�tfen hastan�n boyunu giriniz: ");
        double boyGir=input.nextDouble();
        
        System.out.print("L�tfen hastan�n kilosunu giriniz: ");
        double kiloGir=input.nextDouble();
        
        HealtyProfile HealtyProfileObject = new HealtyProfile(adGir, soyadGir, cinsiyetGir, dogumTarihiGir, boyGir, kiloGir);
	
        HealtyProfileObject.show();
        
        input.close();
	}
}
