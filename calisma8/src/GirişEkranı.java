import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GirişEkranı extends JPanel {
	
	String girişEkranıResmi = "C:\\Users\\OĞUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\GirişEkranı.png";
	String hazırlayanlarResmi = "C:\\Users\\OĞUZ\\Desktop\\Projelerim\\JavaProjeleri\\2D Oyun\\görseller\\Hazırlayanlar.png";
		
	int i;
	
	GirişEkranı(int i){
		
		this.i = i;
	}
	
	public void çizim(Graphics g) {
		
		if(i == 1) {
			
			ImageIcon girişEkranıJpg = new ImageIcon(this.girişEkranıResmi);
			girişEkranıJpg.paintIcon(this, g, 0, 0);
		}
		if(i == 2) {
			
			ImageIcon hazırlayanlarEkranıJpg = new ImageIcon(this.hazırlayanlarResmi);
			hazırlayanlarEkranıJpg.paintIcon(this, g, -50, -70);
		}
	}
		
	public void paintComponent(Graphics g) {

		super.paintComponent(g);		
		this.çizim(g);
	}
}
