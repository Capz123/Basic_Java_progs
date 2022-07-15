//Class of Triangle
class Triangle extends TwoDimensionalShape
{
	Triangle(float h_t,float s_t1,float s_t2,float base)
	{
		super(h_t,s_t1,s_t2,base);
	}
	
	public void area(float h_t,float base)
	{
		System.out.print("---TRIANGLE---");
		super.area(base, h_t);
	}
	
	public void perimeter(float s_t1, float s_t2, float base)
	{
		super.perimeter(s_t1,s_t2,base);
	}
	
	
}