
public class Employee {
	
	private String i��ininAd�;
	private String i��ininSoyad�;
	private int tcKimlik;
	
	Employee(String i��ininAd�Girdi, String i��ininSoyad�Girdi, int tcKimlikGirdi){
		
		this.i��ininAd� = i��ininAd�Girdi;
		this.i��ininSoyad� = i��ininSoyad�Girdi;
		this.tcKimlik = tcKimlikGirdi;
	}
	
	public String getI��ininAd�() {
		
		return i��ininAd�;
	}
	public void setI��ininAd�(String i��ininAd�Girdi) {
		
		this.i��ininAd� = i��ininAd�Girdi;
	}
	
	public String getI��ininSoyad�() {
		
		return i��ininSoyad�;
	}
	public void setI��ininSoyad�(String i��ininSoyad�Girdi) {
		
		this.i��ininSoyad� = i��ininSoyad�Girdi;
	}
	
	public int getTcKimlik() {
		
		return tcKimlik;
	}
	public void setTcKimlik(int tcKimlikGirdi) {
		
		this.tcKimlik = tcKimlikGirdi;
	}
	
	public void Write() {
		
		System.out.println("���inin ad�: " + this.i��ininAd�);
		System.out.println("���inin soyad�: " + this.i��ininSoyad�);
		System.out.println("���inin TC kimlik numaras�: " + this.tcKimlik);
	}
}
