package O�uzKa�an_D�nmez_203405025;

public class HealtyProfile {
	
    private String ad;
    private String soyad;
    private String cinsiyet;
    private int do�umTarihi;
    private int Ya�;
    private int MHR;
    private double boy;
    private double kilo;
    private double THR;
    private double BMI;
    
    
    public HealtyProfile(String adGir,String soyadGir, String cinsiyetGir, int do�umTarihiGir, double boyGir, double kiloGir) {
    	this.ad=adGir;
    	this.soyad=soyadGir;
    	this.cinsiyet=cinsiyetGir;
    	this.do�umTarihi=do�umTarihiGir;
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
    
    public void setDo�umTarihi(int do�umTarihiGir) {
    	this.do�umTarihi=do�umTarihiGir;
    }
    
    public int getDo�umTarihi() {
    	return this.do�umTarihi;
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
    	Ya�=2021-do�umTarihi;
    	MHR=220-Ya�;
    	THR=(double)MHR*0.85;
    	BMI=(this.kilo/(this.boy*this.boy));
    	
    	System.out.println("Hastan�n ya��: "+Ya�);
    	System.out.println("Hastan�n MHR'�: " + MHR);
    	System.out.println("Hastan�n THR'�: " + THR);
    	System.out.println("Hastan�n BMI'�: " + BMI);
    }
    
    public void show() {
    	if((this.boy>0)&&(this.kilo>0)) {
    		System.out.println("Boy ve Kilo pozitif de�erler");
    		Hesaplamalar();
    	}
    	else {
    		System.out.println("Sistemde bir hata olu�tu. L�tfen boy ve kiloyu pozitif de�erler ile tekrar giriniz!");
    	}
    }
}
