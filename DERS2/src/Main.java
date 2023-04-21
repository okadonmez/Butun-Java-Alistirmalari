import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
		Scanner giriþ = new Scanner(System.in);
		
		int[] sýraNumarasý = new int[10];
		String[] adý = new String[10];
		String[] soyadý = new String[10];
		int[] vizeNotu = new int[10];
		int[] finalNotu = new int[10];
		double[] notOrtalamasý = new double[10];
		
		File dosya = new File("NotOrtalama.txt");
		
		if(!dosya.exists()) {
			
			dosya.createNewFile();
		}
		
		FileWriter dosyayaYazma = new FileWriter(dosya);
		BufferedWriter bWriter = new BufferedWriter(dosyayaYazma);
		
		bWriter.write("Sýra Numarasý | Öðrencinin Adý | Öðrencinin Soyadý | Vize Notu | Final Notu \n");
		bWriter.write("---------------------------------------------------------------------------\n\n");
		
	    for(int i=0; i<10; i++) {
	    	
	    	System.out.print((i + 1) + ". Öðrencinin sýra numarasý: ");
	    	sýraNumarasý[i] = giriþ.nextInt();
	    	
	    	System.out.print((i + 1) + ". Öðrencinin adý: ");
	    	adý[i] = giriþ.next();
	    	
	    	System.out.print((i + 1) + ". Öðrencinin soyadý: ");
	    	soyadý[i] = giriþ.next();
	    	
	    	System.out.print((i + 1) + ". Öðrencinin vize notu: ");
	    	vizeNotu[i] = giriþ.nextInt();
	    	
	    	System.out.print((i + 1) + ". Öðrencinin final notu: ");
	    	finalNotu[i] = giriþ.nextInt();
	    	System.out.print("\n");
	    	
	    	
	    	bWriter.write((i + 1)+". Öðrenci: "+sýraNumarasý[i]+" | "+adý[i]+" | "+soyadý[i]+" | "+vizeNotu[i]+" | "+finalNotu[i]);
		    bWriter.write("\n");
	    }
	    bWriter.flush();//BELLEÐÝ BOÞALTIYOR VE ARDINDAN DOSYA OKUMA ÝÞLEMÝ GERÇEKLEÞÝYOR
	    
	    
	    FileReader dosyayýOkuma = new FileReader(dosya);
	    String satýr;
	    
	    BufferedReader satýrOkuma = new BufferedReader(dosyayýOkuma);
	    
	    int i=0;
	    
	    while ((satýr = satýrOkuma.readLine()) != null) {
	    		
	    	if(((i + 1)+". Öðrenci: "+sýraNumarasý[i]+" | "+adý[i]+" | "+soyadý[i]+" | "+vizeNotu[i]+" | "+finalNotu[i]).equals(satýr)) {
	    			
	    		notOrtalamasý[i] = vizeNotu[i] * ((double)3 / (double)10) + finalNotu[i] * ((double)7 / (double)10);
	    		i++;	
	    	}
	    }
	    satýrOkuma.close();
	    

	    bWriter.write("\n\n\n\n");
	    bWriter.write("-Not Ortalamalarý-\n");
	    bWriter.write("------------------\n\n");
			
	    for(i=0; i<10; i++) {
	    	
	    	bWriter.write((i + 1)+". Öðrenci: "+notOrtalamasý[i]);
		    bWriter.write("\n");
	    }
	    bWriter.close();	
	}
}
