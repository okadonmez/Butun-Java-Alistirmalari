import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class AnaMen� extends JPanel{
	
	public static int �KS�RSAYACI;
	public static int MEDK�TTOPLAMKULLANIM = 0;
	public static int �KS�RTOPLAMKULLANIM = 0;
	public static int TOPLANANMEDK�TSAYISI = 0;
	public static int TOPLANAN�KS�RSAYISI = 0;
	
	public AnaMen�() {					
//=========================OLU�TURMA ��LEMLER�=========================
		Giri�Ekran� Giri�Ekran�Objesi = new Giri�Ekran�(1);
		Giri�Ekran� Giri�Ekran�Objesi2 = new Giri�Ekran�(2);
		
		JFrame frame = new JFrame("G�lgelerden Ka�!");
		
	    //JPanel anaMen�Paneli = new JPanel();
	    //anaMen�Paneli.setBackground(Color.green);
	    
	    JPanel haz�rlayanlarPaneli = new JPanel();
	    haz�rlayanlarPaneli.setBackground(Color.black);
//=========================OLU�TURMA ��LEMLER�=========================
	    
		    
		    
//=========================BUTON ��LEMLER�=========================
	    JButton ba�laButonu = new JButton("Ba�la");
	    ba�laButonu.setBounds(300, 270, 150, 30);
	    
	    JButton haz�rlayanlarButonu = new JButton("Haz�rlayanlar");
	    haz�rlayanlarButonu.setBounds(300, 420, 150, 30);
	   
	    JButton geriD�nButonu = new JButton("Geri D�n");
	    geriD�nButonu.setBounds(10, 620, 150, 30);
	   
	    JButton geriD�nButonu2 = new JButton("Geri D�n");
	    geriD�nButonu2.setBounds(10, 620, 150, 30);
	    
	    JButton geriD�nButonu3 = new JButton("Geri D�n");
	    geriD�nButonu3.setBounds(10, 620, 150, 30);
	    
	    
	    
	//-------------------------BUTON AKS�YON ��LEMLER�-------------------------
	    ba�laButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				OyunEkran� OyunEkran�Objesi = new OyunEkran�();
				
				OyunEkran�Objesi.�al���yor = true;
				frame.add(OyunEkran�Objesi);
				Giri�Ekran�Objesi.setVisible(false);
			}	
		});
	    
	    haz�rlayanlarButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Giri�Ekran�Objesi.setVisible(false);
				Giri�Ekran�Objesi2.setVisible(true);
				haz�rlayanlarPaneli.setVisible(true);
				
			    frame.add(Giri�Ekran�Objesi2);
			}
		});
	    
	    geriD�nButonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Giri�Ekran�Objesi.setVisible(true);
				haz�rlayanlarPaneli.setVisible(false);
			}
		});
	    
	    geriD�nButonu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Giri�Ekran�Objesi.setVisible(true);
				Giri�Ekran�Objesi2.setVisible(false);
				haz�rlayanlarPaneli.setVisible(false);
			}
		});
	    
	    geriD�nButonu3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Giri�Ekran�Objesi.setVisible(true);
				haz�rlayanlarPaneli.setVisible(false);
			}
		});
	//-------------------------BUTON AKS�YON ��LEMLER�-------------------------
//=========================BUTON ��LEMLER�=========================
	  
	    
	
//=========================EKLEME ��LEMLER�=========================
	    //****************************************************
	    //=> D�Z RENK ARKA PLAN EKLEME KODLARI               *
	    //anaMen�Paneli.add(ba�laButonu);                    *
	    //anaMen�Paneli.add(ayarlarButonu);                  *
	    //anaMen�Paneli.add(haz�rlayanlarButonu);            *
	    //ayarlarPaneli.add(geriD�nButonu);                  *
	    //haz�rlayanlarPaneli.add(geriD�nButonu2);           *
	    //                                                   *
	    //frame.add(anaMen�Paneli);                          *
	    //                                                   *
	    //anaMen�Paneli.setLayout(null);                     *
	    //****************************************************
	   
	    Giri�Ekran�Objesi.add(ba�laButonu);
	    Giri�Ekran�Objesi.add(haz�rlayanlarButonu);
	    Giri�Ekran�Objesi2.add(geriD�nButonu2);
	    
	    frame.add(Giri�Ekran�Objesi);
	    frame.setSize(800, 800);
	    frame.setLocation(340, 10);
	    frame.setResizable(false);//=> PENCERE BOYUTUNU DE���T�RMEY� ENGELL�YOR
	    
	    //Giri�Ekran�Objesi.setLayout(null);
	    haz�rlayanlarPaneli.setLayout(null); 
	    Giri�Ekran�Objesi2.setLayout(null); 
	    //frame.setLayout(null);
	    
	    frame.setVisible(true);//=> PENCEREN�N G�R�NMES�N� SA�LIYOR
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    //=> PROGRAMI KAPATTI�INDA ARKADA �ALI�MAYA DEVAM ED�YORDU BU KOD SAYES�NDE 
	    //CONSOLDAN'DA KAPATIYOR VE PC'N�N KASMASINI ENGELL�YOR
//=========================EKLEME ��LEMLER�=========================
	}
}
