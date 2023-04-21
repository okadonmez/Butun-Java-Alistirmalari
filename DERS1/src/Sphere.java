
public class Sphere extends ThreeDimensionalShape {

	Sphere(double kenar) {
		
		super(kenar);
		System.out.println("Alan: " + getArea(kenar));
		System.out.println("Hacim: " + getVolume(kenar));
		System.out.println();
	}

	public double getArea(double kenarGirdi) {
		
		kenarGirdi = 4 * Math.PI * kenarGirdi * kenarGirdi;
		return kenarGirdi;
	}

	public double getVolume(double kenarGirdi) {
		
		kenarGirdi = Math.PI * kenarGirdi * kenarGirdi * kenarGirdi * ((double)4 / (double)(3));
		return kenarGirdi;
	}
}
