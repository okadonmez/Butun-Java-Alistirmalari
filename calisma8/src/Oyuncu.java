import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;

public class Oyuncu extends Sa�l�k implements KeyListener,ActionListener{
	
	String isim = "";
	
    int can = 100;
	int oyuncuX = 300;
	int oyuncuY = 300;
	int oyuncuGeni�lik = 25;
	int oyuncuY�kseklik = 25;

//=========================SETTER GETTER=========================
    public String get�sim() {
		
		return this.isim;
	}
	public void set�sim(String isimGirdi) {
		
		this.isim = isimGirdi;
	}
	
	public int getCan() {
		
		return this.can;
	}
	public void setCan(int canGirdi) {
		
		this.can = canGirdi;
	}
//=========================SETTER GETTER=========================

	
	
//=========================MEDK�T �KS�R ALMA=========================
	public boolean medkitAlma() {
		
		if(new Rectangle(this.oyuncuX, this.oyuncuY, this.oyuncuGeni�lik, this.oyuncuY�kseklik).intersects(new Rectangle(this.medkitX, this.medkitY, this.medkitGeni�lik, this.medkitY�kseklik)) && (this.medkit < 5)) {
		
			this.medkit += 1;
			AnaMen�.TOPLANANMEDK�TSAYISI++;
			
			this.medkitX = this.medkitSpawn.nextInt(700);
			this.medkitY = this.medkitSpawn.nextInt(700);
		
			return true;
		}
	
		return false;
	}
	
	public boolean iksirAlma() {
		
		if(new Rectangle(this.oyuncuX, this.oyuncuY, this.oyuncuGeni�lik, this.oyuncuY�kseklik).intersects(new Rectangle(this.iksirX, this.iksirY, this.iksirGeni�lik, this.iksirY�kseklik)) && (this.iksir < 5)) {
		
			this.iksir += 1;
		    AnaMen�.TOPLANAN�KS�RSAYISI++;
		    
			this.iksirX = this.iksirSpawn.nextInt(700);
			this.iksirY = this.iksirSpawn.nextInt(700);
		
			return true;
		}
	
		return false;
	}
//=========================MEDK�T �KS�R ALMA=========================

	
	
//=========================KLAVYE G�R��LER�=========================
	@Override
	public void keyPressed(KeyEvent a) {
		
		int tu� = a.getKeyCode();
		
        if(tu� == KeyEvent.VK_UP) {
			
			this.oyuncuY -= this.oyuncuGeni�lik;
		}
        if(tu� == KeyEvent.VK_DOWN) {
			
			this.oyuncuY += this.oyuncuGeni�lik;
		}
		if(tu� == KeyEvent.VK_LEFT) {
			
			this.oyuncuX -= this.oyuncuGeni�lik;
		}
        if(tu� == KeyEvent.VK_RIGHT) {
			
			this.oyuncuX += this.oyuncuGeni�lik;
		}
        if(tu� == KeyEvent.VK_M && this.medkit > 0) {
        	
        	this.can += 15;
        	
        	if(this.can > 100) {
        		
        		this.can = 100;
        	}
        	
        	this.medkit -= 1;
        	AnaMen�.MEDK�TTOPLAMKULLANIM++;
        }
        if(tu� == KeyEvent.VK_N && this.iksir > 0) {
        	
        	this.iksir -= 1;
        	this.iksirKullan�ld�M� = true;
        	AnaMen�.�KS�RTOPLAMKULLANIM++;
        	
        	AnaMen�.�KS�RSAYACI = 1;
        	iksirZamanS�n�r�(5);
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
//=========================KLAVYE G�R��LER�=========================
	
	
	
//=========================�KS�R ZAMANI=========================
	public void iksirZamanS�n�r�(int s�re) {
		
		if(AnaMen�.�KS�RSAYACI == 1) {
			
			AnaMen�.�KS�RSAYACI++;
			
			Timer iksirTimer = new Timer();
			
			iksirTimer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					
					iksirKullan�ld�M� = false;
					System.out.println(AnaMen�.�KS�RSAYACI);
					iksirTimer.cancel();
				}
			}, s�re*1000);
		}
		
		AnaMen�.�KS�RSAYACI++;
	}
//=========================�KS�R ZAMANI=========================
}
