//Class of Sphere
class Sphere extends ThreeDimensionalShape
{
	Sphere(double r_sphere)
	{
		super(r_sphere);
	}
	
	public void volume(double r_sphere, int sphere)
	{
		System.out.print("\n---SPHERE---\n");
		super.volume(r_sphere,sphere);
	}
}