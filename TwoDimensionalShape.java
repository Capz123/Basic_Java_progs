import java.text.DecimalFormat;

public class TwoDimensionalShape
{
//	Square							Rectangle							Triangle							Circle
	private int side_square;		private long length_rectangle;		private double height_triangle;		private double radius_circle;
	private int area_square;		private long width_rectangle;		private double side_triangleA;		private double pi = 3.1416;
	private int peri_square;		private long area_rectangle;		private double side_triangleB;		private double area_circle;
									private long peri_rectangle;		private double base_triangle;		private double peri_circle;
																		private double area_triangle;			
																		private double peri_triangle; 
																							
	
	DecimalFormat F = new DecimalFormat("##.00");
	
	//Constructor for Square
	TwoDimensionalShape(int side_square)
	{
		this.side_square = side_square;
	}
	
	//Constructor for Rectangle
	TwoDimensionalShape(long length_rectangle, long width_rectangle)
	{
		this.length_rectangle = length_rectangle;
		this.width_rectangle = width_rectangle;
	}
	
	//Constructor for Triangle
	TwoDimensionalShape(double height_triangle, double side_triangleA, double side_triangleB, double base_triangle)
	{
		this.height_triangle = height_triangle;
		this.side_triangleA = side_triangleA;
		this.side_triangleB = side_triangleB;
		this.base_triangle = base_triangle;
	}
	
	//Constructor for Circle
	TwoDimensionalShape(double radius_circle)
	{
		this.radius_circle = radius_circle;
	}
	


	//Area of Square
	protected void area(int Square)
	{
		area_square = side_square*side_square;
		System.out.println("\nThe Area of Square is: "+area_square);
	}
	//Perimeter of Square
	protected void perimeter(int Square)
	{
		peri_square = 4*side_square;
		System.out.println("\nThe Perimeter of Square is: "+peri_square);
	}
	
	//Area of Rectangle
	protected void area(long length_rectangle,long width_rectangle)
	{
		area_rectangle = length_rectangle*width_rectangle;
		System.out.println("\nThe Area of Rectangle is: "+area_rectangle);
	}
	//Perimeter of Rectangle
	protected void perimeter(long length_rectangle, long width_rectangle)
	{
		peri_rectangle = 2*length_rectangle + 2*width_rectangle;
		System.out.println("\nThe Perimeter of Rectangle is: "+peri_rectangle);
	}
	
	//Area of Triangle
	protected void area(double base_triangle,double height_triangle)
	{
		area_triangle = 0.5 * base_triangle * height_triangle;
		System.out.println("\nThe Area of Triangle is: "+F.format(area_triangle));
	}
	//Perimeter of Triangle
	protected void perimeter(double side_triangleA, double side_triangleB, double base_triangle)
	{
		peri_triangle = side_triangleA + side_triangleB + base_triangle;
		System.out.println("\nThe Perimeter of Triangle is: "+peri_triangle);
	}
	
	//Area of Circle
	protected void area(double radius_circle)
	{
		area_circle = pi*radius_circle*radius_circle;
		System.out.println("\nThe Area of Circle is: "+F.format(area_circle));
	}
	//Perimeter of Circle
	protected void perimeter(double radius_circle)
	{
		peri_circle = 2*pi*radius_circle;
		System.out.println("\nThe Perimeter of Circle is: "+F.format(peri_circle));
	}

}



//Class of Square
class Square extends TwoDimensionalShape
{
	Square(int s_square)
	{
		super(s_square);
	}
	
	public void area(int s_square)
	{
		System.out.println("---SQUARE---");
		super.area(s_square);
	}
	
	public void perimeter(int s_square)
	{
		super.perimeter(s_square);
	}
}


//Class of Rectangle
class Rectangle extends TwoDimensionalShape
{
	Rectangle(long l,long w)
	{
		super(l,w);
	}
	
	public void area(int l,int w)
	{
		super.area(l,w);
	}
	
	public void perimeter(int l, int w)
	{
		super.perimeter(l,w);
	}
}



//Class of Triangle
class Triangle extends TwoDimensionalShape
{
	Triangle(double h_t,double s_t1,double s_t2,double base)
	{
		super(h_t,s_t1,s_t2,base);
	}
	
	public void area(double h_t,double base)
	{
		System.out.print("---TRIANGLE---");
		super.area(base, h_t);
	}
	
	public void perimeter(double s_t1, double s_t2, double base)
	{
		super.perimeter(s_t1,s_t2,base);
	}
	
	
}


//Class of Cirlce
class Circle extends TwoDimensionalShape
{
	Circle(double r_c)
	{
		super(r_c);
	}
	
	public void area(double r_c)
	{
		System.out.print("---CIRCLE---");
		super.area(r_c);
	}
	
	public void perimeter(double r_c)
	{
		super.perimeter(r_c);
	}
}







 










