
public abstract class ThreeDimensionalShape extends Shape {
	
	abstract double getArea(double kenar);
	abstract double getVolume(double kenar);
	
	ThreeDimensionalShape(double kenar, double yükseklik) {
		
		super(kenar, yükseklik);
	}
	
	ThreeDimensionalShape(double kenar) {
	
		super(kenar);
	}
}
