import java.awt.*;

public class Harita {

	int alanX = 50;
	int alanY = 50;
	int alanGeniþlik = 700;
	int alanYükseklik = 700;
	int alanKüçülme = 1;
	int alanBüyüme = 0;
	int yediyüzX = 750;
	int yediyüzY = 750;
	int sýfýrX = 0;
	int sýfýrY = 0;
	int alanYolSayacý = 0;
	int alanTur = 0;
	int alanYonlendirici = 0;
	boolean alanÝleri = true;
	
	int x;
	int y;
	int g;
	int yü;
	boolean i;
	
//=========================CONSTRUCTOR=========================
	Harita(int oyuncuXGirdi, int oyuncuYGirdi, int oyuncuGeniþlikGirdi, int oyuncuYükseklikGirdi, boolean oyuncuÝksirGirdi){
		
		this.x = oyuncuXGirdi;
		this.y = oyuncuYGirdi;
		this.g = oyuncuGeniþlikGirdi;
		this.yü = oyuncuYükseklikGirdi;
		this.i = oyuncuÝksirGirdi;
		
		oyuncuAlaninNeresinde(x,  y,  g,  yü, i);
	}
	Harita(){
		
	}
//=========================CONSTRUCTOR=========================
	
	
	
//=========================ALAN BOYUTU=========================
	public void alanBoyutu() {
		/*========================================> RASTGELE BOYUTLANMASINI SAÐLIYOR
		int max = 10;
		int min = -10;
		
		this.alanGeniþlik += 5;
		this.alanYükseklik += 5;
		
		this.alanX += r.nextInt((max - min) + 1) + min;
		this.alanY += r.nextInt((max - min) + 1) + min;*/
		
		/*
		if(this.alanKüçülme == 1) {
			
			this.alanGeniþlik -= 5;
			this.alanYükseklik -= 5;
			
			if(this.alanYükseklik == 100) {
				
				this.alanKüçülme = 0;
				this.alanBüyüme = 1;
			}
		}
		
        if(this.alanBüyüme == 1) {
			
        	this.alanGeniþlik += 5;
        	this.alanYükseklik += 5;
			
            if(this.alanYükseklik == 700) {
				
            	this.alanKüçülme = 1;
            	this.alanBüyüme = 0;
			}
		}*/
		
		if(alanTur < 3) {
			
			if(alanÝleri == true) {
				
				if(alanYolSayacý < 101) {
					
					if(this.alanKüçülme == 1) {
					
						this.alanGeniþlik -= 5;
						this.alanYükseklik -= 5;
					
						if(this.alanYükseklik == 100) {
						
							this.alanKüçülme = 0;
							this.alanBüyüme = 1;
						}
					}
				
		        	if(this.alanBüyüme == 1) {
					
		        		this.alanGeniþlik += 5;
		        		this.alanYükseklik += 5;
					
		            	if(this.alanYükseklik == 700) {
						
		            		this.alanKüçülme = 1;
		            		this.alanBüyüme = 0;
						}
					}
		        	
		        	alanYolSayacý++;
				}
				if(100 < alanYolSayacý && alanYolSayacý < 201) {
					
					alanYolSayacý++;
					alanX += 5;
				}
				if(200 < alanYolSayacý && alanYolSayacý < 301) {
					
					if(alanTur == 0) {
						
						alanYolSayacý++;
						alanY += 5;
						alanX -= 5;
					}
					if(alanTur == 1) {
						
						if(alanX == 650) {
							
							alanYolSayacý++;
							alanY += 5;
						}
						else {
							
							alanYolSayacý++;
							alanY += 5;
							alanX -= 5;
						}
					}
					if(alanTur == 2) {
						
						if(alanX == 650) {
							
							alanYolSayacý++;
							alanY += 5;
						}
						else {
							
							alanYolSayacý++;
							alanY += 5;
							alanX -= 5;
						}
					}
					
				}
				if(300 < alanYolSayacý && alanYolSayacý < 401) {
					
					alanYolSayacý++;
					alanX += 5;
				}
				if(400 < alanYolSayacý && alanYolSayacý < 451) {
					
					alanYolSayacý++;
					alanY -= 5;
				}
				if(450 < alanYolSayacý && alanYolSayacý < 501) {
					
					alanYolSayacý++;
					alanX -= 5;
				}
				if(500 < alanYolSayacý && alanYolSayacý < 526) {
					
					alanYolSayacý++;
						
					this.alanGeniþlik -= 5;
		        	this.alanYükseklik -= 5;	
				}
				if(525 < alanYolSayacý && alanYolSayacý < 576) {
					
					alanYolSayacý++;
						
					this.alanX -= 5;
		        	this.alanY -= 5;	
				}
				if(575 < alanYolSayacý && alanYolSayacý < 701) {
					
					alanYolSayacý++;
						
					this.alanGeniþlik += 5;
		        	this.alanYükseklik += 5;
				}
				if(700 < alanYolSayacý && alanYolSayacý < 751) {
					
					alanYolSayacý++;
						
					this.alanGeniþlik -= 5;	
				}
				if(750 < alanYolSayacý && alanYolSayacý < 801) {
					
					alanYolSayacý++;
						
					this.alanYükseklik -= 5;	
					
					if(alanYolSayacý == 800) {
						
						alanYolSayacý = 0;
						//alanGeniþlik = 700;
						//alanYükseklik = 700;
						//alanX = 50;
						//alanY = 50;
						
						alanTur++;
						
						if(alanTur == 3) {
						
							alanÝleri = false;
						}
					}
				}
			}
		}  
		
		if(2 < alanTur && alanTur < 20) {
			
			if(alanÝleri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGeniþlik = 700;
				alanYükseklik = 700;
				alanKüçülme = 1;
				alanBüyüme = 0;
				
				alanÝleri = true;
			}
			
			
			if(alanKüçülme == 1) {
				
				if(alanYonlendirici == 0) {
					
					this.alanGeniþlik -= 25;
					this.alanYükseklik -= 25;
				}
				if(alanYonlendirici == 2) {
					
					if(alanYükseklik >= 325) {
						
						this.alanX -=20;
					}
					else {
						
						this.alanX +=30;
					}
				
					this.alanGeniþlik -= 5;
					this.alanYükseklik -= 5;
					this.alanY += 15;
				}
				if(alanYonlendirici == 4) {
					
					this.alanGeniþlik -= 5;
					this.alanYükseklik -= 5;
					this.alanY -= 10;
					this.alanX++;
				}
				if(alanYükseklik == 250) {
					
					alanKüçülme = 0;
					alanBüyüme = 1;
					
					this.alanX++;
					alanYonlendirici++;
					
					if(alanYonlendirici == 5) {
						
						alanYonlendirici = 1;
						
						this.alanY = 50;
						this.alanX = 50;
					}
				}
			}
			
	        if(alanBüyüme == 1) {

				if(alanYonlendirici == 1) {
				
					this.alanX+=9;
					this.alanGeniþlik += 5;
					this.alanYükseklik += 5;
				
				}			
				if(alanYonlendirici == 3) {
					
					if(alanYükseklik <= 325) {
						
						this.alanY -=25;
					}
					else{
						
						this.alanY +=18;
					}
					
					this.alanX-=13;
					this.alanGeniþlik += 5;
					this.alanYükseklik +=5;	
				}
				
	            if(alanYükseklik == 400) {
					
					alanKüçülme = 1;
					alanBüyüme = 0;
					alanYonlendirici++;
					alanTur++;
				}
	            if(alanTur == 20) {
					
					alanÝleri = false;
				}
			}
		}
		if(19 < alanTur) {
			
			if(alanÝleri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGeniþlik = 700;
				alanYükseklik = 700;
				alanKüçülme = 1;
				alanBüyüme = 0;
				alanYonlendirici = 0;
				
				alanÝleri = true;
			}
			
			if(alanYonlendirici == 0 && alanGeniþlik >= 300) {
				
				alanYükseklik -= 20;
				alanGeniþlik -= 20;
				
				if(alanGeniþlik == 300) {
					
					alanYonlendirici++;
				}
					
			}
			if(alanYonlendirici == 1){
				
				if((alanX + alanGeniþlik) <= 780){
					
					alanX += 10;
				}
				if(alanGeniþlik <= 400) {
					
					alanGeniþlik += 10;
					alanYükseklik += 10;
				}
				if((alanGeniþlik+ alanX) == 780 ) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 2) {
				
				if((alanY + alanGeniþlik) <=760 ) {
					
					alanY += 10;
				}
				if(alanGeniþlik >=300) {
					
					alanGeniþlik -= 20;
					alanYükseklik -= 20;
				}
				if((alanY + alanGeniþlik) >= 400) {
					
					if((alanX+alanGeniþlik) <= 770) {
						
						alanX+=4;
						alanY -=10;
					}
				}
				if((alanY + alanGeniþlik) == 760){
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 3) {
				
				if((alanX + alanGeniþlik) >= 400) {
					
					alanX -=10;
				}	
				if(alanX + alanGeniþlik == 552) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 4) {
				
				if(alanY >= 250) {
					
					alanY -= 8;
				}
				if(alanY == 246) {
					
					alanYonlendirici++;
				}
				if(alanGeniþlik >= 200) {
					
					alanGeniþlik -= 10;
					alanYükseklik -= 10;
				}
			}
			if(alanYonlendirici == 5) {
				
				if(alanY <= 760) {
					
					alanY += 8;
				}
				if(alanGeniþlik <= 290) {
					
					alanGeniþlik += 10;
					alanYükseklik += 10;
				}
				if((alanY + alanGeniþlik == 754)) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 6) {
				
				if(alanX >= 10) {
					
					alanX -= 10;
				}
				
				if(alanX == 12) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 7) {
				
				if(alanY >= 250) {
					
					alanX += 5;
					alanY -= 5;
				}
				if(alanGeniþlik >= 150) {
					
					alanGeniþlik -= 5;
					alanYükseklik -= 5;
				}
				if(alanY == 249){
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 8){
				
				if(alanX >= 20) {
					
					alanX -=8;
				}
				if(alanY >= 20) {
					
					alanY -=8;
				}
				if(alanGeniþlik <300) {
					
					alanGeniþlik +=5;
					alanYükseklik +=5;
					
					if(alanGeniþlik >= 295) {
						
						alanGeniþlik =300;
						alanYükseklik =300;
						alanX = 10;
						alanY = 10;
					}
				}
				if(alanGeniþlik == 300) {
					alanYonlendirici = 1;
				}
			}
		}
	}
//=========================ALAN BOYUTU=========================

	
	
//=========================OYUNCU ALANIN NERESÝNDE=========================
	public boolean oyuncuAlaninNeresinde(int x, int y, int g, int yü, boolean i) {
		
		if(new Rectangle(x, y, g, yü).intersects(new Rectangle(alanX, alanY, alanGeniþlik, alanYükseklik)) || (i==true)) {
		
			return true;
		}
		
		return false;
	}
//=========================OYUNCU ALANIN NERESÝNDE=========================
}
