
public class Main {
	
	public static void main(String[] args) {

		Shape[] shapes = new Shape[6];
		
		shapes[0] = new Circle(5);
		shapes[1] = new Square(5);
		shapes[2] = new Triangle(5, 5);
		shapes[3] = new Sphere(5);
		shapes[4] = new Cube(5);
		shapes[5] = new Tetrahedron(5,5);		
	}
}
