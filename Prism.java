//Class of Prism
class Prism extends ThreeDimensionalShape
{
	Prism(float b_p, float h_p)
	{
		super(b_p,h_p);
	}
	
	public void volume(float b_p, float h_p)
	{
		System.out.print("\n---PRISM---\n");
		super.volume(b_p,h_p);
	}
}