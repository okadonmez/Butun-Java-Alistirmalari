import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class D��man {
	
	Harita HaritaObjesi = new Harita();
	
	int maviD��manX = 700;
	int maviD��manY = 700;
	int maviD��manGeni�lik = 50;
	int maviD��manY�kseklik = 50;
	boolean maviD��man�leri = true;
	
	int k�rm�z�D��manX = 0;
	int k�rm�z�D��manY = 0;
	int k�rm�z�D��manGeni�lik = 50;
	int k�rm�z�D��manY�kseklik = 50;
	
	int renkliD��manX = 0;
	int renkliD��manY = 0;
	int renkliD��manGeni�lik = 50;
	int renkliD��manY�kseklik = 50;
	int renkliD��manYolSayac� = 0;
	boolean renkliD��man�leri = true;
	
	int ye�ilSiyahD��manX = 350;
	int ye�ilSiyahD��manY = 0;
	int ye�ilSiyahD��manGeni�lik = 50;
	int ye�ilSiyahD��manY�kseklik = 50;
	int ye�ilSiyahD��manYolSayac� = 0;
	boolean ye�ilSiyahD��man�leri = true;
	
	int lilaD��manX = 250;
	int lilaD��manY = 250;
	int lilaD��manGeni�lik = 50;
	int lilaD��manY�kseklik = 50;
	int lilaD��manYolSayac� = 0;
	int lilaD��manB�lgesi = 1;
	boolean lilaD��man�leri = true;
	boolean lilaD��manTemas = false;
	
	Random rastgeleD��manKoordinat� = new Random();
	
//=========================D��MAN HAREKET�=========================
	public void D��manHareketi() {
		//-------------------------MAV� D��MAN HAREKET�-------------------------
		if (maviD��man�leri == true) {
				
			int s�re = 2;
			Timer maviD��manTimer = new Timer();	
			maviD��man�leri = false;
							
			maviD��manTimer.schedule(new TimerTask() {
			
				@Override
				public void run() {
							
					maviD��man�leri = true;
							
					maviD��manX = rastgeleD��manKoordinat�.nextInt(750);
					maviD��manY = rastgeleD��manKoordinat�.nextInt(750);
							
					maviD��manTimer.cancel();
				}
			}, s�re*1000);
		}
	//-------------------------MAV� D��MAN HAREKET�-------------------------
		
			
			
	//-------------------------KIRMIZI D��MAN HAREKET�-------------------------
		if(this.k�rm�z�D��manX <= HaritaObjesi.yediy�zX && this.k�rm�z�D��manY == HaritaObjesi.s�f�rY) {
					
			this.k�rm�z�D��manX += 50;
				
			if(this.k�rm�z�D��manX == HaritaObjesi.yediy�zX) {
					
				HaritaObjesi.s�f�rX += 50;
				HaritaObjesi.yediy�zX -= 50;
				this.k�rm�z�D��manX = HaritaObjesi.yediy�zX;
			}
		}
				
		if(this.k�rm�z�D��manX == HaritaObjesi.yediy�zX && this.k�rm�z�D��manY <= HaritaObjesi.yediy�zY) {
				
			this.k�rm�z�D��manY += 50;
				
			if(this.k�rm�z�D��manY == HaritaObjesi.yediy�zY) {
					
				HaritaObjesi.yediy�zY -= 50;
				HaritaObjesi.s�f�rY += 50;
				this.k�rm�z�D��manY = HaritaObjesi.yediy�zY;
			}
		}
			
		if(this.k�rm�z�D��manX <= HaritaObjesi.yediy�zX && this.k�rm�z�D��manY == HaritaObjesi.yediy�zY) {
						
			this.k�rm�z�D��manX -= 50;
				
			if(this.k�rm�z�D��manX == HaritaObjesi.yediy�zX) {
					
				HaritaObjesi.yediy�zX -= 50;
				HaritaObjesi.s�f�rX += 50;
				this.k�rm�z�D��manX = HaritaObjesi.s�f�rX;
			}
		}
		    
		if(this.k�rm�z�D��manX == HaritaObjesi.s�f�rX && this.k�rm�z�D��manY <= HaritaObjesi.yediy�zY) {
				
				
			this.k�rm�z�D��manY -= 50;
				
			if(this.k�rm�z�D��manY == HaritaObjesi.yediy�zY) {
					
				HaritaObjesi.yediy�zY -= 50;
				HaritaObjesi.s�f�rY += 50;
				this.k�rm�z�D��manY = HaritaObjesi.s�f�rY;
			}
		}
		//-------------------------KIRMIZI D��MAN HAREKET�-------------------------
		
		
		
		//-------------------------RENKL� D��MAN HAREKET�-------------------------
		if(renkliD��man�leri == true) {
				
			if(renkliD��manYolSayac� < 14) {
				
				this.renkliD��manX += 50;
				this.renkliD��manY += 50;
					
				renkliD��manYolSayac�++;
			}
			else if(renkliD��manYolSayac� >= 14) {
					
				this.renkliD��manX -= 50;

				renkliD��manYolSayac�++;
					
				if(renkliD��manYolSayac� == 28) {
						
					renkliD��man�leri = false;
					renkliD��manYolSayac� = 0;
				}
			}
		}
		if(renkliD��man�leri == false) {
			
			if(renkliD��manYolSayac� < 14) {
					
				this.renkliD��manX += 50;
				this.renkliD��manY -= 50;
					
				renkliD��manYolSayac�++;
			}	
			else if(renkliD��manYolSayac� >= 14) {
					
				this.renkliD��manX -= 50;
					
				renkliD��manYolSayac�++;
					
				if(renkliD��manYolSayac� == 28) {
						
					renkliD��man�leri = true;
					renkliD��manYolSayac� = 0;
				}
			}
		}
		//-------------------------RENKL� D��MAN HAREKET�-------------------------
		
		
		
		//-------------------------YE��L-S�YAH D��MAN HAREKET�-------------------------
		if(ye�ilSiyahD��man�leri == true) {
				
			if(ye�ilSiyahD��manYolSayac� < 7) {
					
				ye�ilSiyahD��manY +=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 6 && ye�ilSiyahD��manYolSayac� < 15) {
			
				ye�ilSiyahD��manX +=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 14 && ye�ilSiyahD��manYolSayac� < 23) {
					
				ye�ilSiyahD��manX -=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 22 && ye�ilSiyahD��manYolSayac� < 31) {
					
				ye�ilSiyahD��manY +=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 30 && ye�ilSiyahD��manYolSayac� < 39) {
					
				ye�ilSiyahD��manY -=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 38 && ye�ilSiyahD��manYolSayac� < 47) {
					
				ye�ilSiyahD��manX -=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 46 && ye�ilSiyahD��manYolSayac� < 55) {
					
				ye�ilSiyahD��manX +=50;
				ye�ilSiyahD��manYolSayac�++;
			}
			if(ye�ilSiyahD��manYolSayac� > 54 && ye�ilSiyahD��manYolSayac� < 63) {
					
				ye�ilSiyahD��manY -=50;
				ye�ilSiyahD��manYolSayac�++;
					
				if(ye�ilSiyahD��manYolSayac� == 62) {
						
					ye�ilSiyahD��manYolSayac� = 0;
				}
			}
		}	
		//-------------------------YE��L-S�YAH D��MAN HAREKET�-------------------------
		

		
		//-------------------------L�LA D��MAN HAREKET�-------------------------
		if(lilaD��man�leri == true) {
				
			if(lilaD��manYolSayac� < 4) {
				
				lilaD��manX -=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 3 && lilaD��manYolSayac� < 8) {
					
				lilaD��manY -=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 7 && lilaD��manYolSayac� < 12) {
					
				lilaD��manX +=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 11 && lilaD��manYolSayac� < 15) {
					
				lilaD��manY +=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 14 && lilaD��manYolSayac� < 18) {
					
				lilaD��manX -=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 17 && lilaD��manYolSayac� < 20) {
					
				lilaD��manY -=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 19 && lilaD��manYolSayac� < 22) {
					
				lilaD��manX +=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 21 && lilaD��manYolSayac� < 23) {
					
				lilaD��manY +=50;
				lilaD��manYolSayac�++;
			}
			if(lilaD��manYolSayac� > 22 && lilaD��manYolSayac� < 24) {
					
				lilaD��manX -=50;
				lilaD��manYolSayac�++;
				
				lilaD��man�leri = false;
			}
				
			if(lilaD��man�leri == false) {
					
				lilaD��manYolSayac� = 0;
				lilaD��manB�lgesi++;
					
				if(lilaD��manB�lgesi == 1) {
						
					lilaD��manX = 250;
					lilaD��manY = 250;
				}
				else if(lilaD��manB�lgesi == 2) {
						
					lilaD��manX = 650;
					lilaD��manY = 250;
				}
				else if(lilaD��manB�lgesi == 3) {
						
					lilaD��manX = 250;
					lilaD��manY = 650;
				}
				else if(lilaD��manB�lgesi == 4) {
		
					lilaD��manX = 650;
					lilaD��manY = 650;
						
					lilaD��manB�lgesi = 0;
				}
					
				lilaD��man�leri = true;
			}
		}
			
		if (lilaD��manTemas == true) {
				
			int s�re = 5;
			Timer lilaD��manTimer = new Timer();	
							
			lilaD��manTimer.schedule(new TimerTask() {
					
				@Override
				public void run() {
					
					lilaD��manTemas = false;
					lilaD��manTimer.cancel();
				}
			}, s�re*1000);
		}
		//-------------------------L�LA D��MAN HAREKET�-------------------------	
	}
//=========================D��MAN HAREKET�=========================
}
