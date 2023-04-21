import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class AnaMenü extends JPanel{
	
	public static int ÝKSÝRSAYACI;
	public static int MEDKÝTTOPLAMKULLANIM = 0;
	public static int ÝKSÝRTOPLAMKULLANIM = 0;
	public static int TOPLANANMEDKÝTSAYISI = 0;
	public static int TOPLANANÝKSÝRSAYISI = 0;
	
	public AnaMenü() {					
//=========================OLUÞTURMA ÝÞLEMLERÝ=========================
		GiriþEkraný GiriþEkranýObjesi = new GiriþEkraný(1);
		GiriþEkraný GiriþEkranýObjesi2 = new GiriþEkraný(2);
		
		JFrame frame = new JFrame("Gölgelerden Kaç!");
		
	    //JPanel anaMenüPaneli = new JPanel();
	    //anaMenüPaneli.setBackground(Color.green);
	    
	    JPanel hazýrlayanlarPaneli = new JPanel();
	    hazýrlayanlarPaneli.setBackground(Color.black);
//=========================OLUÞTURMA ÝÞLEMLERÝ=========================
	    
		    
		    
//=========================BUTON ÝÞLEMLERÝ=========================
	    JButton baþlaButonu = new JButton("Baþla");
	    baþlaButonu.setBounds(300, 270, 150, 30);
	    
	    JButton hazýrlayanlarButonu = new JButton("Hazýrlayanlar");
	    hazýrlayanlarButonu.setBounds(300, 420, 150, 30);
	   
	    JButton geriDönButonu = new JButton("Geri Dön");
	    geriDönButonu.setBounds(10, 620, 150, 30);
	   
	    JButton geriDönButonu2 = new JButton("Geri Dön");
	    geriDönButonu2.setBounds(10, 620, 150, 30);
	    
	    JButton geriDönButonu3 = new JButton("Geri Dön");
	    geriDönButonu3.setBounds(10, 620, 150, 30);
	    
	    
	    
	//-------------------------BUTON AKSÝYON ÝÞLEMLERÝ-------------------------
	    baþlaButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				OyunEkraný OyunEkranýObjesi = new OyunEkraný();
				
				OyunEkranýObjesi.çalýþýyor = true;
				frame.add(OyunEkranýObjesi);
				GiriþEkranýObjesi.setVisible(false);
			}	
		});
	    
	    hazýrlayanlarButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GiriþEkranýObjesi.setVisible(false);
				GiriþEkranýObjesi2.setVisible(true);
				hazýrlayanlarPaneli.setVisible(true);
				
			    frame.add(GiriþEkranýObjesi2);
			}
		});
	    
	    geriDönButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GiriþEkranýObjesi.setVisible(true);
				hazýrlayanlarPaneli.setVisible(false);
			}
		});
	    
	    geriDönButonu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GiriþEkranýObjesi.setVisible(true);
				GiriþEkranýObjesi2.setVisible(false);
				hazýrlayanlarPaneli.setVisible(false);
			}
		});
	    
	    geriDönButonu3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GiriþEkranýObjesi.setVisible(true);
				hazýrlayanlarPaneli.setVisible(false);
			}
		});
	//-------------------------BUTON AKSÝYON ÝÞLEMLERÝ-------------------------
//=========================BUTON ÝÞLEMLERÝ=========================
	  
	    
	
//=========================EKLEME ÝÞLEMLERÝ=========================
	    //****************************************************
	    //=> DÜZ RENK ARKA PLAN EKLEME KODLARI               *
	    //anaMenüPaneli.add(baþlaButonu);                    *
	    //anaMenüPaneli.add(ayarlarButonu);                  *
	    //anaMenüPaneli.add(hazýrlayanlarButonu);            *
	    //ayarlarPaneli.add(geriDönButonu);                  *
	    //hazýrlayanlarPaneli.add(geriDönButonu2);           *
	    //                                                   *
	    //frame.add(anaMenüPaneli);                          *
	    //                                                   *
	    //anaMenüPaneli.setLayout(null);                     *
	    //****************************************************
	   
	    GiriþEkranýObjesi.add(baþlaButonu);
	    GiriþEkranýObjesi.add(hazýrlayanlarButonu);
	    GiriþEkranýObjesi2.add(geriDönButonu2);
	    
	    frame.add(GiriþEkranýObjesi);
	    frame.setSize(800, 800);
	    frame.setLocation(340, 10);
	    frame.setResizable(false);//=> PENCERE BOYUTUNU DEÐÝÞTÝRMEYÝ ENGELLÝYOR
	    
	    //GiriþEkranýObjesi.setLayout(null);
	    hazýrlayanlarPaneli.setLayout(null); 
	    GiriþEkranýObjesi2.setLayout(null); 
	    //frame.setLayout(null);
	    
	    frame.setVisible(true);//=> PENCERENÝN GÖRÜNMESÝNÝ SAÐLIYOR
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    //=> PROGRAMI KAPATTIÐINDA ARKADA ÇALIÞMAYA DEVAM EDÝYORDU BU KOD SAYESÝNDE 
	    //CONSOLDAN'DA KAPATIYOR VE PC'NÝN KASMASINI ENGELLÝYOR
//=========================EKLEME ÝÞLEMLERÝ=========================
	}
}
