import java.util.Scanner;

class Main {

	public static void main(String[] args) {
	
		String[] sorular = new String[] {"Soru1: ","Soru2: ","Soru3: ","Soru4: ","Soru5: "};
		
		int[][] yan�t = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[][] yan�t2 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[] toplamPuan = {0,0,0,0,0};
		double[] toplamKi�i = {0,0,0,0,0};
		
		int enK���k = 1000;
		int enB�y�k = 0;
		
	    int a = 0;
	    int b = 0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    while(true) {//Sonsuz d�ng� sayesinde istedi�imiz kadar insana soru sorabilece�iz
	    
	    	System.out.println("Durmak i�in 0'a, devam etmek i�in 1'e bas�n.");
	    	
	    	int devam = input.nextInt();
	    	
	    	if(devam == 0) {//Soru sormay� durdurma
	    		
	    		break;
	    	}
	    	else if(devam == 1) {//Soru sorma
	    		
	    		for(int i=0; i<5; i++) {
		    	    
		    		System.out.printf(sorular[i]);	
		    	    
		    	    int degerlendirme = input.nextInt();
		    	    
		    	      yan�t[i][degerlendirme-1] = yan�t[i][degerlendirme-1] + 1;//1-10'a kadar oldu�u i�in -1 kayd�rmas� yap�yoruz ve �rne�in 1 cevab�n� verdi�imizde bunu 0. indise atam�� oluyoruz
		    	      yan�t2[i][degerlendirme-1] = yan�t2[i][degerlendirme-1] + degerlendirme;//Verilen puanlar� indislerine g�re topluyor
	    		}
	    	}
	    	else {
	    		
	    		System.out.println("Ge�ersiz giri� l�tfen tekrar girin...");
	    	}
	    }

	    System.out.println();
	    
	    System.out.println("Sorulardaki hangi puana ka� ki�inin puan verdi�ini g�steren tablo:");
	    System.out.println("Puanlar: 1 2 3 4 5 6 7 8 9 10");
	    System.out.println("-----------------------------");
	    
	    for(int i=0; i<5; i++) {//Sorulara g�re verilen puanlar�n ki�i say�s� ile g�sterildi�i tablo (�rne�in 1. soruda 5 puan�n� 3 ki�i verdi, 1 puan�n� 4 ki�i verdi gibi) 
	    	
	    	System.out.print("Soru" + (i+1) + ":   ");
	    	
	    	for(int j=0; j<10; j++) {
	    		
	    		System.out.print(yan�t[i][j]);
	    		System.out.printf(" ");
	    	}
	    	
	    	System.out.println();	
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	    for(int i=0; i<5; i++) {
	        
	    	for(int j=0; j<10; j++) {
	    		
	    		toplamPuan[i] = toplamPuan[i] + yan�t2[i][j];//Sorulara verilen toplam puan� hesapl�yor
	    		toplamKi�i[i] = yan�t[i][j] + toplamKi�i[i];//Ki�i say�s�n� hesapl�yor
	        }
	    
	        if(enK���k > toplamPuan[i]) {
	        	
	        	enK���k = toplamPuan[i];
	        	a = i + 1;
	        }
	        
	        if(enB�y�k < toplamPuan[i]) {
	        	
	        	enB�y�k = toplamPuan[i];
	        	b = i + 1;
	        }
	    
	        System.out.printf((i+1) + ".Sorunun puan�: " + toplamPuan[i] + "  ve ortalamas�: " + (toplamPuan[i]/toplamKi�i[i]));
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("En k���k puan: " + enK���k + " ve " + a + ".Soru");
	    System.out.println("En b�y�k puan: " + enB�y�k + " ve " + b + ".Soru");
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Sorulara verilen cevaplar�n tablodaki puansal da��l�m�:");
	    
	    for(int i=0 ; i<5; i++) {
	    	
	    	System.out.print("Soru" + (i+1) + ": ");
	    	
	    	for(int j=0 ; j<10; j++) {
	    		
	    		System.out.print(yan�t2[i][j]);
	    		
	    		System.out.print(" ");
	    	}
	    	System.out.println();
	    }
	}
}