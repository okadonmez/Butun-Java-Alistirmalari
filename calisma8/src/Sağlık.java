import java.util.Random;

public class Sa�l�k {
	
	Random medkitSpawn = new Random();
	Random iksirSpawn = new Random();
	
	int medkit = 0;
	int medkitX = medkitSpawn.nextInt(700);
	int medkitY = medkitSpawn.nextInt(700);
	int medkitGeni�lik = 50;
	int medkitY�kseklik = 50;
	
	int iksir = 5;
	int iksirX = iksirSpawn.nextInt(700);
	int iksirY = iksirSpawn.nextInt(700);
	int iksirGeni�lik = 50;
	int iksirY�kseklik = 50;
	
	boolean iksirKullan�ld�M� = false;
}
