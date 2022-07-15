//Class of Cylinder
class Cylinder extends ThreeDimensionalShape
{
	Cylinder(double r_c,double h_c)
	{
		super(r_c,h_c);
	}
	
	public void volume(double r_c, double h_c)
	{
		System.out.print("\n---CYLINDER---\n");
		super.volume(r_c, h_c);
	}
}
