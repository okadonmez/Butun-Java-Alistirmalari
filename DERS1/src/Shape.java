
public abstract class Shape {

	public static int i = 0;
	
	Shape(double kenar){
		
		ÞekilAçýklamasý();
	}
	Shape(double kenar, double yükseklik){
		
		ÞekilAçýklamasý();
	}
	
	
	public void ÞekilAçýklamasý() {
		
		if(i == 0) {
			
			System.out.println("Circle");
		}
		else if(i == 1) {
			
			System.out.println("Square");
		}
		else if(i == 2) {
			
			System.out.println("Triangle");
		}
		else if(i == 3) {
			
			System.out.println("Sphere");
		}
		else if(i == 4) {
			
			System.out.println("Cube");
		}
		else if(i == 5) {
			
			System.out.println("Tetrahedron");
		}
		
		if(i == 0 || i == 1 || i == 2) {
			
			System.out.println("TwoDimensionalShape");
		}

		if(i == 3 || i == 4 || i == 5) {
			
			System.out.println("ThreeDimensionalShape");
		}
		
		i++;
	}
}
