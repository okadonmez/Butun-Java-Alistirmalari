
public class HourlyEmployee extends Employee {

	private int hour;
	private int wage;
	
	HourlyEmployee(String i��ininAd�Girdi, String i��ininSoyad�Girdi, int tcKimlikGirdi, int hourGirdi, int wageGirdi) {
		
		super(i��ininAd�Girdi, i��ininSoyad�Girdi, tcKimlikGirdi);
		this.hour = hourGirdi;
		this.wage = wageGirdi;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hourGirdi) {
		this.hour = hourGirdi;
	}
	
	public int getWage() {
		return wage;
	}
	public void setWage(int wageGirdi) {
		this.wage = wageGirdi;
	}
	
	public void Earnings() {
		
		System.out.println("���inin ayl�k kazanc� :" + (this.hour * this.wage));
	}
	
	@Override
	public void Write() {
			
		super.Write();
		Earnings();
	}
}
