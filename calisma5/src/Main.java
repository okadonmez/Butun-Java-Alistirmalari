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
		
		Scanner giri� = new Scanner(System.in);
		
		int[] s�raNumaras� = new int[10];
		String[] ad� = new String[10];
		String[] soyad� = new String[10];
		int[] vizeNotu = new int[10];
		int[] finalNotu = new int[10];
		double[] notOrtalamas� = new double[10];
		
		File dosya = new File("NotOrtalama.txt");
		
		if(!dosya.exists()) {
			
			dosya.createNewFile();
		}
		
		FileWriter dosyayaYazma = new FileWriter(dosya);
		BufferedWriter bWriter = new BufferedWriter(dosyayaYazma);
		
		bWriter.write("S�ra Numaras� | ��rencinin Ad� | ��rencinin Soyad� | Vize Notu | Final Notu \n");
		bWriter.write("---------------------------------------------------------------------------\n\n");
		
	    for(int i=0; i<10; i++) {
	    	
	    	System.out.print((i + 1) + ". ��rencinin s�ra numaras�: ");
	    	s�raNumaras�[i] = giri�.nextInt();
	    	
	    	System.out.print((i + 1) + ". ��rencinin ad�: ");
	    	ad�[i] = giri�.next();
	    	
	    	System.out.print((i + 1) + ". ��rencinin soyad�: ");
	    	soyad�[i] = giri�.next();
	    	
	    	System.out.print((i + 1) + ". ��rencinin vize notu: ");
	    	vizeNotu[i] = giri�.nextInt();
	    	
	    	System.out.print((i + 1) + ". ��rencinin final notu: ");
	    	finalNotu[i] = giri�.nextInt();
	    	System.out.print("\n");
	    	
	    	
	    	bWriter.write((i + 1)+". ��renci: "+s�raNumaras�[i]+" | "+ad�[i]+" | "+soyad�[i]+" | "+vizeNotu[i]+" | "+finalNotu[i]);
		    bWriter.write("\n");
	    }
	    bWriter.flush();//BELLE�� BO�ALTIYOR VE ARDINDAN DOSYA OKUMA ��LEM� GER�EKLE��YOR
	    
	    
	    FileReader dosyay�Okuma = new FileReader(dosya);
	    String sat�r;
	    
	    BufferedReader sat�rOkuma = new BufferedReader(dosyay�Okuma);
	    
	    int i=0;
	    
	    while ((sat�r = sat�rOkuma.readLine()) != null) {
	    		
	    	if(((i + 1)+". ��renci: "+s�raNumaras�[i]+" | "+ad�[i]+" | "+soyad�[i]+" | "+vizeNotu[i]+" | "+finalNotu[i]).equals(sat�r)) {
	    			
	    		notOrtalamas�[i] = vizeNotu[i] * ((double)3 / (double)10) + finalNotu[i] * ((double)7 / (double)10);
	    		i++;	
	    	}
	    }
	    sat�rOkuma.close();
	    

	    bWriter.write("\n\n\n\n");
	    bWriter.write("-Not Ortalamalar�-\n");
	    bWriter.write("------------------\n\n");
			
	    for(i=0; i<10; i++) {
	    	
	    	bWriter.write((i + 1)+". ��renci: "+notOrtalamas�[i]);
		    bWriter.write("\n");
	    }
	    bWriter.close();	
	}
}
