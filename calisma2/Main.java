import java.util.Scanner;

class Main {

	public static void main(String[] args) {
	
		String[] sorular = new String[] {"Soru1: ","Soru2: ","Soru3: ","Soru4: ","Soru5: "};
		
		int[][] yanýt = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[][] yanýt2 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[] toplamPuan = {0,0,0,0,0};
		double[] toplamKiþi = {0,0,0,0,0};
		
		int enKüçük = 1000;
		int enBüyük = 0;
		
	    int a = 0;
	    int b = 0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    while(true) {//Sonsuz döngü sayesinde istediðimiz kadar insana soru sorabileceðiz
	    
	    	System.out.println("Durmak için 0'a, devam etmek için 1'e basýn.");
	    	
	    	int devam = input.nextInt();
	    	
	    	if(devam == 0) {//Soru sormayý durdurma
	    		
	    		break;
	    	}
	    	else if(devam == 1) {//Soru sorma
	    		
	    		for(int i=0; i<5; i++) {
		    	    
		    		System.out.printf(sorular[i]);	
		    	    
		    	    int degerlendirme = input.nextInt();
		    	    
		    	      yanýt[i][degerlendirme-1] = yanýt[i][degerlendirme-1] + 1;//1-10'a kadar olduðu için -1 kaydýrmasý yapýyoruz ve örneðin 1 cevabýný verdiðimizde bunu 0. indise atamýþ oluyoruz
		    	      yanýt2[i][degerlendirme-1] = yanýt2[i][degerlendirme-1] + degerlendirme;//Verilen puanlarý indislerine göre topluyor
	    		}
	    	}
	    	else {
	    		
	    		System.out.println("Geçersiz giriþ lütfen tekrar girin...");
	    	}
	    }

	    System.out.println();
	    
	    System.out.println("Sorulardaki hangi puana kaç kiþinin puan verdiðini gösteren tablo:");
	    System.out.println("Puanlar: 1 2 3 4 5 6 7 8 9 10");
	    System.out.println("-----------------------------");
	    
	    for(int i=0; i<5; i++) {//Sorulara göre verilen puanlarýn kiþi sayýsý ile gösterildiði tablo (Örneðin 1. soruda 5 puanýný 3 kiþi verdi, 1 puanýný 4 kiþi verdi gibi) 
	    	
	    	System.out.print("Soru" + (i+1) + ":   ");
	    	
	    	for(int j=0; j<10; j++) {
	    		
	    		System.out.print(yanýt[i][j]);
	    		System.out.printf(" ");
	    	}
	    	
	    	System.out.println();	
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	    for(int i=0; i<5; i++) {
	        
	    	for(int j=0; j<10; j++) {
	    		
	    		toplamPuan[i] = toplamPuan[i] + yanýt2[i][j];//Sorulara verilen toplam puaný hesaplýyor
	    		toplamKiþi[i] = yanýt[i][j] + toplamKiþi[i];//Kiþi sayýsýný hesaplýyor
	        }
	    
	        if(enKüçük > toplamPuan[i]) {
	        	
	        	enKüçük = toplamPuan[i];
	        	a = i + 1;
	        }
	        
	        if(enBüyük < toplamPuan[i]) {
	        	
	        	enBüyük = toplamPuan[i];
	        	b = i + 1;
	        }
	    
	        System.out.printf((i+1) + ".Sorunun puaný: " + toplamPuan[i] + "  ve ortalamasý: " + (toplamPuan[i]/toplamKiþi[i]));
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("En küçük puan: " + enKüçük + " ve " + a + ".Soru");
	    System.out.println("En büyük puan: " + enBüyük + " ve " + b + ".Soru");
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Sorulara verilen cevaplarýn tablodaki puansal daðýlýmý:");
	    
	    for(int i=0 ; i<5; i++) {
	    	
	    	System.out.print("Soru" + (i+1) + ": ");
	    	
	    	for(int j=0 ; j<10; j++) {
	    		
	    		System.out.print(yanýt2[i][j]);
	    		
	    		System.out.print(" ");
	    	}
	    	System.out.println();
	    }
	}
}