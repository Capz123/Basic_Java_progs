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
