
public class Circle extends TwoDimensionalShape {

	Circle(double kenar) {
		
		super(kenar);
		System.out.println("Alan: " + getArea(kenar));
		System.out.println();
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		kenarGirdi = Math.PI * kenarGirdi * kenarGirdi;
		return kenarGirdi;
	}
}