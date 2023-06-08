import java.io.*;
import java.util.ArrayList;

public class Dosya��lemleri {
	
	ArrayList<String> dosyaSat�rlar� = new ArrayList<>();
	
	static boolean �ifreleme��lemleri = false;
	
	int sat�rSay�s� = 0;
	String dosya�smi;
	String sat�r;
	
	@SuppressWarnings("null")
	public Dosya��lemleri(String dosya�smiGirdi) throws IOException {
		
		this.dosya�smi = dosya�smiGirdi;
	
		File dosya = new File(this.dosya�smi + ".txt");

//=========================DOSYA OKUMA ��LEMLER�=========================
		if(dosya.exists()) {
				
			FileReader dosyaOkuyucu = new FileReader(dosya);
			BufferedReader sat�rOkuyucu = new BufferedReader(dosyaOkuyucu);
			
			while ((sat�r = sat�rOkuyucu.readLine()) != null) {
	    		
				dosyaSat�rlar�.add(sat�r);
				sat�rSay�s�++;
		    }
			
			sat�rOkuyucu.close();
		}
		else {
			
			File dosya2 = new File(this.dosya�smi + "�ifrelenmi�.txt");
			
			FileReader dosyaOkuyucu = new FileReader(dosya2);
			BufferedReader sat�rOkuyucu = new BufferedReader(dosyaOkuyucu);
			
			while ((sat�r = sat�rOkuyucu.readLine()) != null) {
	    		
				dosyaSat�rlar�.add(sat�r);
				sat�rSay�s�++;
		    }
			
			sat�rOkuyucu.close();
		}
//=========================DOSYA OKUMA ��LEMLER�=========================	
	}
	
	
		
//=========================DOSYA YAZMA ��LEMLER�=========================
	public boolean �ifreliYazd�rma() throws IOException {
		
		File dosya1 = new File(this.dosya�smi + ".txt");
		File dosya2 = new File(this.dosya�smi + "�ifrelenmi�.txt");
		
		FileWriter dosyaYaz�c� = new FileWriter(dosya1);
		BufferedWriter sat�rYaz�c� = new BufferedWriter(dosyaYaz�c�);
		
		int sat�rSayac� = 0;
		int karakterler = 0;
		int sat�rUzunlu�u = 0;
		char �ifrelenecekKarakter;
		
		while(sat�rSay�s� > sat�rSayac�) {
			
			sat�rUzunlu�u = dosyaSat�rlar�.get(sat�rSayac�).length();
			
			while(karakterler < sat�rUzunlu�u){
				
				�ifrelenecekKarakter = (dosyaSat�rlar�.get(sat�rSayac�).charAt(karakterler));
					
				sat�rYaz�c�.write(�ifreleme(�ifrelenecekKarakter));
					
				karakterler++;
			}
			
			sat�rYaz�c�.write("\n");
			karakterler = 0;
			sat�rSayac�++;
		}
		
		sat�rYaz�c�.flush();
		sat�rYaz�c�.close();
		
		return dosya1.renameTo(dosya2);
	}
	
	public boolean �ifresizYazd�rma() throws IOException {
			
		File dosya1 = new File(this.dosya�smi + "�ifrelenmi�.txt");
		File dosya2 = new File(this.dosya�smi + ".txt");
		
		FileWriter dosyaYaz�c� = new FileWriter(dosya1);
		BufferedWriter sat�rYaz�c� = new BufferedWriter(dosyaYaz�c�);
		
		int sat�rSayac� = 0;
		int karakterler = 0;
		int sat�rUzunlu�u = 0;
		char �ifrelenecekKarakter;
		
		while(sat�rSay�s� > sat�rSayac�) {
			
			sat�rUzunlu�u = dosyaSat�rlar�.get(sat�rSayac�).length();
			
			while(karakterler < sat�rUzunlu�u){
				
				�ifrelenecekKarakter = (dosyaSat�rlar�.get(sat�rSayac�).charAt(karakterler));
				
				sat�rYaz�c�.write(�ifre��zme(�ifrelenecekKarakter));
				
				karakterler++;
			}
			
			sat�rYaz�c�.write("\n");
			karakterler = 0;
			sat�rSayac�++;
		}
		
		sat�rYaz�c�.flush();
		sat�rYaz�c�.close();
			
		return dosya1.renameTo(dosya2);
	}
//=========================DOSYA YAZMA ��LEMLER�=========================
	
	
	
//=========================��FRE ��LEMLER�=========================
	public static int �ifreleme(char harfGirdi) {
		
		if(Character.isLetter(harfGirdi)) {
			/*
			if(Character.isUpperCase(harfGirdi)) {
	
				return (char) (((harfGirdi - 'A') + 13) % 26 + 'A');
			}
			else if(Character.isLowerCase(harfGirdi)) {
				
				return (char) (((harfGirdi - 'a') + 13) % 26 + 'a');
			}*/
			if(harfGirdi == 'A') {
				
				return (char) (harfGirdi = 'k');
			}
			if(harfGirdi == 'B') {
				
				return (char) (harfGirdi = 'l');
			}
			if(harfGirdi == 'C') {
				
				return (char) (harfGirdi = 'm');
			}
			if(harfGirdi == 'D') {
				
				return (char) (harfGirdi = 'n');
			}
			if(harfGirdi == 'E') {
				
				return (char) (harfGirdi = 'o');
			}
			if(harfGirdi == 'F') {
				
				return (char) (harfGirdi = 'p');
			}
			if(harfGirdi == 'G') {
				
				return (char) (harfGirdi = 'q');
			}
			if(harfGirdi == 'H') {
				
				return (char) (harfGirdi = 'r');
			}
			if(harfGirdi == 'I') {
				
				return (char) (harfGirdi = 's');
			}
			if(harfGirdi == 'J') {
				
				return (char) (harfGirdi = 'F');
			}
			if(harfGirdi == 'K') {
				
				return (char) (harfGirdi = 'G');
			}
			if(harfGirdi == 'L') {
				
				return (char) (harfGirdi = 'J');
			}
			if(harfGirdi == 'M') {
				
				return (char) (harfGirdi = 'D');
			}
			if(harfGirdi == 'N') {
				
				return (char) (harfGirdi = 'z');
			}
			if(harfGirdi == 'O') {
				
				return (char) (harfGirdi = 'i');
			}
			if(harfGirdi == 'P') {
				
				return (char) (harfGirdi = 'T');
			}
			if(harfGirdi == 'Q') {
				
				return (char) (harfGirdi = 'U');
			}
			if(harfGirdi == 'R') {
				
				return (char) (harfGirdi = 'b');
			}
			if(harfGirdi == 'S') {
				
				return (char) (harfGirdi = 'Z');
			}
			if(harfGirdi == 'T') {
				
				return (char) (harfGirdi = 't');
			}
			if(harfGirdi == 'U') {
				
				return (char) (harfGirdi = 'X');
			}
			if(harfGirdi == 'V') {
				
				return (char) (harfGirdi = 'E');
			}
			if(harfGirdi == 'W') {
				
				return (char) (harfGirdi = 'W');
			}
			if(harfGirdi == 'X') {
				
				return (char) (harfGirdi = 'd');
			}
			if(harfGirdi == 'Y') {
				
				return (char) (harfGirdi = 'g');
			}
			if(harfGirdi == 'Z') {
				
				return (char) (harfGirdi = 'j');
			}
			if(harfGirdi == 'a') {
				
				return (char) (harfGirdi = 'K');
			}
			if(harfGirdi == 'b') {
				
				return (char) (harfGirdi = 'L');
			}
			if(harfGirdi == 'c') {
				
				return (char) (harfGirdi = 'M');
			}
			if(harfGirdi == 'd') {
				
				return (char) (harfGirdi = 'N');
			}
			if(harfGirdi == 'e') {
				
				return (char) (harfGirdi = 'O');
			}
			if(harfGirdi == 'f') {
				
				return (char) (harfGirdi = 'P');
			}
			if(harfGirdi == 'g') {
				
				return (char) (harfGirdi = 'Q');
			}
			if(harfGirdi == 'h') {
				
				return (char) (harfGirdi = 'R');
			}
			if(harfGirdi == 'i') {
				
				return (char) (harfGirdi = 'S');
			}
			if(harfGirdi == 'j') {
				
				return (char) (harfGirdi = 'v');
			}
			if(harfGirdi == 'k') {
				
				return (char) (harfGirdi = 'C');
			}
			if(harfGirdi == 'l') {
				
				return (char) (harfGirdi = 'c');
			}
			if(harfGirdi == 'm') {
				
				return (char) (harfGirdi = 'I');
			}
			if(harfGirdi == 'n') {
				
				return (char) (harfGirdi = 'h');
			}
			if(harfGirdi == 'o') {
				
				return (char) (harfGirdi = 'a');
			}
			if(harfGirdi == 'p') {
				
				return (char) (harfGirdi = 'Y');
			}
			if(harfGirdi == 'q') {
				
				return (char) (harfGirdi = 'A');
			}
			if(harfGirdi == 'r') {
				
				return (char) (harfGirdi = 'H');
			}
			if(harfGirdi == 's') {
				
				return (char) (harfGirdi = 'V');
			}
			if(harfGirdi == 't') {
				
				return (char) (harfGirdi = 'y');
			}
			if(harfGirdi == 'u') {
				
				return (char) (harfGirdi = 'e');
			}
			if(harfGirdi == 'v') {
				
				return (char) (harfGirdi = 'U');
			}
			if(harfGirdi == 'w') {
				
				return (char) (harfGirdi = 'B');
			}
			if(harfGirdi == 'x') {
				
				return (char) (harfGirdi = 'x');
			}
			if(harfGirdi == 'y') {
				
				return (char) (harfGirdi = 'w');
			}
			if(harfGirdi == 'z') {
				
				return (char) (harfGirdi = 'f');
			}
		}
		else if(Character.isDigit(harfGirdi)) {
			
			if('5' == harfGirdi) {
				
				return (char) (harfGirdi='0');
			}
			if('0' == harfGirdi) {
				
				return (char) (harfGirdi='1');
			}
			if('1' == harfGirdi) {
				
				return (char) (harfGirdi='2');
			}
			if('6' == harfGirdi) {
				
				return (char) (harfGirdi='3');
			}
			if('7' == harfGirdi) {
				
				return (char) (harfGirdi='4');
			}
			if('2' == harfGirdi) {
				
				return (char) (harfGirdi='5');
			}
			if('3' == harfGirdi) {
	
				return (char) (harfGirdi='6');
			}
			if('4' == harfGirdi) {
	
				return (char) (harfGirdi='7');
			}
			if('9' == harfGirdi) {
	
				return (char) (harfGirdi='8');
			}
			if('8' == harfGirdi) {
	
				return (char) (harfGirdi='9');
			}
		}
		else if(!Character.isLetter(harfGirdi) == !Character.isDigit(harfGirdi)) {
			
			if(harfGirdi == '+') {
				
				return harfGirdi = '/';
			}
			if(harfGirdi == '-') {
				
				return harfGirdi = '*';
			}
			if(harfGirdi == '*') {
				
				return harfGirdi = '+';
			}
			if(harfGirdi == '/') {
				
				return harfGirdi = '-';
			}
			if(harfGirdi == '.') {
				
				return harfGirdi = ',';
			}
			if(harfGirdi == ';') {
				
				return harfGirdi = '.';
			}
			if(harfGirdi == ',') {
				
				return harfGirdi = ';';
			}
			if(harfGirdi == '"') {
				
				return harfGirdi = '#';
			}
			if(harfGirdi == '#') {
				
				return harfGirdi = '=';
			}
			if(harfGirdi == '=') {
				
				return harfGirdi = '"';
			}
			
			return harfGirdi;
		}
		
		return harfGirdi;
	}
	
	public static int �ifre��zme(char harfGirdi) {
		
		if(Character.isLetter(harfGirdi)) {
			/*
			if(Character.isUpperCase(harfGirdi)) {
			
				return (char) (((harfGirdi - 'A') + 13) % 26 + 'A');
			}
			else if(Character.isLowerCase(harfGirdi)) {
				
				return (char) (((harfGirdi - 'a') + 13) % 26 + 'a');
			}*/
			if(harfGirdi == 'k') {
				
				return (char) (harfGirdi = 'A');
			}
			if(harfGirdi == 'l') {
				
				return (char) (harfGirdi = 'B');
			}
			if(harfGirdi == 'm') {
				
				return (char) (harfGirdi = 'C');
			}
			if(harfGirdi == 'n') {
				
				return (char) (harfGirdi = 'D');
			}
			if(harfGirdi == 'o') {
				
				return (char) (harfGirdi = 'E');
			}
			if(harfGirdi == 'p') {
				
				return (char) (harfGirdi = 'F');
			}
			if(harfGirdi == 'q') {
				
				return (char) (harfGirdi = 'G');
			}
			if(harfGirdi == 'r') {
				
				return (char) (harfGirdi = 'H');
			}
			if(harfGirdi == 's') {
				
				return (char) (harfGirdi = 'I');
			}
			if(harfGirdi == 'F') {
				
				return (char) (harfGirdi = 'J');
			}
			if(harfGirdi == 'G') {
				
				return (char) (harfGirdi = 'K');
			}
			if(harfGirdi == 'J') {
				
				return (char) (harfGirdi = 'L');
			}
			if(harfGirdi == 'D') {
				
				return (char) (harfGirdi = 'M');
			}
			if(harfGirdi == 'z') {
				
				return (char) (harfGirdi = 'N');
			}
			if(harfGirdi == 'i') {
				
				return (char) (harfGirdi = 'O');
			}
			if(harfGirdi == 'T') {
				
				return (char) (harfGirdi = 'P');
			}
			if(harfGirdi == 'U') {
				
				return (char) (harfGirdi = 'v');
			}
			if(harfGirdi == 'b') {
				
				return (char) (harfGirdi = 'R');
			}
			if(harfGirdi == 'Z') {
				
				return (char) (harfGirdi = 'S');
			}
			if(harfGirdi == 't') {
				
				return (char) (harfGirdi = 'T');
			}
			if(harfGirdi == 'X') {
				
				return (char) (harfGirdi = 'U');
			}
			if(harfGirdi == 'E') {
				
				return (char) (harfGirdi = 'V');
			}
			if(harfGirdi == 'W') {
				
				return (char) (harfGirdi = 'W');
			}
			if(harfGirdi == 'd') {
				
				return (char) (harfGirdi = 'X');
			}
			if(harfGirdi == 'g') {
				
				return (char) (harfGirdi = 'Y');
			}
			if(harfGirdi == 'j') {
				
				return (char) (harfGirdi = 'Z');
			}
			if(harfGirdi == 'K') {
				
				return (char) (harfGirdi = 'a');
			}
			if(harfGirdi == 'L') {
				
				return (char) (harfGirdi = 'b');
			}
			if(harfGirdi == 'M') {
				
				return (char) (harfGirdi = 'c');
			}
			if(harfGirdi == 'N') {
				
				return (char) (harfGirdi = 'd');
			}
			if(harfGirdi == 'O') {
				
				return (char) (harfGirdi = 'e');
			}
			if(harfGirdi == 'P') {
				
				return (char) (harfGirdi = 'f');
			}
			if(harfGirdi == 'Q') {
				
				return (char) (harfGirdi = 'g');
			}
			if(harfGirdi == 'R') {
				
				return (char) (harfGirdi = 'h');
			}
			if(harfGirdi == 'S') {
				
				return (char) (harfGirdi = 'i');
			}
			if(harfGirdi == 'v') {
				
				return (char) (harfGirdi = 'j');
			}
			if(harfGirdi == 'C') {
				
				return (char) (harfGirdi = 'k');
			}
			if(harfGirdi == 'c') {
				
				return (char) (harfGirdi = 'l');
			}
			if(harfGirdi == 'I') {
				
				return (char) (harfGirdi = 'm');
			}
			if(harfGirdi == 'h') {
				
				return (char) (harfGirdi = 'n');
			}
			if(harfGirdi == 'a') {
				
				return (char) (harfGirdi = 'o');
			}
			if(harfGirdi == 'Y') {
				
				return (char) (harfGirdi = 'p');
			}
			if(harfGirdi == 'A') {
				
				return (char) (harfGirdi = 'q');
			}
			if(harfGirdi == 'H') {
				
				return (char) (harfGirdi = 'r');
			}
			if(harfGirdi == 'V') {
				
				return (char) (harfGirdi = 's');
			}
			if(harfGirdi == 'y') {
				
				return (char) (harfGirdi = 't');
			}
			if(harfGirdi == 'e') {
				
				return (char) (harfGirdi = 'u');
			}
			if(harfGirdi == 'U') {
				
				return (char) (harfGirdi = 'v');
			}
			if(harfGirdi == 'B') {
				
				return (char) (harfGirdi = 'w');
			}
			if(harfGirdi == 'x') {
				
				return (char) (harfGirdi = 'x');
			}
			if(harfGirdi == 'w') {
				
				return (char) (harfGirdi = 'y');
			}
			if(harfGirdi == 'f') {
				
				return (char) (harfGirdi = 'z');
			}
		}
		else if(Character.isDigit(harfGirdi)) {
			
			if('0' == harfGirdi) {
				
				return (char) (harfGirdi='5');
			}
			if('1' == harfGirdi) {
				
				return (char) (harfGirdi='0');
			}
			if('2' == harfGirdi) {
				
				return (char) (harfGirdi='1');
			}
			if('3' == harfGirdi) {
				
				return (char) (harfGirdi='6');
			}
			if('4' == harfGirdi) {
				
				return (char) (harfGirdi='7');
			}
			if('5' == harfGirdi) {
				
				return (char) (harfGirdi='2');
			}
			if('6' == harfGirdi) {
	
				return (char) (harfGirdi='3');
			}
			if('7' == harfGirdi) {
	
				return (char) (harfGirdi='4');
			}
			if('8' == harfGirdi) {
	
				return (char) (harfGirdi='9');
			}
			if('9' == harfGirdi) {
	
				return (char) (harfGirdi='8');
			}		
		}
		else if(!Character.isLetter(harfGirdi) == !Character.isDigit(harfGirdi)) {
			
			if(harfGirdi == '+') {
				
				return harfGirdi = '*';
			}
			if(harfGirdi == '-') {
				
				return harfGirdi = '/';
			}
			if(harfGirdi == '*') {
				
				return harfGirdi = '-';
			}
			if(harfGirdi == '/') {
				
				return harfGirdi = '+';
			}
			if(harfGirdi == ',') {
				
				return harfGirdi = '.';
			}
			if(harfGirdi == '.') {
				
				return harfGirdi = ';';
			}
			if(harfGirdi == ';') {
	
				return harfGirdi = ',';
			}
			if(harfGirdi == '#') {
				
				return harfGirdi = '"';
			}
			if(harfGirdi == '=') {
				
				return harfGirdi = '#';
			}
			if(harfGirdi == '"') {
				
				return harfGirdi = '=';
			}
			
			return harfGirdi;
		}
		
		return harfGirdi;
	}
//=========================��FRE ��LEMLER�=========================
}