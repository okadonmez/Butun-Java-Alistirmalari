import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Düþman {
	
	Harita HaritaObjesi = new Harita();
	
	int maviDüþmanX = 700;
	int maviDüþmanY = 700;
	int maviDüþmanGeniþlik = 50;
	int maviDüþmanYükseklik = 50;
	boolean maviDüþmanÝleri = true;
	
	int kýrmýzýDüþmanX = 0;
	int kýrmýzýDüþmanY = 0;
	int kýrmýzýDüþmanGeniþlik = 50;
	int kýrmýzýDüþmanYükseklik = 50;
	
	int renkliDüþmanX = 0;
	int renkliDüþmanY = 0;
	int renkliDüþmanGeniþlik = 50;
	int renkliDüþmanYükseklik = 50;
	int renkliDüþmanYolSayacý = 0;
	boolean renkliDüþmanÝleri = true;
	
	int yeþilSiyahDüþmanX = 350;
	int yeþilSiyahDüþmanY = 0;
	int yeþilSiyahDüþmanGeniþlik = 50;
	int yeþilSiyahDüþmanYükseklik = 50;
	int yeþilSiyahDüþmanYolSayacý = 0;
	boolean yeþilSiyahDüþmanÝleri = true;
	
	int lilaDüþmanX = 250;
	int lilaDüþmanY = 250;
	int lilaDüþmanGeniþlik = 50;
	int lilaDüþmanYükseklik = 50;
	int lilaDüþmanYolSayacý = 0;
	int lilaDüþmanBölgesi = 1;
	boolean lilaDüþmanÝleri = true;
	boolean lilaDüþmanTemas = false;
	
	Random rastgeleDüþmanKoordinatý = new Random();
	
//=========================DÜÞMAN HAREKETÝ=========================
	public void DüþmanHareketi() {
		//-------------------------MAVÝ DÜÞMAN HAREKETÝ-------------------------
		if (maviDüþmanÝleri == true) {
				
			int süre = 2;
			Timer maviDüþmanTimer = new Timer();	
			maviDüþmanÝleri = false;
							
			maviDüþmanTimer.schedule(new TimerTask() {
			
				@Override
				public void run() {
							
					maviDüþmanÝleri = true;
							
					maviDüþmanX = rastgeleDüþmanKoordinatý.nextInt(750);
					maviDüþmanY = rastgeleDüþmanKoordinatý.nextInt(750);
							
					maviDüþmanTimer.cancel();
				}
			}, süre*1000);
		}
	//-------------------------MAVÝ DÜÞMAN HAREKETÝ-------------------------
		
			
			
	//-------------------------KIRMIZI DÜÞMAN HAREKETÝ-------------------------
		if(this.kýrmýzýDüþmanX <= HaritaObjesi.yediyüzX && this.kýrmýzýDüþmanY == HaritaObjesi.sýfýrY) {
					
			this.kýrmýzýDüþmanX += 50;
				
			if(this.kýrmýzýDüþmanX == HaritaObjesi.yediyüzX) {
					
				HaritaObjesi.sýfýrX += 50;
				HaritaObjesi.yediyüzX -= 50;
				this.kýrmýzýDüþmanX = HaritaObjesi.yediyüzX;
			}
		}
				
		if(this.kýrmýzýDüþmanX == HaritaObjesi.yediyüzX && this.kýrmýzýDüþmanY <= HaritaObjesi.yediyüzY) {
				
			this.kýrmýzýDüþmanY += 50;
				
			if(this.kýrmýzýDüþmanY == HaritaObjesi.yediyüzY) {
					
				HaritaObjesi.yediyüzY -= 50;
				HaritaObjesi.sýfýrY += 50;
				this.kýrmýzýDüþmanY = HaritaObjesi.yediyüzY;
			}
		}
			
		if(this.kýrmýzýDüþmanX <= HaritaObjesi.yediyüzX && this.kýrmýzýDüþmanY == HaritaObjesi.yediyüzY) {
						
			this.kýrmýzýDüþmanX -= 50;
				
			if(this.kýrmýzýDüþmanX == HaritaObjesi.yediyüzX) {
					
				HaritaObjesi.yediyüzX -= 50;
				HaritaObjesi.sýfýrX += 50;
				this.kýrmýzýDüþmanX = HaritaObjesi.sýfýrX;
			}
		}
		    
		if(this.kýrmýzýDüþmanX == HaritaObjesi.sýfýrX && this.kýrmýzýDüþmanY <= HaritaObjesi.yediyüzY) {
				
				
			this.kýrmýzýDüþmanY -= 50;
				
			if(this.kýrmýzýDüþmanY == HaritaObjesi.yediyüzY) {
					
				HaritaObjesi.yediyüzY -= 50;
				HaritaObjesi.sýfýrY += 50;
				this.kýrmýzýDüþmanY = HaritaObjesi.sýfýrY;
			}
		}
		//-------------------------KIRMIZI DÜÞMAN HAREKETÝ-------------------------
		
		
		
		//-------------------------RENKLÝ DÜÞMAN HAREKETÝ-------------------------
		if(renkliDüþmanÝleri == true) {
				
			if(renkliDüþmanYolSayacý < 14) {
				
				this.renkliDüþmanX += 50;
				this.renkliDüþmanY += 50;
					
				renkliDüþmanYolSayacý++;
			}
			else if(renkliDüþmanYolSayacý >= 14) {
					
				this.renkliDüþmanX -= 50;

				renkliDüþmanYolSayacý++;
					
				if(renkliDüþmanYolSayacý == 28) {
						
					renkliDüþmanÝleri = false;
					renkliDüþmanYolSayacý = 0;
				}
			}
		}
		if(renkliDüþmanÝleri == false) {
			
			if(renkliDüþmanYolSayacý < 14) {
					
				this.renkliDüþmanX += 50;
				this.renkliDüþmanY -= 50;
					
				renkliDüþmanYolSayacý++;
			}	
			else if(renkliDüþmanYolSayacý >= 14) {
					
				this.renkliDüþmanX -= 50;
					
				renkliDüþmanYolSayacý++;
					
				if(renkliDüþmanYolSayacý == 28) {
						
					renkliDüþmanÝleri = true;
					renkliDüþmanYolSayacý = 0;
				}
			}
		}
		//-------------------------RENKLÝ DÜÞMAN HAREKETÝ-------------------------
		
		
		
		//-------------------------YEÞÝL-SÝYAH DÜÞMAN HAREKETÝ-------------------------
		if(yeþilSiyahDüþmanÝleri == true) {
				
			if(yeþilSiyahDüþmanYolSayacý < 7) {
					
				yeþilSiyahDüþmanY +=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 6 && yeþilSiyahDüþmanYolSayacý < 15) {
			
				yeþilSiyahDüþmanX +=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 14 && yeþilSiyahDüþmanYolSayacý < 23) {
					
				yeþilSiyahDüþmanX -=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 22 && yeþilSiyahDüþmanYolSayacý < 31) {
					
				yeþilSiyahDüþmanY +=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 30 && yeþilSiyahDüþmanYolSayacý < 39) {
					
				yeþilSiyahDüþmanY -=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 38 && yeþilSiyahDüþmanYolSayacý < 47) {
					
				yeþilSiyahDüþmanX -=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 46 && yeþilSiyahDüþmanYolSayacý < 55) {
					
				yeþilSiyahDüþmanX +=50;
				yeþilSiyahDüþmanYolSayacý++;
			}
			if(yeþilSiyahDüþmanYolSayacý > 54 && yeþilSiyahDüþmanYolSayacý < 63) {
					
				yeþilSiyahDüþmanY -=50;
				yeþilSiyahDüþmanYolSayacý++;
					
				if(yeþilSiyahDüþmanYolSayacý == 62) {
						
					yeþilSiyahDüþmanYolSayacý = 0;
				}
			}
		}	
		//-------------------------YEÞÝL-SÝYAH DÜÞMAN HAREKETÝ-------------------------
		

		
		//-------------------------LÝLA DÜÞMAN HAREKETÝ-------------------------
		if(lilaDüþmanÝleri == true) {
				
			if(lilaDüþmanYolSayacý < 4) {
				
				lilaDüþmanX -=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 3 && lilaDüþmanYolSayacý < 8) {
					
				lilaDüþmanY -=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 7 && lilaDüþmanYolSayacý < 12) {
					
				lilaDüþmanX +=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 11 && lilaDüþmanYolSayacý < 15) {
					
				lilaDüþmanY +=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 14 && lilaDüþmanYolSayacý < 18) {
					
				lilaDüþmanX -=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 17 && lilaDüþmanYolSayacý < 20) {
					
				lilaDüþmanY -=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 19 && lilaDüþmanYolSayacý < 22) {
					
				lilaDüþmanX +=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 21 && lilaDüþmanYolSayacý < 23) {
					
				lilaDüþmanY +=50;
				lilaDüþmanYolSayacý++;
			}
			if(lilaDüþmanYolSayacý > 22 && lilaDüþmanYolSayacý < 24) {
					
				lilaDüþmanX -=50;
				lilaDüþmanYolSayacý++;
				
				lilaDüþmanÝleri = false;
			}
				
			if(lilaDüþmanÝleri == false) {
					
				lilaDüþmanYolSayacý = 0;
				lilaDüþmanBölgesi++;
					
				if(lilaDüþmanBölgesi == 1) {
						
					lilaDüþmanX = 250;
					lilaDüþmanY = 250;
				}
				else if(lilaDüþmanBölgesi == 2) {
						
					lilaDüþmanX = 650;
					lilaDüþmanY = 250;
				}
				else if(lilaDüþmanBölgesi == 3) {
						
					lilaDüþmanX = 250;
					lilaDüþmanY = 650;
				}
				else if(lilaDüþmanBölgesi == 4) {
		
					lilaDüþmanX = 650;
					lilaDüþmanY = 650;
						
					lilaDüþmanBölgesi = 0;
				}
					
				lilaDüþmanÝleri = true;
			}
		}
			
		if (lilaDüþmanTemas == true) {
				
			int süre = 5;
			Timer lilaDüþmanTimer = new Timer();	
							
			lilaDüþmanTimer.schedule(new TimerTask() {
					
				@Override
				public void run() {
					
					lilaDüþmanTemas = false;
					lilaDüþmanTimer.cancel();
				}
			}, süre*1000);
		}
		//-------------------------LÝLA DÜÞMAN HAREKETÝ-------------------------	
	}
//=========================DÜÞMAN HAREKETÝ=========================
}
