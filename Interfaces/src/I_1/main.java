package I_1;
//Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
//Implement the getArea() method for each of the three classes.
public class main {

	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle(2, 8);
		Circle circle=new Circle(4);
		Triangle triangle=new Triangle(2, 7);
		
		System.out.println("Area of the Rectangle: "+rectangle.getArea());
		System.out.println("Area of the Circle: "+circle.getArea());
		System.out.println("Area of the Triangle: "+triangle.getArea());

	}

}
