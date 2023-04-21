package OðuzKaðan_Dönmez_203405025;

public class HealtyProfile {
	
    private String ad;
    private String soyad;
    private String cinsiyet;
    private int doðumTarihi;
    private int Yaþ;
    private int MHR;
    private double boy;
    private double kilo;
    private double THR;
    private double BMI;
    
    
    public HealtyProfile(String adGir,String soyadGir, String cinsiyetGir, int doðumTarihiGir, double boyGir, double kiloGir) {
    	this.ad=adGir;
    	this.soyad=soyadGir;
    	this.cinsiyet=cinsiyetGir;
    	this.doðumTarihi=doðumTarihiGir;
    	if(boyGir>0) {
    		this.boy=boyGir;
    	}
    	if(kiloGir>0) {
    		this.kilo=kiloGir;
    	}
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
    
    public void setCinsiyet(String cinsiyetGir) {
    	this.cinsiyet=cinsiyetGir;
    }
    
    public String getCinsiyet() {
    	return this.cinsiyet;
    }
    
    public void setDoðumTarihi(int doðumTarihiGir) {
    	this.doðumTarihi=doðumTarihiGir;
    }
    
    public int getDoðumTarihi() {
    	return this.doðumTarihi;
    }
    
    public void setBoy(Double boyGir) {
    	this.boy=boyGir;
    }
    
    public double getBoy() {   
	    return this.boy;
    }
    
    public void setKilo(Double kiloGir) {
    	this.kilo=kiloGir;
    }
    
    public double getKilo() {
    	return this.kilo;
    }
    
    public void Hesaplamalar() {
    	Yaþ=2021-doðumTarihi;
    	MHR=220-Yaþ;
    	THR=(double)MHR*0.85;
    	BMI=(this.kilo/(this.boy*this.boy));
    	
    	System.out.println("Hastanýn yaþý: "+Yaþ);
    	System.out.println("Hastanýn MHR'ý: " + MHR);
    	System.out.println("Hastanýn THR'ý: " + THR);
    	System.out.println("Hastanýn BMI'ý: " + BMI);
    }
    
    public void show() {
    	if((this.boy>0)&&(this.kilo>0)) {
    		System.out.println("Boy ve Kilo pozitif deðerler");
    		Hesaplamalar();
    	}
    	else {
    		System.out.println("Sistemde bir hata oluþtu. Lütfen boy ve kiloyu pozitif deðerler ile tekrar giriniz!");
    	}
    }
}
