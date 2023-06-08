import java.awt.*;

public class Harita {

	int alanX = 50;
	int alanY = 50;
	int alanGenişlik = 700;
	int alanYükseklik = 700;
	int alanKüçülme = 1;
	int alanBüyüme = 0;
	int yediyüzX = 750;
	int yediyüzY = 750;
	int sıfırX = 0;
	int sıfırY = 0;
	int alanYolSayacı = 0;
	int alanTur = 0;
	int alanYonlendirici = 0;
	boolean alanİleri = true;
	
	int x;
	int y;
	int g;
	int yü;
	boolean i;
	
//=========================CONSTRUCTOR=========================
	Harita(int oyuncuXGirdi, int oyuncuYGirdi, int oyuncuGenişlikGirdi, int oyuncuYükseklikGirdi, boolean oyuncuİksirGirdi){
		
		this.x = oyuncuXGirdi;
		this.y = oyuncuYGirdi;
		this.g = oyuncuGenişlikGirdi;
		this.yü = oyuncuYükseklikGirdi;
		this.i = oyuncuİksirGirdi;
		
		oyuncuAlaninNeresinde(x,  y,  g,  yü, i);
	}
	Harita(){
		
	}
//=========================CONSTRUCTOR=========================
	
	
	
//=========================ALAN BOYUTU=========================
	public void alanBoyutu() {
		/*========================================> RASTGELE BOYUTLANMASINI SAĞLIYOR
		int max = 10;
		int min = -10;
		
		this.alanGenişlik += 5;
		this.alanYükseklik += 5;
		
		this.alanX += r.nextInt((max - min) + 1) + min;
		this.alanY += r.nextInt((max - min) + 1) + min;*/
		
		/*
		if(this.alanKüçülme == 1) {
			
			this.alanGenişlik -= 5;
			this.alanYükseklik -= 5;
			
			if(this.alanYükseklik == 100) {
				
				this.alanKüçülme = 0;
				this.alanBüyüme = 1;
			}
		}
		
        if(this.alanBüyüme == 1) {
			
        	this.alanGenişlik += 5;
        	this.alanYükseklik += 5;
			
            if(this.alanYükseklik == 700) {
				
            	this.alanKüçülme = 1;
            	this.alanBüyüme = 0;
			}
		}*/
		
		if(alanTur < 3) {
			
			if(alanİleri == true) {
				
				if(alanYolSayacı < 101) {
					
					if(this.alanKüçülme == 1) {
					
						this.alanGenişlik -= 5;
						this.alanYükseklik -= 5;
					
						if(this.alanYükseklik == 100) {
						
							this.alanKüçülme = 0;
							this.alanBüyüme = 1;
						}
					}
				
		        	if(this.alanBüyüme == 1) {
					
		        		this.alanGenişlik += 5;
		        		this.alanYükseklik += 5;
					
		            	if(this.alanYükseklik == 700) {
						
		            		this.alanKüçülme = 1;
		            		this.alanBüyüme = 0;
						}
					}
		        	
		        	alanYolSayacı++;
				}
				if(100 < alanYolSayacı && alanYolSayacı < 201) {
					
					alanYolSayacı++;
					alanX += 5;
				}
				if(200 < alanYolSayacı && alanYolSayacı < 301) {
					
					if(alanTur == 0) {
						
						alanYolSayacı++;
						alanY += 5;
						alanX -= 5;
					}
					if(alanTur == 1) {
						
						if(alanX == 650) {
							
							alanYolSayacı++;
							alanY += 5;
						}
						else {
							
							alanYolSayacı++;
							alanY += 5;
							alanX -= 5;
						}
					}
					if(alanTur == 2) {
						
						if(alanX == 650) {
							
							alanYolSayacı++;
							alanY += 5;
						}
						else {
							
							alanYolSayacı++;
							alanY += 5;
							alanX -= 5;
						}
					}
					
				}
				if(300 < alanYolSayacı && alanYolSayacı < 401) {
					
					alanYolSayacı++;
					alanX += 5;
				}
				if(400 < alanYolSayacı && alanYolSayacı < 451) {
					
					alanYolSayacı++;
					alanY -= 5;
				}
				if(450 < alanYolSayacı && alanYolSayacı < 501) {
					
					alanYolSayacı++;
					alanX -= 5;
				}
				if(500 < alanYolSayacı && alanYolSayacı < 526) {
					
					alanYolSayacı++;
						
					this.alanGenişlik -= 5;
		        	this.alanYükseklik -= 5;	
				}
				if(525 < alanYolSayacı && alanYolSayacı < 576) {
					
					alanYolSayacı++;
						
					this.alanX -= 5;
		        	this.alanY -= 5;	
				}
				if(575 < alanYolSayacı && alanYolSayacı < 701) {
					
					alanYolSayacı++;
						
					this.alanGenişlik += 5;
		        	this.alanYükseklik += 5;
				}
				if(700 < alanYolSayacı && alanYolSayacı < 751) {
					
					alanYolSayacı++;
						
					this.alanGenişlik -= 5;	
				}
				if(750 < alanYolSayacı && alanYolSayacı < 801) {
					
					alanYolSayacı++;
						
					this.alanYükseklik -= 5;	
					
					if(alanYolSayacı == 800) {
						
						alanYolSayacı = 0;
						//alanGenişlik = 700;
						//alanYükseklik = 700;
						//alanX = 50;
						//alanY = 50;
						
						alanTur++;
						
						if(alanTur == 3) {
						
							alanİleri = false;
						}
					}
				}
			}
		}  
		
		if(2 < alanTur && alanTur < 20) {
			
			if(alanİleri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGenişlik = 700;
				alanYükseklik = 700;
				alanKüçülme = 1;
				alanBüyüme = 0;
				
				alanİleri = true;
			}
			
			
			if(alanKüçülme == 1) {
				
				if(alanYonlendirici == 0) {
					
					this.alanGenişlik -= 25;
					this.alanYükseklik -= 25;
				}
				if(alanYonlendirici == 2) {
					
					if(alanYükseklik >= 325) {
						
						this.alanX -=20;
					}
					else {
						
						this.alanX +=30;
					}
				
					this.alanGenişlik -= 5;
					this.alanYükseklik -= 5;
					this.alanY += 15;
				}
				if(alanYonlendirici == 4) {
					
					this.alanGenişlik -= 5;
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
					this.alanGenişlik += 5;
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
					this.alanGenişlik += 5;
					this.alanYükseklik +=5;	
				}
				
	            if(alanYükseklik == 400) {
					
					alanKüçülme = 1;
					alanBüyüme = 0;
					alanYonlendirici++;
					alanTur++;
				}
	            if(alanTur == 20) {
					
					alanİleri = false;
				}
			}
		}
		if(19 < alanTur) {
			
			if(alanİleri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGenişlik = 700;
				alanYükseklik = 700;
				alanKüçülme = 1;
				alanBüyüme = 0;
				alanYonlendirici = 0;
				
				alanİleri = true;
			}
			
			if(alanYonlendirici == 0 && alanGenişlik >= 300) {
				
				alanYükseklik -= 20;
				alanGenişlik -= 20;
				
				if(alanGenişlik == 300) {
					
					alanYonlendirici++;
				}
					
			}
			if(alanYonlendirici == 1){
				
				if((alanX + alanGenişlik) <= 780){
					
					alanX += 10;
				}
				if(alanGenişlik <= 400) {
					
					alanGenişlik += 10;
					alanYükseklik += 10;
				}
				if((alanGenişlik+ alanX) == 780 ) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 2) {
				
				if((alanY + alanGenişlik) <=760 ) {
					
					alanY += 10;
				}
				if(alanGenişlik >=300) {
					
					alanGenişlik -= 20;
					alanYükseklik -= 20;
				}
				if((alanY + alanGenişlik) >= 400) {
					
					if((alanX+alanGenişlik) <= 770) {
						
						alanX+=4;
						alanY -=10;
					}
				}
				if((alanY + alanGenişlik) == 760){
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 3) {
				
				if((alanX + alanGenişlik) >= 400) {
					
					alanX -=10;
				}	
				if(alanX + alanGenişlik == 552) {
					
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
				if(alanGenişlik >= 200) {
					
					alanGenişlik -= 10;
					alanYükseklik -= 10;
				}
			}
			if(alanYonlendirici == 5) {
				
				if(alanY <= 760) {
					
					alanY += 8;
				}
				if(alanGenişlik <= 290) {
					
					alanGenişlik += 10;
					alanYükseklik += 10;
				}
				if((alanY + alanGenişlik == 754)) {
					
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
				if(alanGenişlik >= 150) {
					
					alanGenişlik -= 5;
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
				if(alanGenişlik <300) {
					
					alanGenişlik +=5;
					alanYükseklik +=5;
					
					if(alanGenişlik >= 295) {
						
						alanGenişlik =300;
						alanYükseklik =300;
						alanX = 10;
						alanY = 10;
					}
				}
				if(alanGenişlik == 300) {
					alanYonlendirici = 1;
				}
			}
		}
	}
//=========================ALAN BOYUTU=========================

	
	
//=========================OYUNCU ALANIN NERESİNDE=========================
	public boolean oyuncuAlaninNeresinde(int x, int y, int g, int yü, boolean i) {
		
		if(new Rectangle(x, y, g, yü).intersects(new Rectangle(alanX, alanY, alanGenişlik, alanYükseklik)) || (i==true)) {
		
			return true;
		}
		
		return false;
	}
//=========================OYUNCU ALANIN NERESİNDE=========================
}
