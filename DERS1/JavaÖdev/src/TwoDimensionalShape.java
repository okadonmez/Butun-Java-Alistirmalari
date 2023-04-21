
public abstract class TwoDimensionalShape extends Shape {

	abstract double getArea(double kenar);
	
	TwoDimensionalShape(double kenar, double yükseklik) {
		
		super(kenar, yükseklik);
	}
	
	TwoDimensionalShape(double kenar) {
		
		super(kenar);
	}
}
