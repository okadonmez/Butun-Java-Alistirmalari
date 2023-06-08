package O�uzKa�an_D�nmez_203405025;

public class HeartRate {
	
	private String ad;
	private String soyad;
	private int dogumTarihi;
	private int MHR;
	private double THR;
	

	public HeartRate(String adGir, String soyadGir, int dogumTarihiGir) {
		this.ad=adGir;
		this.soyad=soyadGir;
		this.dogumTarihi=(2021-dogumTarihiGir);//Yasimi burada hesaplad�m
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
	
	public void setYa�(int dogumTarihiGir) {
		this.dogumTarihi=dogumTarihiGir;
	}
	
	public int getYa�() {
		return this.dogumTarihi;
	}
	
	public void maxHeartrate() {
		//En y�ksek kalp at�m h�z� (MHR)=220-ya� 
		MHR=220-dogumTarihi;
		
		System.out.println("Hastan�n MHR'�: " + MHR);
	}
	
	public void targetHeartrate() {
		THR=(double)MHR*0.85;
		
		System.out.println("Hastan�n THR'�: " + THR);
	}
	
	public void show() {
		System.out.println("Hastan�n ad�: " + ad);
		System.out.println("Hastan�n soyad�: " + soyad);
		System.out.println("Hastan�n ya��: " + dogumTarihi);
		
		maxHeartrate();
		
		targetHeartrate();
	}
}
