package AbstractClass2;

public class main {

	public static void main(String[] args) {
		 double r=2.0;
		 double s1=2,s2=5,s3=6;
		 
		 Circle circle=new Circle(r);
		 System.out.println("Radius of the circle: " +r);
		 System.out.println("Area of the circle:  " + circle.calculateArea());
		 System.out.println("Perimeter of the circle: "+circle.calculatePerimeter());
		 
		 Triangle triangle=new Triangle(s1,s2,s3);
		 System.out.println("Sides of the triangle: "+s1+" "+s2+" "+s3);
		 System.out.println("Area of the triangle: "+ triangle.calculateArea());
		 System.out.println("Perimeter of the triangle: "+ triangle.calculatePerimeter());

	}

}
