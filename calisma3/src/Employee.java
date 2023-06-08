
public class Employee {
	
	private String iþçininAdý;
	private String iþçininSoyadý;
	private int tcKimlik;
	
	Employee(String iþçininAdýGirdi, String iþçininSoyadýGirdi, int tcKimlikGirdi){
		
		this.iþçininAdý = iþçininAdýGirdi;
		this.iþçininSoyadý = iþçininSoyadýGirdi;
		this.tcKimlik = tcKimlikGirdi;
	}
	
	public String getIþçininAdý() {
		
		return iþçininAdý;
	}
	public void setIþçininAdý(String iþçininAdýGirdi) {
		
		this.iþçininAdý = iþçininAdýGirdi;
	}
	
	public String getIþçininSoyadý() {
		
		return iþçininSoyadý;
	}
	public void setIþçininSoyadý(String iþçininSoyadýGirdi) {
		
		this.iþçininSoyadý = iþçininSoyadýGirdi;
	}
	
	public int getTcKimlik() {
		
		return tcKimlik;
	}
	public void setTcKimlik(int tcKimlikGirdi) {
		
		this.tcKimlik = tcKimlikGirdi;
	}
	
	public void Write() {
		
		System.out.println("Ýþçinin adý: " + this.iþçininAdý);
		System.out.println("Ýþçinin soyadý: " + this.iþçininSoyadý);
		System.out.println("Ýþçinin TC kimlik numarasý: " + this.tcKimlik);
	}
}
