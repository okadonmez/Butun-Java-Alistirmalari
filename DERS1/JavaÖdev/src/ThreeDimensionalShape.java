
public abstract class ThreeDimensionalShape extends Shape {
	
	abstract double getArea(double kenar);
	abstract double getVolume(double kenar);
	
	ThreeDimensionalShape(double kenar, double y�kseklik) {
		
		super(kenar, y�kseklik);
	}
	
	ThreeDimensionalShape(double kenar) {
	
		super(kenar);
	}
}
