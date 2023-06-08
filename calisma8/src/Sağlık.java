import java.util.Random;

public class Saðlýk {
	
	Random medkitSpawn = new Random();
	Random iksirSpawn = new Random();
	
	int medkit = 0;
	int medkitX = medkitSpawn.nextInt(700);
	int medkitY = medkitSpawn.nextInt(700);
	int medkitGeniþlik = 50;
	int medkitYükseklik = 50;
	
	int iksir = 5;
	int iksirX = iksirSpawn.nextInt(700);
	int iksirY = iksirSpawn.nextInt(700);
	int iksirGeniþlik = 50;
	int iksirYükseklik = 50;
	
	boolean iksirKullanýldýMý = false;
}
