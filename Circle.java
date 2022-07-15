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