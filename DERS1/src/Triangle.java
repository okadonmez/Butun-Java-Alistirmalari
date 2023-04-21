
public class Triangle extends TwoDimensionalShape {

	Triangle(double kenar, double yükseklik) {
		
		super(kenar, yükseklik);
		System.out.println("Alan: " + getArea(kenar, yükseklik));
		System.out.println();
	}

	public double getArea(double kenarGirdi, double yükseklikGirdi) {
		
		kenarGirdi = kenarGirdi * yükseklikGirdi / 2;
		return kenarGirdi;
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		return 0;
	}
}
