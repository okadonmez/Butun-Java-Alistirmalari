import java.awt.event.*;
import java.io.IOException;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class OyunEkran� extends JPanel implements KeyListener,ActionListener{
//=> Frame �M�ZE JPanel OLU�TURDUK
//=> JPanel p = new JPanel();
//=> OBJELER�M�Z PANELLER �ZER�NDE DURUR
	
	Oyuncu OyuncuObjesi = new Oyuncu();
	Harita HaritaObjesi = new Harita(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik, OyuncuObjesi.iksirKullan�ld�M�);
    D��man D��manObjesi = new D��man();
   
    static final int DELAY = 100;
    boolean �al���yor = false;
    
    long oyunBa�lang��Zaman� = System.currentTimeMillis(); 
    long oyunBiti�Zaman�;
    
    String karakter�sim;
    Timer oyunH�z�;

    
     
//=========================CONSTRUCTOR=========================
	public OyunEkran�() {
		
		//this.setBackground(Color.ORANGE);
		
		while(true) {
		
			karakter�sim = JOptionPane.showInputDialog(this,"Karakter �smi");
		    
			OyuncuObjesi.isim = karakter�sim;
		    
		    if(karakter�sim==null || karakter�sim.length()==0) {
		    	
		    	JOptionPane.showMessageDialog(this, "Karakter ismi bo� b�rak�lamaz.", "Error", 0);
		        continue;
		    }
		    else {
		    	
		    	break;
		    }
		}
	    
        this.addKeyListener(OyuncuObjesi);
	    startGame();
	}
//=========================CONSTRUCTOR=========================
	

	
//=========================START GAME=========================
	public void startGame() {
		
		�al���yor = false;
		oyunH�z� = new Timer(DELAY, this);
		oyunH�z�.start();
	}
//=========================START GAME=========================

	
	
//=========================OYUNCU HAYATTAMI=========================
    public boolean oyuncuHayattaMi() throws IOException {
		
		if(OyuncuObjesi.can > 0) {
			
			System.out.println("hayatta");
			
			return true;
		}
		else {
			
			System.err.println("�ld�");
			
			OyuncuObjesi.can = 0;
			�al���yor = false;
			
			oyunH�z�.stop();
			oyunBiti�Zaman� = System.currentTimeMillis();
		
			return false;
		}
	}
//=========================OYUNCU HAYATTAMI=========================


	
//=========================NESNE ��Z�MLER�=========================
    //-------------------------G�RSEL UZANTILARI-------------------------
    String zeminResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Zemin2.png";
    String medkitResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\medkit.png";
	String iksirResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\�ksir.png";
	String kalpResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Kalp.png";
	String maviD��manResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\MaviD��man.png";
	String k�rm�z�D��manResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\K�rm�z�D��man.png";
	String renkliD��manResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\RenkliD��man.png";
	String ye�ilSiyahD��manResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Ye�ilSiyahD��man.png";
	String lilaD��manResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\LilaD��man.png";
	String g�lgeResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\G�lge.png";
	String giri�Ekran�Resmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Giri�Ekran�.png";
	//-------------------------G�RSEL UZANTILARI-------------------------
	
	
	
	@SuppressWarnings("unused")
	public void �izim(Graphics g) {
		
		if(�al���yor == true) {
		//-------------------------ZEM�N-------------------------
			ImageIcon zeminJpg = new ImageIcon(this.zeminResmi);
			zeminJpg.paintIcon(this, g, -100, -100);
		//-------------------------ZEM�N-------------------------
	
									
							
		//-------------------------ALAN-------------------------
			if(HaritaObjesi.alanTur < 3) {
				
				if(HaritaObjesi.alanTur == 0) {
					
					Color renk = new Color(245, 243, 243);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeni�lik, HaritaObjesi.alanY�kseklik);
				}
				if(HaritaObjesi.alanTur == 1) {
					
					Color renk = new Color(190, 190, 190);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeni�lik, HaritaObjesi.alanY�kseklik);
				}
				if(HaritaObjesi.alanTur == 2) {
					
					Color renk = new Color(150, 150, 150);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeni�lik, HaritaObjesi.alanY�kseklik);
				}
			}
			if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {

				g.setColor(Color.BLACK);
				g.fillRect(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeni�lik, HaritaObjesi.alanY�kseklik);
			}
			if(19 < HaritaObjesi.alanTur) {

				g.setColor(Color.WHITE);
				g.fillRect(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeni�lik, HaritaObjesi.alanY�kseklik);
			}
		//-------------------------ALAN-------------------------

			
			
		//-------------------------D��MAN-------------------------
			ImageIcon maviD��manPng = new ImageIcon(this.maviD��manResmi);
			maviD��manPng.paintIcon(this, g, D��manObjesi.maviD��manX, D��manObjesi.maviD��manY);
				
			ImageIcon k�rm�z�D��manPng = new ImageIcon(this.k�rm�z�D��manResmi);
			k�rm�z�D��manPng.paintIcon(this, g, D��manObjesi.k�rm�z�D��manX, D��manObjesi.k�rm�z�D��manY);
					
			ImageIcon renkliD��manPng = new ImageIcon(this.renkliD��manResmi);
			renkliD��manPng.paintIcon(this, g, D��manObjesi.renkliD��manX, D��manObjesi.renkliD��manY);
				
			ImageIcon ye�ilSiyahD��manPng = new ImageIcon(this.ye�ilSiyahD��manResmi);
			ye�ilSiyahD��manPng.paintIcon(this, g, D��manObjesi.ye�ilSiyahD��manX, D��manObjesi.ye�ilSiyahD��manY);
					
			ImageIcon lilaD��manPng = new ImageIcon(this.lilaD��manResmi);
			lilaD��manPng.paintIcon(this, g, D��manObjesi.lilaD��manX, D��manObjesi.lilaD��manY);	
		//-------------------------D��MAN-------------------------
			
			
					
		//-------------------------�KS�R ALANI-------------------------
			if(OyuncuObjesi.iksirKullan�ld�M� == true) {
			
				//g.setColor(Color.LIGHT_GRAY);
				//g.fillOval(OyuncuObjesi.oyuncuX-40, OyuncuObjesi.oyuncuY-40, OyuncuObjesi.iksirAlan�X, OyuncuObjesi.iksirAlan�Y);
				
				if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {

					g.setColor(Color.WHITE);
				}
				else {

					g.setColor(Color.BLACK);
				}
			//-------------------------�KS�R ALANI-------------------------
				
				
				
			//-------------------------�EVREDEK� B�Y�K KARELER-------------------------
				g.fillRect(OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuY+100, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-950, OyuncuObjesi.oyuncuY+100, 1000, 1000);
					 
				g.fillRect(OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuY-500, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-1050, OyuncuObjesi.oyuncuY-500, 1000, 1000);
				  
				g.fillRect(OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuY-1050, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-950, OyuncuObjesi.oyuncuY-1050, 1000, 1000);
			//-------------------------�EVREDEK� B�Y�K KARELER-------------------------
				
				
				
			//-------------------------�EVREDEK� ��GENLER-------------------------
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX}, new int[] {OyuncuObjesi.oyuncuY-50, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuY-50}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuX+100}, new int[] {OyuncuObjesi.oyuncuY-50, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuY-50}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX}, new int[] {OyuncuObjesi.oyuncuY+100, OyuncuObjesi.oyuncuY+50, OyuncuObjesi.oyuncuY+100}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuX+100}, new int[] {OyuncuObjesi.oyuncuY+100, OyuncuObjesi.oyuncuY+50, OyuncuObjesi.oyuncuY+100}, 3);
			//-------------------------�EVREDEK� ��GENLER-------------------------
				
				
				
			//-------------------------�EVREDEK� K���K KARELER-------------------------
			    g.fillRect(OyuncuObjesi.oyuncuX-75, OyuncuObjesi.oyuncuY-50, 50, 150);
			    g.fillRect(OyuncuObjesi.oyuncuX+75, OyuncuObjesi.oyuncuY-50, 50, 150);
			    //g.fillRect(OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuY-75, 150, 50);
			    //g.fillRect(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY+50, 150, 50);
			//-------------------------�EVREDEK� K���K KARELE-------------------------
			}
		//-------------------------�KS�R ALANI-------------------------

					
					
		//-------------------------MEDK�T-------------------------
			ImageIcon medkitPng = new ImageIcon(this.medkitResmi);//Spawnlanan Medkit
			medkitPng.paintIcon(this, g, OyuncuObjesi.medkitX, OyuncuObjesi.medkitY);


			if(OyuncuObjesi.medkit == 1) {

				medkitPng.paintIcon(this, g, 730, 715);
			}

			if(OyuncuObjesi.medkit == 2) {

				medkitPng.paintIcon(this, g, 730, 715);
				medkitPng.paintIcon(this, g, 680, 715);
			}
					
			if(OyuncuObjesi.medkit == 3) {

				medkitPng.paintIcon(this, g, 730, 715);  
				medkitPng.paintIcon(this, g, 680, 715);
				medkitPng.paintIcon(this, g, 630, 715);
			}

			if(OyuncuObjesi.medkit == 4) {

				medkitPng.paintIcon(this, g, 730, 715);
				medkitPng.paintIcon(this, g, 680, 715);  
				medkitPng.paintIcon(this, g, 630, 715);
				medkitPng.paintIcon(this, g, 580, 715);
			}

			if(OyuncuObjesi.medkit == 5) {

				medkitPng.paintIcon(this, g, 730, 715);
				medkitPng.paintIcon(this, g, 680, 715);
				medkitPng.paintIcon(this, g, 630, 715);
				medkitPng.paintIcon(this, g, 580, 715);
				medkitPng.paintIcon(this, g, 530, 715);
			}
		//-------------------------MEDK�T-------------------------

					
					
		//-------------------------�KS�R-------------------------
			ImageIcon iksirPng = new ImageIcon(this.iksirResmi);//Spawnlanan �ksir
			iksirPng.paintIcon(this, g, OyuncuObjesi.iksirX, OyuncuObjesi.iksirY);


			if(OyuncuObjesi.iksir == 1) {

				iksirPng.paintIcon(this, g, 730, 665);
			}

			if(OyuncuObjesi.iksir == 2) {

				iksirPng.paintIcon(this, g, 730, 665);
				iksirPng.paintIcon(this, g, 680, 665);
			}

			if(OyuncuObjesi.iksir == 3) {

				iksirPng.paintIcon(this, g, 730, 665);
				iksirPng.paintIcon(this, g, 680, 665);
				iksirPng.paintIcon(this, g, 630, 665);
			}
		
	    	if(OyuncuObjesi.iksir == 4) {

				iksirPng.paintIcon(this, g, 730, 665);
				iksirPng.paintIcon(this, g, 680, 665);
				iksirPng.paintIcon(this, g, 630, 665);
				iksirPng.paintIcon(this, g, 580, 665);
			}

			if(OyuncuObjesi.iksir == 5) {

				iksirPng.paintIcon(this, g, 730, 665);
				iksirPng.paintIcon(this, g, 680, 665);
				iksirPng.paintIcon(this, g, 630, 665);
				iksirPng.paintIcon(this, g, 580, 665);
				iksirPng.paintIcon(this, g, 530, 665);
			}
		//-------------------------�KS�R-------------------------

			
			
		//-------------------------KALP-------------------------
			if(D��manObjesi.lilaD��manTemas == true) {
			
				if(OyuncuObjesi.iksirKullan�ld�M� == false) {
					
					ImageIcon kalpPng = new ImageIcon(this.kalpResmi);
					kalpPng.paintIcon(this, g, OyuncuObjesi.oyuncuX-40, OyuncuObjesi.oyuncuY-40);
				}
			}
		//-------------------------KALP-------------------------
			
			
			
		//-------------------------OYUNCU-------------------------
			if(OyuncuObjesi.iksirKullan�ld�M� == false) {
				
				Color a��kMavi = new Color(51, 153, 255);
				g.setColor(a��kMavi);
				g.fillRect(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik);
			}
		
			if(OyuncuObjesi.iksirKullan�ld�M� == true) {
				
				Color a��kTuruncu = new Color(255, 153, 0);
				g.setColor(a��kTuruncu);
				g.fillRect(OyuncuObjesi.oyuncuX+15, OyuncuObjesi.oyuncuY+15, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik);
			}
		//-------------------------OYUNCU-------------------------
					
					
					
		//-------------------------KARAKTER DURUM B�LG�LER�-------------------------
			g.setFont(new Font("Times Italic", Font.BOLD, 15));
			FontMetrics metrics2 = getFontMetrics(g.getFont());
			
			g.drawString("Karakter Adi: " + OyuncuObjesi.isim, 600, 45);
			g.drawString("Karakter Cani: " + OyuncuObjesi.can, 600, 60);
			
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free", Font.BOLD, 50));
			
			if(HaritaObjesi.alanTur < 20) {
				
				g.drawString(HaritaObjesi.alanTur+1 + ".Tur", 350, 50);	
			}
			else {
				
				g.drawString("Sonsuz Tur", 295, 50);	
			}
		//-------------------------KARAKTER DURUM B�LG�LER�-------------------------
		}
		else {
			
			ImageIcon giri�Ekran�Jpg = new ImageIcon(this.giri�Ekran�Resmi);
			giri�Ekran�Jpg.paintIcon(this, g, 0, 0);
		//-------------------------SCORE-------------------------
			long zamanHesab� = oyunBiti�Zaman� - oyunBa�lang��Zaman�; // Ge�en s�re milisaniye cinsinden elde edilir
			double hayattaKalmaS�resi = (double)zamanHesab�/1000; // saniyeye �evirmek i�in 1000'e b�l�yoruz.
			
			g.setColor(Color.ORANGE);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			
			FontMetrics metrics1 = getFontMetrics(g.getFont());
			g.drawString("Hayatta kalinan zaman: " + hayattaKalmaS�resi, 100, 300);
			g.setFont(new Font("Ink Free", Font.BOLD, 35));
			
			FontMetrics metrics2 = getFontMetrics(g.getFont());
			g.drawString("Kullanilan medkit sayisi: " + AnaMen�.MEDK�TTOPLAMKULLANIM, 200, 400);
			g.drawString("Kullanilan iksir sayisi: " + AnaMen�.�KS�RTOPLAMKULLANIM, 200, 500);
			g.drawString("Toplanan medkit sayisi: " + AnaMen�.TOPLANANMEDK�TSAYISI, 200, 600);
			g.drawString("Toplanan iksir sayisi: " + AnaMen�.TOPLANAN�KS�RSAYISI, 200, 700);
		//-------------------------SCORE-------------------------
			
			
			
		//-------------------------GAME OVER-------------------------
			g.setColor(Color.red);
			g.setFont( new Font("Ink Free", Font.BOLD, 55));
			FontMetrics metrics3 = getFontMetrics(g.getFont());
			g.drawString("Game Over", 200, 150);
		//-------------------------GAME OVER-------------------------
		}
		
		repaint();
	}
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);		
		this.�izim(g);
	}
//=========================NESNE ��Z�MLER�=========================	
	
	
	
//=========================D��MAN HASARI=========================
	public void D��manHasar�(){
	//-------------------------KIRMIZI D��MAN HASARI-------------------------
	   	if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik).intersects(new Rectangle(D��manObjesi.k�rm�z�D��manX, D��manObjesi.k�rm�z�D��manY, D��manObjesi.k�rm�z�D��manGeni�lik, D��manObjesi.k�rm�z�D��manY�kseklik))) {

	   		OyuncuObjesi.can -= 2;
		}
	//-------------------------KIRMIZI D��MAN HASARI-------------------------
	   		
	   		
	   		
	//-------------------------MAV� D��MAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik).intersects(new Rectangle(D��manObjesi.maviD��manX, D��manObjesi.maviD��manY, D��manObjesi.maviD��manGeni�lik, D��manObjesi.maviD��manY�kseklik))) {

			OyuncuObjesi.can -= 4;
		}
	//-------------------------MAV� D��MAN HASARI-------------------------
		
		
		
	//-------------------------RENKL� D��MAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik).intersects(new Rectangle(D��manObjesi.renkliD��manX, D��manObjesi.renkliD��manY, D��manObjesi.renkliD��manGeni�lik, D��manObjesi.renkliD��manY�kseklik))) {

			OyuncuObjesi.can -= 3;
		}
	//-------------------------RENKL� D��MAN HASARI-------------------------
		
		
		
	//-------------------------YE��L-S�YAH D��MAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik).intersects(new Rectangle(D��manObjesi.ye�ilSiyahD��manX, D��manObjesi.ye�ilSiyahD��manY, D��manObjesi.ye�ilSiyahD��manGeni�lik, D��manObjesi.ye�ilSiyahD��manY�kseklik))) {

			OyuncuObjesi.can -= 1;
		}
	//-------------------------YE��L-S�YAH D��MAN HASARI-------------------------
		
		
	//-------------------------L�LA D��MAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik).intersects(new Rectangle(D��manObjesi.lilaD��manX, D��manObjesi.lilaD��manY, D��manObjesi.lilaD��manGeni�lik, D��manObjesi.lilaD��manY�kseklik))) {
			
			OyuncuObjesi.can += 5;
			
			if(OyuncuObjesi.can > 100) {
				
				OyuncuObjesi.can = 100;
			}
			
			D��manObjesi.lilaD��manTemas = true;	
		}
	//-------------------------L�LA D��MAN HASARI-------------------------
	}
//=========================D��MAN HASARI=========================
	
		
		
//=========================PANELE FOCUSLANMA METODU=========================
	public boolean isFocusTraversable() {

		return true;
	}
//=========================PANELE FOCUSLANMA METODU=========================

	
	
//=========================AKS�YON ��LEMLER�=========================
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(�al���yor == true) {
			
			OyuncuObjesi.medkitAlma();
			OyuncuObjesi.iksirAlma();
			
			try {
				this.oyuncuHayattaMi();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			D��manObjesi.D��manHareketi();
			this.D��manHasar�();
			
			
			if((HaritaObjesi.alanX > 0) || (HaritaObjesi.alanY > 0)) {
				
				HaritaObjesi.alanBoyutu();
			}
			if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {
				
				if(!HaritaObjesi.oyuncuAlaninNeresinde(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik, OyuncuObjesi.iksirKullan�ld�M�) == true) {
					
					System.out.println("oyuncu alanda de�il");
				}
				else {
					
					OyuncuObjesi.can -= OyuncuObjesi.medkitSpawn.nextInt(15);
				}
			}
			else {
				
				if(HaritaObjesi.oyuncuAlaninNeresinde(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeni�lik, OyuncuObjesi.oyuncuY�kseklik, OyuncuObjesi.iksirKullan�ld�M�) == true) {
					
					System.out.println("oyuncu alanda");
				}
				else {
					
					OyuncuObjesi.can -= OyuncuObjesi.medkitSpawn.nextInt(15);
				}
			}
		}
		
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
//=========================AKS�YON ��LEMLER�=========================
}
