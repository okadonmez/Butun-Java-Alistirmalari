package O�uzKa�an_D�nmez_203405025;

import java.util.Scanner;

public class HeartRateTest {
	
	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);
    
		System.out.print("L�tfen ad�n�z� giriniz: ");
        String adGir=input.nextLine();
        
        System.out.print("L�tfen soyad�n�z� giriniz: ");
        String soyadGir=input.nextLine();
        
        System.out.print("L�tfen do�um tarihinizi giriniz: ");
        int dogumTarihiGir=input.nextInt();
        
        HeartRate HeartRateObject = new HeartRate(adGir, soyadGir, dogumTarihiGir);
	
        HeartRateObject.show();
        
        input.close();
	}
}
