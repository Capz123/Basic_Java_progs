public class TwoDimensionalShape
{
//	Square							Rectangle							Triangle							Circle
	private int side_square;		private int length_rectangle;		private int height_triangle;		private int radius_circle;
	private int area_square;		private int width_rectangle;		private int side_triangleA;			private double pi = 3.1416;
	private int peri_square;		private int area_rectangle;			private int side_triangleB;			private double area_circle;
									private int peri_rectangle;			private int base_triangle;			private double peri_circle;
																		private int area_triangle;			
																		private int peri_triangle; 
																							
	
	
	//Constructor for Square
	TwoDimensionalShape(int side_square)
	{
		this.side_square = side_square;
	}
	
	//Constructor for Rectangle
	TwoDimensionalShape(int length_rectangle, int width_rectangle)
	{
		this.length_rectangle = length_rectangle;
		this.width_rectangle = width_rectangle;
	}
	
	//Constructor for Triangle
	TwoDimensionalShape(int height_triangle, int side_triangleA, int side_triangleB, int base_triangle)
	{
		this.height_triangle = height_triangle;
		this.side_triangleA = side_triangleA;
		this.side_triangleB = side_triangleB;
		this.base_triangle = base_triangle;
	}
	
	//Constructor for Circle
	TwoDimensionalShape(int radius_circle, double pi)
	{
		this.radius_circle = radius_circle;
		this.pi = pi;
	}
	


	//Area of Square
	protected void area(int side_square)
	{
		area_square = side_square*side_square;
		System.out.print("The Area of Square is: "+area_square);
	}
	//Perimeter of Square
	protected void perimeter()
	{
		peri_square = 4*side_square;
		System.out.print("The Perimeter of Square is: "+peri_square);
	}
	
	//Area of Rectangle
	protected void area()
	{
		area_rectangle = length_rectangle*width_rectangle;
		System.out.print("The Area of Rectangle is: "+area_rectangle);
	}
	//Perimeter of Rectangle
	protected void perimeter()
	{
		peri_rectangle = 2*length_rectangle + 2*width_rectangle;
		System.out.print("The Perimeter of Rectangle is: "+peri_rectangle);
	}
	
	//Area of Triangle
	protected void area()
	{
		area_triangle = 1/2 * (base_triangle*height_triangle);
		System.out.print("The Area of Triangle is: "+area_triangle);
	}
	//Perimeter of Triangle
	protected void perimeter()
	{
		peri_triangle = side_triangleA + side_triangleB + base_triangle;
		System.out.print("The Perimeter of Triangle is: "+peri_triangle);
	}
	
	//Area of Circle
	protected void area()
	{
		area_circle = pi*radius_circle*radius_circle;
		System.out.print("The Area of Circle is: "+area_circle);
	}
	//Perimeter of Circle
	protected void perimeter()
	{
		peri_circle = 2*pi*radius_circle;
		System.out.print("The Perimeter of Circle is: "+peri_circle);
	}

}



//Class of Square 
class Square extends TwoDimensionalShape
{
	Square(int s_square)
	{
		super(s_square);
	}
	
	public void area()
	{
		System.out.print("---SQUARE---");
		super.area();
	}
	
	public void perimeter()
	{
		super.perimeter();
	}
}



//Class of Rectangle
class Rectangle extends TwoDimensionalShape
{
	Rectangle(int l,int w)
	{
		super(l,w);
	}
	
	public void area()
	{
		System.out.print("---RECTANGLE---");
		super.area();
	}
	
	public void perimeter()
	{
		super.perimeter();
	}
}



//Class of Triangle
class Triangle extends TwoDimensionalShape
{
	Triangle(int h_t,int s_t1,int s_t2,int base)
	{
		super(h_t,s_t1,s_t2,base);
	}
	
	public void area()
	{
		System.out.print("---TRIANGLE---");
		super.area();
	}
	
	public void perimeter()
	{
		super.perimeter();
	}
	
	
}



//Class of Cirlce
class Circle extends TwoDimensionalShape
{
	Circle(int r_c)
	{
		super(r_c);
	}
	
	public void area()
	{
		System.out.print("---CIRCLE---");
		super.area();
	}
	
	public void perimeter()
	{
		super.perimeter();
	}
}