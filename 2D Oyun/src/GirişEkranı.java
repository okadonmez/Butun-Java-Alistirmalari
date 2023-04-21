import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Giri�Ekran� extends JPanel {
	
	String giri�Ekran�Resmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Giri�Ekran�.png";
	String haz�rlayanlarResmi = "C:\\Users\\O�UZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\g�rseller\\Haz�rlayanlar.png";
		
	int i;
	
	Giri�Ekran�(int i){
		
		this.i = i;
	}
	
	public void �izim(Graphics g) {
		
		if(i == 1) {
			
			ImageIcon giri�Ekran�Jpg = new ImageIcon(this.giri�Ekran�Resmi);
			giri�Ekran�Jpg.paintIcon(this, g, 0, 0);
		}
		if(i == 2) {
			
			ImageIcon haz�rlayanlarEkran�Jpg = new ImageIcon(this.haz�rlayanlarResmi);
			haz�rlayanlarEkran�Jpg.paintIcon(this, g, -50, -70);
		}
	}
		
	public void paintComponent(Graphics g) {

		super.paintComponent(g);		
		this.�izim(g);
	}
}
