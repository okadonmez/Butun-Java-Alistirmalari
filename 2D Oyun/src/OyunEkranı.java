import java.awt.event.*;
import java.io.IOException;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class OyunEkraný extends JPanel implements KeyListener,ActionListener{
//=> Frame ÝMÝZE JPanel OLUÞTURDUK
//=> JPanel p = new JPanel();
//=> OBJELERÝMÝZ PANELLER ÜZERÝNDE DURUR
	
	Oyuncu OyuncuObjesi = new Oyuncu();
	Harita HaritaObjesi = new Harita(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik, OyuncuObjesi.iksirKullanýldýMý);
    Düþman DüþmanObjesi = new Düþman();
   
    static final int DELAY = 100;
    boolean çalýþýyor = false;
    
    long oyunBaþlangýçZamaný = System.currentTimeMillis(); 
    long oyunBitiþZamaný;
    
    String karakterÝsim;
    Timer oyunHýzý;

    
     
//=========================CONSTRUCTOR=========================
	public OyunEkraný() {
		
		//this.setBackground(Color.ORANGE);
		
		while(true) {
		
			karakterÝsim = JOptionPane.showInputDialog(this,"Karakter Ýsmi");
		    
			OyuncuObjesi.isim = karakterÝsim;
		    
		    if(karakterÝsim==null || karakterÝsim.length()==0) {
		    	
		    	JOptionPane.showMessageDialog(this, "Karakter ismi boþ býrakýlamaz.", "Error", 0);
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
		
		çalýþýyor = false;
		oyunHýzý = new Timer(DELAY, this);
		oyunHýzý.start();
	}
//=========================START GAME=========================

	
	
//=========================OYUNCU HAYATTAMI=========================
    public boolean oyuncuHayattaMi() throws IOException {
		
		if(OyuncuObjesi.can > 0) {
			
			System.out.println("hayatta");
			
			return true;
		}
		else {
			
			System.err.println("öldü");
			
			OyuncuObjesi.can = 0;
			çalýþýyor = false;
			
			oyunHýzý.stop();
			oyunBitiþZamaný = System.currentTimeMillis();
		
			return false;
		}
	}
//=========================OYUNCU HAYATTAMI=========================


	
//=========================NESNE ÇÝZÝMLERÝ=========================
    //-------------------------GÖRSEL UZANTILARI-------------------------
    String zeminResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\Zemin2.png";
    String medkitResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\medkit.png";
	String iksirResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\Ýksir.png";
	String kalpResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\Kalp.png";
	String maviDüþmanResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\MaviDüþman.png";
	String kýrmýzýDüþmanResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\KýrmýzýDüþman.png";
	String renkliDüþmanResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\RenkliDüþman.png";
	String yeþilSiyahDüþmanResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\YeþilSiyahDüþman.png";
	String lilaDüþmanResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\LilaDüþman.png";
	String gölgeResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\Gölge.png";
	String giriþEkranýResmi = "C:\\Users\\OÐUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\GiriþEkraný.png";
	//-------------------------GÖRSEL UZANTILARI-------------------------
	
	
	
	@SuppressWarnings("unused")
	public void çizim(Graphics g) {
		
		if(çalýþýyor == true) {
		//-------------------------ZEMÝN-------------------------
			ImageIcon zeminJpg = new ImageIcon(this.zeminResmi);
			zeminJpg.paintIcon(this, g, -100, -100);
		//-------------------------ZEMÝN-------------------------
	
									
							
		//-------------------------ALAN-------------------------
			if(HaritaObjesi.alanTur < 3) {
				
				if(HaritaObjesi.alanTur == 0) {
					
					Color renk = new Color(245, 243, 243);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeniþlik, HaritaObjesi.alanYükseklik);
				}
				if(HaritaObjesi.alanTur == 1) {
					
					Color renk = new Color(190, 190, 190);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeniþlik, HaritaObjesi.alanYükseklik);
				}
				if(HaritaObjesi.alanTur == 2) {
					
					Color renk = new Color(150, 150, 150);
					g.setColor(renk);
					g.fillOval(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeniþlik, HaritaObjesi.alanYükseklik);
				}
			}
			if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {

				g.setColor(Color.BLACK);
				g.fillRect(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeniþlik, HaritaObjesi.alanYükseklik);
			}
			if(19 < HaritaObjesi.alanTur) {

				g.setColor(Color.WHITE);
				g.fillRect(HaritaObjesi.alanX, HaritaObjesi.alanY, HaritaObjesi.alanGeniþlik, HaritaObjesi.alanYükseklik);
			}
		//-------------------------ALAN-------------------------

			
			
		//-------------------------DÜÞMAN-------------------------
			ImageIcon maviDüþmanPng = new ImageIcon(this.maviDüþmanResmi);
			maviDüþmanPng.paintIcon(this, g, DüþmanObjesi.maviDüþmanX, DüþmanObjesi.maviDüþmanY);
				
			ImageIcon kýrmýzýDüþmanPng = new ImageIcon(this.kýrmýzýDüþmanResmi);
			kýrmýzýDüþmanPng.paintIcon(this, g, DüþmanObjesi.kýrmýzýDüþmanX, DüþmanObjesi.kýrmýzýDüþmanY);
					
			ImageIcon renkliDüþmanPng = new ImageIcon(this.renkliDüþmanResmi);
			renkliDüþmanPng.paintIcon(this, g, DüþmanObjesi.renkliDüþmanX, DüþmanObjesi.renkliDüþmanY);
				
			ImageIcon yeþilSiyahDüþmanPng = new ImageIcon(this.yeþilSiyahDüþmanResmi);
			yeþilSiyahDüþmanPng.paintIcon(this, g, DüþmanObjesi.yeþilSiyahDüþmanX, DüþmanObjesi.yeþilSiyahDüþmanY);
					
			ImageIcon lilaDüþmanPng = new ImageIcon(this.lilaDüþmanResmi);
			lilaDüþmanPng.paintIcon(this, g, DüþmanObjesi.lilaDüþmanX, DüþmanObjesi.lilaDüþmanY);	
		//-------------------------DÜÞMAN-------------------------
			
			
					
		//-------------------------ÝKSÝR ALANI-------------------------
			if(OyuncuObjesi.iksirKullanýldýMý == true) {
			
				//g.setColor(Color.LIGHT_GRAY);
				//g.fillOval(OyuncuObjesi.oyuncuX-40, OyuncuObjesi.oyuncuY-40, OyuncuObjesi.iksirAlanýX, OyuncuObjesi.iksirAlanýY);
				
				if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {

					g.setColor(Color.WHITE);
				}
				else {

					g.setColor(Color.BLACK);
				}
			//-------------------------ÝKSÝR ALANI-------------------------
				
				
				
			//-------------------------ÇEVREDEKÝ BÜYÜK KARELER-------------------------
				g.fillRect(OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuY+100, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-950, OyuncuObjesi.oyuncuY+100, 1000, 1000);
					 
				g.fillRect(OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuY-500, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-1050, OyuncuObjesi.oyuncuY-500, 1000, 1000);
				  
				g.fillRect(OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuY-1050, 1000, 1000);
				g.fillRect(OyuncuObjesi.oyuncuX-950, OyuncuObjesi.oyuncuY-1050, 1000, 1000);
			//-------------------------ÇEVREDEKÝ BÜYÜK KARELER-------------------------
				
				
				
			//-------------------------ÇEVREDEKÝ ÜÇGENLER-------------------------
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX}, new int[] {OyuncuObjesi.oyuncuY-50, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuY-50}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuX+100}, new int[] {OyuncuObjesi.oyuncuY-50, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuY-50}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuX}, new int[] {OyuncuObjesi.oyuncuY+100, OyuncuObjesi.oyuncuY+50, OyuncuObjesi.oyuncuY+100}, 3);
				g.fillPolygon(new int[] {OyuncuObjesi.oyuncuX+50, OyuncuObjesi.oyuncuX+100, OyuncuObjesi.oyuncuX+100}, new int[] {OyuncuObjesi.oyuncuY+100, OyuncuObjesi.oyuncuY+50, OyuncuObjesi.oyuncuY+100}, 3);
			//-------------------------ÇEVREDEKÝ ÜÇGENLER-------------------------
				
				
				
			//-------------------------ÇEVREDEKÝ KÜÇÜK KARELER-------------------------
			    g.fillRect(OyuncuObjesi.oyuncuX-75, OyuncuObjesi.oyuncuY-50, 50, 150);
			    g.fillRect(OyuncuObjesi.oyuncuX+75, OyuncuObjesi.oyuncuY-50, 50, 150);
			    //g.fillRect(OyuncuObjesi.oyuncuX-50, OyuncuObjesi.oyuncuY-75, 150, 50);
			    //g.fillRect(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY+50, 150, 50);
			//-------------------------ÇEVREDEKÝ KÜÇÜK KARELE-------------------------
			}
		//-------------------------ÝKSÝR ALANI-------------------------

					
					
		//-------------------------MEDKÝT-------------------------
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
		//-------------------------MEDKÝT-------------------------

					
					
		//-------------------------ÝKSÝR-------------------------
			ImageIcon iksirPng = new ImageIcon(this.iksirResmi);//Spawnlanan Ýksir
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
		//-------------------------ÝKSÝR-------------------------

			
			
		//-------------------------KALP-------------------------
			if(DüþmanObjesi.lilaDüþmanTemas == true) {
			
				if(OyuncuObjesi.iksirKullanýldýMý == false) {
					
					ImageIcon kalpPng = new ImageIcon(this.kalpResmi);
					kalpPng.paintIcon(this, g, OyuncuObjesi.oyuncuX-40, OyuncuObjesi.oyuncuY-40);
				}
			}
		//-------------------------KALP-------------------------
			
			
			
		//-------------------------OYUNCU-------------------------
			if(OyuncuObjesi.iksirKullanýldýMý == false) {
				
				Color açýkMavi = new Color(51, 153, 255);
				g.setColor(açýkMavi);
				g.fillRect(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik);
			}
		
			if(OyuncuObjesi.iksirKullanýldýMý == true) {
				
				Color açýkTuruncu = new Color(255, 153, 0);
				g.setColor(açýkTuruncu);
				g.fillRect(OyuncuObjesi.oyuncuX+15, OyuncuObjesi.oyuncuY+15, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik);
			}
		//-------------------------OYUNCU-------------------------
					
					
					
		//-------------------------KARAKTER DURUM BÝLGÝLERÝ-------------------------
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
		//-------------------------KARAKTER DURUM BÝLGÝLERÝ-------------------------
		}
		else {
			
			ImageIcon giriþEkranýJpg = new ImageIcon(this.giriþEkranýResmi);
			giriþEkranýJpg.paintIcon(this, g, 0, 0);
		//-------------------------SCORE-------------------------
			long zamanHesabý = oyunBitiþZamaný - oyunBaþlangýçZamaný; // Geçen süre milisaniye cinsinden elde edilir
			double hayattaKalmaSüresi = (double)zamanHesabý/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
			
			g.setColor(Color.ORANGE);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			
			FontMetrics metrics1 = getFontMetrics(g.getFont());
			g.drawString("Hayatta kalinan zaman: " + hayattaKalmaSüresi, 100, 300);
			g.setFont(new Font("Ink Free", Font.BOLD, 35));
			
			FontMetrics metrics2 = getFontMetrics(g.getFont());
			g.drawString("Kullanilan medkit sayisi: " + AnaMenü.MEDKÝTTOPLAMKULLANIM, 200, 400);
			g.drawString("Kullanilan iksir sayisi: " + AnaMenü.ÝKSÝRTOPLAMKULLANIM, 200, 500);
			g.drawString("Toplanan medkit sayisi: " + AnaMenü.TOPLANANMEDKÝTSAYISI, 200, 600);
			g.drawString("Toplanan iksir sayisi: " + AnaMenü.TOPLANANÝKSÝRSAYISI, 200, 700);
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
		this.çizim(g);
	}
//=========================NESNE ÇÝZÝMLERÝ=========================	
	
	
	
//=========================DÜÞMAN HASARI=========================
	public void DüþmanHasarý(){
	//-------------------------KIRMIZI DÜÞMAN HASARI-------------------------
	   	if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik).intersects(new Rectangle(DüþmanObjesi.kýrmýzýDüþmanX, DüþmanObjesi.kýrmýzýDüþmanY, DüþmanObjesi.kýrmýzýDüþmanGeniþlik, DüþmanObjesi.kýrmýzýDüþmanYükseklik))) {

	   		OyuncuObjesi.can -= 2;
		}
	//-------------------------KIRMIZI DÜÞMAN HASARI-------------------------
	   		
	   		
	   		
	//-------------------------MAVÝ DÜÞMAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik).intersects(new Rectangle(DüþmanObjesi.maviDüþmanX, DüþmanObjesi.maviDüþmanY, DüþmanObjesi.maviDüþmanGeniþlik, DüþmanObjesi.maviDüþmanYükseklik))) {

			OyuncuObjesi.can -= 4;
		}
	//-------------------------MAVÝ DÜÞMAN HASARI-------------------------
		
		
		
	//-------------------------RENKLÝ DÜÞMAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik).intersects(new Rectangle(DüþmanObjesi.renkliDüþmanX, DüþmanObjesi.renkliDüþmanY, DüþmanObjesi.renkliDüþmanGeniþlik, DüþmanObjesi.renkliDüþmanYükseklik))) {

			OyuncuObjesi.can -= 3;
		}
	//-------------------------RENKLÝ DÜÞMAN HASARI-------------------------
		
		
		
	//-------------------------YEÞÝL-SÝYAH DÜÞMAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik).intersects(new Rectangle(DüþmanObjesi.yeþilSiyahDüþmanX, DüþmanObjesi.yeþilSiyahDüþmanY, DüþmanObjesi.yeþilSiyahDüþmanGeniþlik, DüþmanObjesi.yeþilSiyahDüþmanYükseklik))) {

			OyuncuObjesi.can -= 1;
		}
	//-------------------------YEÞÝL-SÝYAH DÜÞMAN HASARI-------------------------
		
		
	//-------------------------LÝLA DÜÞMAN HASARI-------------------------
		if(new Rectangle(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik).intersects(new Rectangle(DüþmanObjesi.lilaDüþmanX, DüþmanObjesi.lilaDüþmanY, DüþmanObjesi.lilaDüþmanGeniþlik, DüþmanObjesi.lilaDüþmanYükseklik))) {
			
			OyuncuObjesi.can += 5;
			
			if(OyuncuObjesi.can > 100) {
				
				OyuncuObjesi.can = 100;
			}
			
			DüþmanObjesi.lilaDüþmanTemas = true;	
		}
	//-------------------------LÝLA DÜÞMAN HASARI-------------------------
	}
//=========================DÜÞMAN HASARI=========================
	
		
		
//=========================PANELE FOCUSLANMA METODU=========================
	public boolean isFocusTraversable() {

		return true;
	}
//=========================PANELE FOCUSLANMA METODU=========================

	
	
//=========================AKSÝYON ÝÞLEMLERÝ=========================
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(çalýþýyor == true) {
			
			OyuncuObjesi.medkitAlma();
			OyuncuObjesi.iksirAlma();
			
			try {
				this.oyuncuHayattaMi();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			DüþmanObjesi.DüþmanHareketi();
			this.DüþmanHasarý();
			
			
			if((HaritaObjesi.alanX > 0) || (HaritaObjesi.alanY > 0)) {
				
				HaritaObjesi.alanBoyutu();
			}
			if(2 < HaritaObjesi.alanTur && HaritaObjesi.alanTur < 20) {
				
				if(!HaritaObjesi.oyuncuAlaninNeresinde(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik, OyuncuObjesi.iksirKullanýldýMý) == true) {
					
					System.out.println("oyuncu alanda deðil");
				}
				else {
					
					OyuncuObjesi.can -= OyuncuObjesi.medkitSpawn.nextInt(15);
				}
			}
			else {
				
				if(HaritaObjesi.oyuncuAlaninNeresinde(OyuncuObjesi.oyuncuX, OyuncuObjesi.oyuncuY, OyuncuObjesi.oyuncuGeniþlik, OyuncuObjesi.oyuncuYükseklik, OyuncuObjesi.iksirKullanýldýMý) == true) {
					
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
//=========================AKSÝYON ÝÞLEMLERÝ=========================
}
