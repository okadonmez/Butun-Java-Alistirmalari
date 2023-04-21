
public class Tetrahedron extends ThreeDimensionalShape {

	Tetrahedron(double kenar, double yükseklik) {
		
		super(kenar, yükseklik);
		System.out.println("Alan: " + getArea(kenar));
		System.out.println("Hacim: " + getVolume(kenar, yükseklik));
		System.out.println();
	}

	@Override
	public double getArea(double kenarGirdi) {
		
		kenarGirdi = kenarGirdi * kenarGirdi * Math.sqrt(3);
		return kenarGirdi;
	}

	public double getVolume(double kenarGirdi, double yükseklikGirdi) {
		
		kenarGirdi = kenarGirdi * kenarGirdi * kenarGirdi * Math.sqrt(2) / 12;
		return kenarGirdi;
	}

	@Override
	public double getVolume(double kenarGirdi) {
		
		return 0;
	}
}