
public abstract class TwoDimensionalShape extends Shape {

	abstract double getArea(double kenar);
	
	TwoDimensionalShape(double kenar, double y�kseklik) {
		
		super(kenar, y�kseklik);
	}
	
	TwoDimensionalShape(double kenar) {
		
		super(kenar);
	}
}
