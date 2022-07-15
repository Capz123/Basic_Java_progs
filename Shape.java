public class Shape
{
	private int length;
	private int width;
	private int AreaR;
	private int areaT;
	private int perimeterT;
	private int perimeterR;
	private int side;
	

	Shape(int length, int width)
	{
		this.length = length;
		this.width = width;	
	}
	Shape(int side)
	{
		this.side = side;
	}
	
	protected void areaRectangle()
	{
		AreaR = length*width;
		System.out.print("\nThe area of Rectangle is: "+AreaR);
	}
	protected void perimeterRectangle()
	{
		perimeterR  = 2*length + 2*width;
		System.out.print("\n\nThe Perimeter is: "+perimeterR);
	}
	protected void areaTriangle()
	{
		areaT = side*side;
		System.out.print("\nThe Area of Triangle: "+areaT);
	}
	protected void perimeterTriangle()
	{
		perimeterT = 4*side;
		System.out.print("\nThe perimeter of Triangle is : "+perimeterT);
	}

}