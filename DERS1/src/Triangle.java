
public class Triangle extends TwoDimensionalShape {

	Triangle(double kenar, double y�kseklik) {
		
		super(kenar, y�kseklik);
		System.out.println("Alan: " + getArea(kenar, y�kseklik));
		System.out.println();
	}

	public double getArea(double kenarGirdi, double y�kseklikGirdi) {
		
		kenarGirdi = kenarGirdi * y�kseklikGirdi / 2;
		return kenarGirdi;
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		return 0;
	}
}
