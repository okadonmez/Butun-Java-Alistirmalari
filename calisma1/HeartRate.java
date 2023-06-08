package OðuzKaðan_Dönmez_203405025;

public class HeartRate {
	
	private String ad;
	private String soyad;
	private int dogumTarihi;
	private int MHR;
	private double THR;
	

	public HeartRate(String adGir, String soyadGir, int dogumTarihiGir) {
		this.ad=adGir;
		this.soyad=soyadGir;
		this.dogumTarihi=(2021-dogumTarihiGir);//Yasimi burada hesapladým
	}
	
	
	public void setAd(String adGir) {
		this.ad=adGir;
	}
	
	public String getAd() {
		return this.ad;
	}
	
	public void setSoyad(String soyadGir) {
		this.soyad=soyadGir;
	}
	
	public String getSoyad() {
		return this.soyad;
	}
	
	public void setYaþ(int dogumTarihiGir) {
		this.dogumTarihi=dogumTarihiGir;
	}
	
	public int getYaþ() {
		return this.dogumTarihi;
	}
	
	public void maxHeartrate() {
		//En yüksek kalp atým hýzý (MHR)=220-yaþ 
		MHR=220-dogumTarihi;
		
		System.out.println("Hastanýn MHR'ý: " + MHR);
	}
	
	public void targetHeartrate() {
		THR=(double)MHR*0.85;
		
		System.out.println("Hastanýn THR'ý: " + THR);
	}
	
	public void show() {
		System.out.println("Hastanýn adý: " + ad);
		System.out.println("Hastanýn soyadý: " + soyad);
		System.out.println("Hastanýn yaþý: " + dogumTarihi);
		
		maxHeartrate();
		
		targetHeartrate();
	}
}
