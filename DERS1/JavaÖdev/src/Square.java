
public class Square extends TwoDimensionalShape {

	Square(double kenar) {
		
		super(kenar);
		System.out.println("Alan: " + getArea(kenar));
		System.out.println();
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		kenarGirdi = kenarGirdi * kenarGirdi;
		return  kenarGirdi;
	}
}