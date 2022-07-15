//Class of Cone
class Cone extends ThreeDimensionalShape
{
	Cone(double h_cone,double r_cone, double p)
	{
		super(r_cone,h_cone);
	}
	
	public void volume(double h_cone,double r_cone, int cone)
	{
		System.out.print("\n---CONE---\n");
		super.volume(h_cone,r_cone,cone);
	}
}