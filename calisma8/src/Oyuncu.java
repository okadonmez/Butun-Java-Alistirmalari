import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;

public class Oyuncu extends Saðlýk implements KeyListener,ActionListener{
	
	String isim = "";
	
    int can = 100;
	int oyuncuX = 300;
	int oyuncuY = 300;
	int oyuncuGeniþlik = 25;
	int oyuncuYükseklik = 25;

//=========================SETTER GETTER=========================
    public String getÝsim() {
		
		return this.isim;
	}
	public void setÝsim(String isimGirdi) {
		
		this.isim = isimGirdi;
	}
	
	public int getCan() {
		
		return this.can;
	}
	public void setCan(int canGirdi) {
		
		this.can = canGirdi;
	}
//=========================SETTER GETTER=========================

	
	
//=========================MEDKÝT ÝKSÝR ALMA=========================
	public boolean medkitAlma() {
		
		if(new Rectangle(this.oyuncuX, this.oyuncuY, this.oyuncuGeniþlik, this.oyuncuYükseklik).intersects(new Rectangle(this.medkitX, this.medkitY, this.medkitGeniþlik, this.medkitYükseklik)) && (this.medkit < 5)) {
		
			this.medkit += 1;
			AnaMenü.TOPLANANMEDKÝTSAYISI++;
			
			this.medkitX = this.medkitSpawn.nextInt(700);
			this.medkitY = this.medkitSpawn.nextInt(700);
		
			return true;
		}
	
		return false;
	}
	
	public boolean iksirAlma() {
		
		if(new Rectangle(this.oyuncuX, this.oyuncuY, this.oyuncuGeniþlik, this.oyuncuYükseklik).intersects(new Rectangle(this.iksirX, this.iksirY, this.iksirGeniþlik, this.iksirYükseklik)) && (this.iksir < 5)) {
		
			this.iksir += 1;
		    AnaMenü.TOPLANANÝKSÝRSAYISI++;
		    
			this.iksirX = this.iksirSpawn.nextInt(700);
			this.iksirY = this.iksirSpawn.nextInt(700);
		
			return true;
		}
	
		return false;
	}
//=========================MEDKÝT ÝKSÝR ALMA=========================

	
	
//=========================KLAVYE GÝRÝÞLERÝ=========================
	@Override
	public void keyPressed(KeyEvent a) {
		
		int tuþ = a.getKeyCode();
		
        if(tuþ == KeyEvent.VK_UP) {
			
			this.oyuncuY -= this.oyuncuGeniþlik;
		}
        if(tuþ == KeyEvent.VK_DOWN) {
			
			this.oyuncuY += this.oyuncuGeniþlik;
		}
		if(tuþ == KeyEvent.VK_LEFT) {
			
			this.oyuncuX -= this.oyuncuGeniþlik;
		}
        if(tuþ == KeyEvent.VK_RIGHT) {
			
			this.oyuncuX += this.oyuncuGeniþlik;
		}
        if(tuþ == KeyEvent.VK_M && this.medkit > 0) {
        	
        	this.can += 15;
        	
        	if(this.can > 100) {
        		
        		this.can = 100;
        	}
        	
        	this.medkit -= 1;
        	AnaMenü.MEDKÝTTOPLAMKULLANIM++;
        }
        if(tuþ == KeyEvent.VK_N && this.iksir > 0) {
        	
        	this.iksir -= 1;
        	this.iksirKullanýldýMý = true;
        	AnaMenü.ÝKSÝRTOPLAMKULLANIM++;
        	
        	AnaMenü.ÝKSÝRSAYACI = 1;
        	iksirZamanSýnýrý(5);
        }
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
//=========================KLAVYE GÝRÝÞLERÝ=========================
	
	
	
//=========================ÝKSÝR ZAMANI=========================
	public void iksirZamanSýnýrý(int süre) {
		
		if(AnaMenü.ÝKSÝRSAYACI == 1) {
			
			AnaMenü.ÝKSÝRSAYACI++;
			
			Timer iksirTimer = new Timer();
			
			iksirTimer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					
					iksirKullanýldýMý = false;
					System.out.println(AnaMenü.ÝKSÝRSAYACI);
					iksirTimer.cancel();
				}
			}, süre*1000);
		}
		
		AnaMenü.ÝKSÝRSAYACI++;
	}
//=========================ÝKSÝR ZAMANI=========================
}
