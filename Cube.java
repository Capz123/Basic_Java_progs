//Class of Cube
class Cube extends ThreeDimensionalShape
{
	Cube(int s)	
	{
		super(s);
	}
	public void volume(int s)
	{
		System.out.print("\n---CUBE---\n");
		super.volume(s);
	}
}