import java.awt.*;

public class Harita {

	int alanX = 50;
	int alanY = 50;
	int alanGeni�lik = 700;
	int alanY�kseklik = 700;
	int alanK���lme = 1;
	int alanB�y�me = 0;
	int yediy�zX = 750;
	int yediy�zY = 750;
	int s�f�rX = 0;
	int s�f�rY = 0;
	int alanYolSayac� = 0;
	int alanTur = 0;
	int alanYonlendirici = 0;
	boolean alan�leri = true;
	
	int x;
	int y;
	int g;
	int y�;
	boolean i;
	
//=========================CONSTRUCTOR=========================
	Harita(int oyuncuXGirdi, int oyuncuYGirdi, int oyuncuGeni�likGirdi, int oyuncuY�kseklikGirdi, boolean oyuncu�ksirGirdi){
		
		this.x = oyuncuXGirdi;
		this.y = oyuncuYGirdi;
		this.g = oyuncuGeni�likGirdi;
		this.y� = oyuncuY�kseklikGirdi;
		this.i = oyuncu�ksirGirdi;
		
		oyuncuAlaninNeresinde(x,  y,  g,  y�, i);
	}
	Harita(){
		
	}
//=========================CONSTRUCTOR=========================
	
	
	
//=========================ALAN BOYUTU=========================
	public void alanBoyutu() {
		/*========================================> RASTGELE BOYUTLANMASINI SA�LIYOR
		int max = 10;
		int min = -10;
		
		this.alanGeni�lik += 5;
		this.alanY�kseklik += 5;
		
		this.alanX += r.nextInt((max - min) + 1) + min;
		this.alanY += r.nextInt((max - min) + 1) + min;*/
		
		/*
		if(this.alanK���lme == 1) {
			
			this.alanGeni�lik -= 5;
			this.alanY�kseklik -= 5;
			
			if(this.alanY�kseklik == 100) {
				
				this.alanK���lme = 0;
				this.alanB�y�me = 1;
			}
		}
		
        if(this.alanB�y�me == 1) {
			
        	this.alanGeni�lik += 5;
        	this.alanY�kseklik += 5;
			
            if(this.alanY�kseklik == 700) {
				
            	this.alanK���lme = 1;
            	this.alanB�y�me = 0;
			}
		}*/
		
		if(alanTur < 3) {
			
			if(alan�leri == true) {
				
				if(alanYolSayac� < 101) {
					
					if(this.alanK���lme == 1) {
					
						this.alanGeni�lik -= 5;
						this.alanY�kseklik -= 5;
					
						if(this.alanY�kseklik == 100) {
						
							this.alanK���lme = 0;
							this.alanB�y�me = 1;
						}
					}
				
		        	if(this.alanB�y�me == 1) {
					
		        		this.alanGeni�lik += 5;
		        		this.alanY�kseklik += 5;
					
		            	if(this.alanY�kseklik == 700) {
						
		            		this.alanK���lme = 1;
		            		this.alanB�y�me = 0;
						}
					}
		        	
		        	alanYolSayac�++;
				}
				if(100 < alanYolSayac� && alanYolSayac� < 201) {
					
					alanYolSayac�++;
					alanX += 5;
				}
				if(200 < alanYolSayac� && alanYolSayac� < 301) {
					
					if(alanTur == 0) {
						
						alanYolSayac�++;
						alanY += 5;
						alanX -= 5;
					}
					if(alanTur == 1) {
						
						if(alanX == 650) {
							
							alanYolSayac�++;
							alanY += 5;
						}
						else {
							
							alanYolSayac�++;
							alanY += 5;
							alanX -= 5;
						}
					}
					if(alanTur == 2) {
						
						if(alanX == 650) {
							
							alanYolSayac�++;
							alanY += 5;
						}
						else {
							
							alanYolSayac�++;
							alanY += 5;
							alanX -= 5;
						}
					}
					
				}
				if(300 < alanYolSayac� && alanYolSayac� < 401) {
					
					alanYolSayac�++;
					alanX += 5;
				}
				if(400 < alanYolSayac� && alanYolSayac� < 451) {
					
					alanYolSayac�++;
					alanY -= 5;
				}
				if(450 < alanYolSayac� && alanYolSayac� < 501) {
					
					alanYolSayac�++;
					alanX -= 5;
				}
				if(500 < alanYolSayac� && alanYolSayac� < 526) {
					
					alanYolSayac�++;
						
					this.alanGeni�lik -= 5;
		        	this.alanY�kseklik -= 5;	
				}
				if(525 < alanYolSayac� && alanYolSayac� < 576) {
					
					alanYolSayac�++;
						
					this.alanX -= 5;
		        	this.alanY -= 5;	
				}
				if(575 < alanYolSayac� && alanYolSayac� < 701) {
					
					alanYolSayac�++;
						
					this.alanGeni�lik += 5;
		        	this.alanY�kseklik += 5;
				}
				if(700 < alanYolSayac� && alanYolSayac� < 751) {
					
					alanYolSayac�++;
						
					this.alanGeni�lik -= 5;	
				}
				if(750 < alanYolSayac� && alanYolSayac� < 801) {
					
					alanYolSayac�++;
						
					this.alanY�kseklik -= 5;	
					
					if(alanYolSayac� == 800) {
						
						alanYolSayac� = 0;
						//alanGeni�lik = 700;
						//alanY�kseklik = 700;
						//alanX = 50;
						//alanY = 50;
						
						alanTur++;
						
						if(alanTur == 3) {
						
							alan�leri = false;
						}
					}
				}
			}
		}  
		
		if(2 < alanTur && alanTur < 20) {
			
			if(alan�leri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGeni�lik = 700;
				alanY�kseklik = 700;
				alanK���lme = 1;
				alanB�y�me = 0;
				
				alan�leri = true;
			}
			
			
			if(alanK���lme == 1) {
				
				if(alanYonlendirici == 0) {
					
					this.alanGeni�lik -= 25;
					this.alanY�kseklik -= 25;
				}
				if(alanYonlendirici == 2) {
					
					if(alanY�kseklik >= 325) {
						
						this.alanX -=20;
					}
					else {
						
						this.alanX +=30;
					}
				
					this.alanGeni�lik -= 5;
					this.alanY�kseklik -= 5;
					this.alanY += 15;
				}
				if(alanYonlendirici == 4) {
					
					this.alanGeni�lik -= 5;
					this.alanY�kseklik -= 5;
					this.alanY -= 10;
					this.alanX++;
				}
				if(alanY�kseklik == 250) {
					
					alanK���lme = 0;
					alanB�y�me = 1;
					
					this.alanX++;
					alanYonlendirici++;
					
					if(alanYonlendirici == 5) {
						
						alanYonlendirici = 1;
						
						this.alanY = 50;
						this.alanX = 50;
					}
				}
			}
			
	        if(alanB�y�me == 1) {

				if(alanYonlendirici == 1) {
				
					this.alanX+=9;
					this.alanGeni�lik += 5;
					this.alanY�kseklik += 5;
				
				}			
				if(alanYonlendirici == 3) {
					
					if(alanY�kseklik <= 325) {
						
						this.alanY -=25;
					}
					else{
						
						this.alanY +=18;
					}
					
					this.alanX-=13;
					this.alanGeni�lik += 5;
					this.alanY�kseklik +=5;	
				}
				
	            if(alanY�kseklik == 400) {
					
					alanK���lme = 1;
					alanB�y�me = 0;
					alanYonlendirici++;
					alanTur++;
				}
	            if(alanTur == 20) {
					
					alan�leri = false;
				}
			}
		}
		if(19 < alanTur) {
			
			if(alan�leri == false) {
				
				alanX = 50;
				alanY = 50;
				alanGeni�lik = 700;
				alanY�kseklik = 700;
				alanK���lme = 1;
				alanB�y�me = 0;
				alanYonlendirici = 0;
				
				alan�leri = true;
			}
			
			if(alanYonlendirici == 0 && alanGeni�lik >= 300) {
				
				alanY�kseklik -= 20;
				alanGeni�lik -= 20;
				
				if(alanGeni�lik == 300) {
					
					alanYonlendirici++;
				}
					
			}
			if(alanYonlendirici == 1){
				
				if((alanX + alanGeni�lik) <= 780){
					
					alanX += 10;
				}
				if(alanGeni�lik <= 400) {
					
					alanGeni�lik += 10;
					alanY�kseklik += 10;
				}
				if((alanGeni�lik+ alanX) == 780 ) {
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 2) {
				
				if((alanY + alanGeni�lik) <=760 ) {
					
					alanY += 10;
				}
				if(alanGeni�lik >=300) {
					
					alanGeni�lik -= 20;
					alanY�kseklik -= 20;
				}
				if((alanY + alanGeni�lik) >= 400) {
					
					if((alanX+alanGeni�lik) <= 770) {
						
						alanX+=4;
						alanY -=10;
					}
				}
				if((alanY + alanGeni�lik) == 760){
					
					alanYonlendirici++;
				}
			}
			if(alanYonlendirici == 3) {
				
				if((alanX + alanGeni�lik) >= 400) {
					
					alanX -=10;
				}	
				if(alanX + alanGeni�lik == 552) {
					
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
				if(alanGeni�lik >= 200) {
					
					alanGeni�lik -= 10;
					alanY�kseklik -= 10;
				}
			}
			if(alanYonlendirici == 5) {
				
				if(alanY <= 760) {
					
					alanY += 8;
				}
				if(alanGeni�lik <= 290) {
					
					alanGeni�lik += 10;
					alanY�kseklik += 10;
				}
				if((alanY + alanGeni�lik == 754)) {
					
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
				if(alanGeni�lik >= 150) {
					
					alanGeni�lik -= 5;
					alanY�kseklik -= 5;
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
				if(alanGeni�lik <300) {
					
					alanGeni�lik +=5;
					alanY�kseklik +=5;
					
					if(alanGeni�lik >= 295) {
						
						alanGeni�lik =300;
						alanY�kseklik =300;
						alanX = 10;
						alanY = 10;
					}
				}
				if(alanGeni�lik == 300) {
					alanYonlendirici = 1;
				}
			}
		}
	}
//=========================ALAN BOYUTU=========================

	
	
//=========================OYUNCU ALANIN NERES�NDE=========================
	public boolean oyuncuAlaninNeresinde(int x, int y, int g, int y�, boolean i) {
		
		if(new Rectangle(x, y, g, y�).intersects(new Rectangle(alanX, alanY, alanGeni�lik, alanY�kseklik)) || (i==true)) {
		
			return true;
		}
		
		return false;
	}
//=========================OYUNCU ALANIN NERES�NDE=========================
}
