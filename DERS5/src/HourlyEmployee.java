
public class HourlyEmployee extends Employee {

	private int hour;
	private int wage;
	
	HourlyEmployee(String iþçininAdýGirdi, String iþçininSoyadýGirdi, int tcKimlikGirdi, int hourGirdi, int wageGirdi) {
		
		super(iþçininAdýGirdi, iþçininSoyadýGirdi, tcKimlikGirdi);
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
		
		System.out.println("Ýþçinin aylýk kazancý :" + (this.hour * this.wage));
	}
	
	@Override
	public void Write() {
			
		super.Write();
		Earnings();
	}
}
