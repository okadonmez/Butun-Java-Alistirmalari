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
	
	static String dosyaÝsmi;

	@SuppressWarnings("unused")
	public GUI() throws IOException {
//=========================OLUÞTURMA ÝÞLEMLERÝ=========================		
		JFrame frame = new JFrame("Metin Dosyasý Þifreleme Programý");
		frame.setSize(500, 300);
		
		Color renk = new Color(51, 153, 255);
		
		JPanel giriþPaneli = new JPanel();
		giriþPaneli.setBackground(renk);
		
		JPanel þifrelemePaneli = new JPanel();
		þifrelemePaneli.setBackground(renk);
		
		JLabel arayüzYazýsý = new JLabel();
		arayüzYazýsý.setText("------------------------------Metin Dosyasý Þifreleme Programý------------------------------");
		arayüzYazýsý.setBounds(15, 10, 1000, 60);
		arayüzYazýsý.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý2 = new JLabel();
		arayüzYazýsý2.setText("Bu program bilgisayarýnýzdaki 'Metin Dosyalarýný' þifrelemektedir.");
		arayüzYazýsý2.setBounds(15, 30, 1000, 60);
		arayüzYazýsý2.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý3 = new JLabel();
		arayüzYazýsý3.setText("Kullanýmý oldukça basittir. Tek yapmanýz gereken þifrelemek istediðiniz");
		arayüzYazýsý3.setBounds(15, 50, 1000, 60);
		arayüzYazýsý3.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý4 = new JLabel();
		arayüzYazýsý4.setText("'Metin Dosyasýnýn' ismini doðru bir þekilde yazýp 'DEVAM' tuþuna basmak.");
		arayüzYazýsý4.setBounds(15, 70, 1000, 60);
		arayüzYazýsý4.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý5 = new JLabel();
		arayüzYazýsý5.setText("(Metin Dosyasýný þifrelemeden önce metin belgesini 'Uygulama' klasörüne atýnýz.)");
		arayüzYazýsý5.setBounds(15, 90, 1000, 60);
		arayüzYazýsý5.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý6 = new JLabel();
		arayüzYazýsý6.setText("Not: Metin Dosyasýnda Türkçe karakter kullanmayýnýz!");
		arayüzYazýsý6.setBounds(15, 110, 1000, 60);
		arayüzYazýsý6.setForeground(Color.WHITE);
		
		JLabel arayüzYazýsý7 = new JLabel();
		
		JLabel dosyaDurumYazýsý = new JLabel();
		
		JLabel yapýmcýÝsmi = new JLabel();
		yapýmcýÝsmi.setText("Program Yapýmcýsý: Oðuz Kaðan DÖNMEZ");
		yapýmcýÝsmi.setBounds(225, 200, 1000, 60);
		yapýmcýÝsmi.setForeground(Color.WHITE);
		
		JTextField dosyaAdýGirdiKutucuðu = new JTextField();
		dosyaAdýGirdiKutucuðu.setBounds(15, 160, 200, 30);
		
		JButton devamButonu = new JButton("Devam");
		devamButonu.setBounds(15, 210, 100, 30);
		
		JButton geriButonu = new JButton("Geri");
		geriButonu.setBounds(15, 210, 100, 30);
		
		JButton þifrelemeButonu = new JButton("Þifrele");
		þifrelemeButonu.setBounds(100, 80, 100, 30);
		
		JButton þifreyiÇözmeButonu = new JButton("Þifreyi Çöz");
		þifreyiÇözmeButonu.setBounds(270, 80, 100, 30);
//=========================OLUÞTURMA ÝÞLEMLERÝ=========================	
		
		
		
		
//=========================BUTON ÝÞLEMLERÝ=========================	
		devamButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dosyaÝsmi = dosyaAdýGirdiKutucuðu.getText();
				
				dosyaAdýGirdiKutucuðu.setText(dosyaÝsmi);
				
				arayüzYazýsý7.setText("Þifrelenmesini istediðiniz dosyanýn adý:    " + dosyaÝsmi + ".txt");
				arayüzYazýsý7.setForeground(Color.WHITE);
				arayüzYazýsý7.setBounds(15, 10, 1000, 60);
				
				giriþPaneli.setVisible(false);
				frame.add(þifrelemePaneli);
				þifrelemePaneli.setVisible(true);
			}
		});
		
		geriButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dosyaÝsmi = dosyaAdýGirdiKutucuðu.getText();
				
				dosyaAdýGirdiKutucuðu.setText(dosyaÝsmi);
				
				þifrelemePaneli.setVisible(false);
				frame.add(giriþPaneli);
				giriþPaneli.setVisible(true);
			}
		});
		
		þifrelemeButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DosyaÝþlemleri DosyaÝþlemleriObjesi = null;
				File dosya = new File(dosyaÝsmi + ".txt");
				
				try {
					DosyaÝþlemleriObjesi = new DosyaÝþlemleri(dosyaÝsmi);
					
					if(dosya.exists()) {
						
						DosyaÝþlemleriObjesi.þifreliYazdýrma();
					
						dosyaDurumYazýsý.setText("Dosyanýn yeni adý:    " + dosyaÝsmi + "Þifrelendi.txt");
						dosyaDurumYazýsý.setForeground(Color.WHITE);
						dosyaDurumYazýsý.setBounds(15, 120, 1000, 60);	
					}
				} catch (IOException e1) {
					
					dosyaDurumYazýsý.setText("Þifreleme baþarýsýz! Bu isimde bir dosya bulunamadý.");
					dosyaDurumYazýsý.setForeground(Color.WHITE);
					dosyaDurumYazýsý.setBounds(15, 120, 1000, 60);
					
					e1.printStackTrace();
				}	
			}
		});
		
		þifreyiÇözmeButonu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DosyaÝþlemleri DosyaÝþlemleriObjesi = null;
				File dosya = new File(dosyaÝsmi + "Þifrelenmiþ.txt");
				
				try {
					DosyaÝþlemleriObjesi = new DosyaÝþlemleri(dosyaÝsmi);
					
					if(dosya.exists()) {
						
						DosyaÝþlemleriObjesi.þifresizYazdýrma();
						
						dosyaDurumYazýsý.setText("Dosyanýn yeni adý:    " + dosyaÝsmi + ".txt");
						dosyaDurumYazýsý.setForeground(Color.WHITE);
						dosyaDurumYazýsý.setBounds(15, 120, 1000, 60);
					}
				} catch (IOException e1) {
					
					dosyaDurumYazýsý.setText("Þifre Çözme baþarýsýz! Bu isimde bir dosya bulunamadý.");
					dosyaDurumYazýsý.setForeground(Color.WHITE);
					dosyaDurumYazýsý.setBounds(15, 120, 1000, 60);	
					
					e1.printStackTrace();
				}
			}
		});
//=========================BUTON ÝÞLEMLERÝ=========================		

		
		
//=========================EKLEME ÝÞLEMLERÝ=========================	
		frame.add(giriþPaneli);
		
		giriþPaneli.add(dosyaAdýGirdiKutucuðu);
		giriþPaneli.add(arayüzYazýsý);
		giriþPaneli.add(arayüzYazýsý2);
		giriþPaneli.add(arayüzYazýsý3);
		giriþPaneli.add(arayüzYazýsý4);
		giriþPaneli.add(arayüzYazýsý5);
		giriþPaneli.add(arayüzYazýsý6);
		giriþPaneli.add(yapýmcýÝsmi);
		giriþPaneli.add(devamButonu);
		
		þifrelemePaneli.add(arayüzYazýsý7);
		þifrelemePaneli.add(dosyaDurumYazýsý);
		þifrelemePaneli.add(þifrelemeButonu);
		þifrelemePaneli.add(þifreyiÇözmeButonu);
		þifrelemePaneli.add(geriButonu);
		
		frame.setLocation(500, 150);
	    frame.setResizable(false);//=> PENCERE BOYUTUNU DEÐÝÞTÝRMEYÝ ENGELLÝYOR
	    
	    giriþPaneli.setLayout(null);
	    þifrelemePaneli.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//=========================EKLEME ÝÞLEMLERÝ=========================	
	}
}
