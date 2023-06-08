
public class Cube extends ThreeDimensionalShape {

	Cube(double kenar) {
		
		super(kenar);
		System.out.println("Alan: " + getArea(kenar));
		System.out.println("Hacim: " + getVolume(kenar));
		System.out.println();
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		kenarGirdi = kenarGirdi * kenarGirdi * 6;
		return kenarGirdi;
	}

	@Override
	public double getVolume(double kenarGirdi) {
		
		kenarGirdi = kenarGirdi * kenarGirdi * kenarGirdi;
		return kenarGirdi;
	}
}