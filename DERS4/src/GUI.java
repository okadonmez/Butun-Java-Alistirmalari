import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
	
	static String dosya�smi;

	@SuppressWarnings("unused")
	public GUI() throws IOException {
//=========================OLU�TURMA ��LEMLER�=========================		
		JFrame frame = new JFrame("Metin Dosyas� �ifreleme Program�");
		frame.setSize(500, 300);
		
		Color renk = new Color(51, 153, 255);
		
		JPanel giri�Paneli = new JPanel();
		giri�Paneli.setBackground(renk);
		
		JPanel �ifrelemePaneli = new JPanel();
		�ifrelemePaneli.setBackground(renk);
		
		JLabel aray�zYaz�s� = new JLabel();
		aray�zYaz�s�.setText("------------------------------Metin Dosyas� �ifreleme Program�------------------------------");
		aray�zYaz�s�.setBounds(15, 10, 1000, 60);
		aray�zYaz�s�.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�2 = new JLabel();
		aray�zYaz�s�2.setText("Bu program bilgisayar�n�zdaki 'Metin Dosyalar�n�' �ifrelemektedir.");
		aray�zYaz�s�2.setBounds(15, 30, 1000, 60);
		aray�zYaz�s�2.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�3 = new JLabel();
		aray�zYaz�s�3.setText("Kullan�m� olduk�a basittir. Tek yapman�z gereken �ifrelemek istedi�iniz");
		aray�zYaz�s�3.setBounds(15, 50, 1000, 60);
		aray�zYaz�s�3.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�4 = new JLabel();
		aray�zYaz�s�4.setText("'Metin Dosyas�n�n' ismini do�ru bir �ekilde yaz�p 'DEVAM' tu�una basmak.");
		aray�zYaz�s�4.setBounds(15, 70, 1000, 60);
		aray�zYaz�s�4.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�5 = new JLabel();
		aray�zYaz�s�5.setText("(Metin Dosyas�n� �ifrelemeden �nce metin belgesini 'Uygulama' klas�r�ne at�n�z.)");
		aray�zYaz�s�5.setBounds(15, 90, 1000, 60);
		aray�zYaz�s�5.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�6 = new JLabel();
		aray�zYaz�s�6.setText("Not: Metin Dosyas�nda T�rk�e karakter kullanmay�n�z!");
		aray�zYaz�s�6.setBounds(15, 110, 1000, 60);
		aray�zYaz�s�6.setForeground(Color.WHITE);
		
		JLabel aray�zYaz�s�7 = new JLabel();
		
		JLabel dosyaDurumYaz�s� = new JLabel();
		
		JLabel yap�mc��smi = new JLabel();
		yap�mc��smi.setText("Program Yap�mc�s�: O�uz Ka�an D�NMEZ");
		yap�mc��smi.setBounds(225, 200, 1000, 60);
		yap�mc��smi.setForeground(Color.WHITE);
		
		JTextField dosyaAd�GirdiKutucu�u = new JTextField();
		dosyaAd�GirdiKutucu�u.setBounds(15, 160, 200, 30);
		
		JButton devamButonu = new JButton("Devam");
		devamButonu.setBounds(15, 210, 100, 30);
		
		JButton geriButonu = new JButton("Geri");
		geriButonu.setBounds(15, 210, 100, 30);
		
		JButton �ifrelemeButonu = new JButton("�ifrele");
		�ifrelemeButonu.setBounds(100, 80, 100, 30);
		
		JButton �ifreyi��zmeButonu = new JButton("�ifreyi ��z");
		�ifreyi��zmeButonu.setBounds(270, 80, 100, 30);
//=========================OLU�TURMA ��LEMLER�=========================	
		
		
		
		
//=========================BUTON ��LEMLER�=========================	
		devamButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dosya�smi = dosyaAd�GirdiKutucu�u.getText();
				
				dosyaAd�GirdiKutucu�u.setText(dosya�smi);
				
				aray�zYaz�s�7.setText("�ifrelenmesini istedi�iniz dosyan�n ad�:    " + dosya�smi + ".txt");
				aray�zYaz�s�7.setForeground(Color.WHITE);
				aray�zYaz�s�7.setBounds(15, 10, 1000, 60);
				
				giri�Paneli.setVisible(false);
				frame.add(�ifrelemePaneli);
				�ifrelemePaneli.setVisible(true);
			}
		});
		
		geriButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dosya�smi = dosyaAd�GirdiKutucu�u.getText();
				
				dosyaAd�GirdiKutucu�u.setText(dosya�smi);
				
				�ifrelemePaneli.setVisible(false);
				frame.add(giri�Paneli);
				giri�Paneli.setVisible(true);
			}
		});
		
		�ifrelemeButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Dosya��lemleri Dosya��lemleriObjesi = null;
				File dosya = new File(dosya�smi + ".txt");
				
				try {
					Dosya��lemleriObjesi = new Dosya��lemleri(dosya�smi);
					
					if(dosya.exists()) {
						
						Dosya��lemleriObjesi.�ifreliYazd�rma();
					
						dosyaDurumYaz�s�.setText("Dosyan�n yeni ad�:    " + dosya�smi + "�ifrelendi.txt");
						dosyaDurumYaz�s�.setForeground(Color.WHITE);
						dosyaDurumYaz�s�.setBounds(15, 120, 1000, 60);	
					}
				} catch (IOException e1) {
					
					dosyaDurumYaz�s�.setText("�ifreleme ba�ar�s�z! Bu isimde bir dosya bulunamad�.");
					dosyaDurumYaz�s�.setForeground(Color.WHITE);
					dosyaDurumYaz�s�.setBounds(15, 120, 1000, 60);
					
					e1.printStackTrace();
				}	
			}
		});
		
		�ifreyi��zmeButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Dosya��lemleri Dosya��lemleriObjesi = null;
				File dosya = new File(dosya�smi + "�ifrelenmi�.txt");
				
				try {
					Dosya��lemleriObjesi = new Dosya��lemleri(dosya�smi);
					
					if(dosya.exists()) {
						
						Dosya��lemleriObjesi.�ifresizYazd�rma();
						
						dosyaDurumYaz�s�.setText("Dosyan�n yeni ad�:    " + dosya�smi + ".txt");
						dosyaDurumYaz�s�.setForeground(Color.WHITE);
						dosyaDurumYaz�s�.setBounds(15, 120, 1000, 60);
					}
				} catch (IOException e1) {
					
					dosyaDurumYaz�s�.setText("�ifre ��zme ba�ar�s�z! Bu isimde bir dosya bulunamad�.");
					dosyaDurumYaz�s�.setForeground(Color.WHITE);
					dosyaDurumYaz�s�.setBounds(15, 120, 1000, 60);	
					
					e1.printStackTrace();
				}
			}
		});
//=========================BUTON ��LEMLER�=========================		

		
		
//=========================EKLEME ��LEMLER�=========================	
		frame.add(giri�Paneli);
		
		giri�Paneli.add(dosyaAd�GirdiKutucu�u);
		giri�Paneli.add(aray�zYaz�s�);
		giri�Paneli.add(aray�zYaz�s�2);
		giri�Paneli.add(aray�zYaz�s�3);
		giri�Paneli.add(aray�zYaz�s�4);
		giri�Paneli.add(aray�zYaz�s�5);
		giri�Paneli.add(aray�zYaz�s�6);
		giri�Paneli.add(yap�mc��smi);
		giri�Paneli.add(devamButonu);
		
		�ifrelemePaneli.add(aray�zYaz�s�7);
		�ifrelemePaneli.add(dosyaDurumYaz�s�);
		�ifrelemePaneli.add(�ifrelemeButonu);
		�ifrelemePaneli.add(�ifreyi��zmeButonu);
		�ifrelemePaneli.add(geriButonu);
		
		frame.setLocation(500, 150);
	    frame.setResizable(false);//=> PENCERE BOYUTUNU DE���T�RMEY� ENGELL�YOR
	    
	    giri�Paneli.setLayout(null);
	    �ifrelemePaneli.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//=========================EKLEME ��LEMLER�=========================	
	}
}
