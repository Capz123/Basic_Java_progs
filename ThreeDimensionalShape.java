import java.text.DecimalFormat;

public class ThreeDimensionalShape
{
																	//		Cube							Prism							
	private int side;				private double radius_cylinder;			private int volume_cube;		private float volume_prism;
	private float base_prism;		private double height_cylinder;	//		Cone							Cylinder
	private double radius_cone;		private float height_prism;				private double volume_cone;		private double volume_cylinder;
	private double height_cone;		private double radius_sphere;	//		Sphere												
																			private double volume_sphere;
	
	double pi;
	
	DecimalFormat f = new DecimalFormat("##.00");
	
	
	//Constructor for Cube
	ThreeDimensionalShape(int side)
	{
		this.side = side;
	}
	
	//Constructor for Prism
	ThreeDimensionalShape(float base_prism, float height_prism)
	{
		this.base_prism = base_prism;
		this.height_prism = height_prism;
	}
	
	//Constructor for Cylinder
	ThreeDimensionalShape(double radius_cylinder, double height_cylinder)
	{
		this.radius_cylinder = radius_cylinder;
		this.height_cylinder = height_cylinder;
	}
	
	//Constructor of Cone
	ThreeDimensionalShape(double height_cone, double radius_cone,double pi)
	{
		this.radius_cone = radius_cone;
		this.height_cone = height_cone;
		this.pi = pi;
	}
	
	//Constructor of Sphere
	ThreeDimensionalShape(double radius_sphere)
	{
		this.radius_sphere = radius_sphere;
	}
	
	//Volume of Cube
	protected void volume(int side)
	{
		volume_cube = side*side;
		System.out.print("The Volume of Cube is: "+volume_cube);
	}
	
	//Volume of Prism
	protected void volume(float base_prism, float height_prism)
	{
		volume_prism = base_prism * height_prism;
		System.out.print("The Volume of Prism is: "+f.format(volume_prism));
	}
	
	//Volume of Cylinder
	protected void volume(double radius_cylinder, double height_cylinder)
	{
		double pi = 3.1416;
		volume_cylinder = Math.round(pi * radius_cylinder * radius_cylinder * height_cylinder);
		System.out.print("The Volume of Cylinder is: "+f.format(volume_cylinder));
	}
	
	//Volume of Cone 
	protected void volume(double height_cone,double radius_cone,int cone)
	{
		double pi = 3.1416;
		double h = height_cone/3;
		volume_cone = pi*radius_cone*radius_cone*h;
		System.out.print("The Volume of Cone is: "+f.format(volume_cone));
	}
	
	//Volume of Sphere
	protected void volume(double radius_sphere, int sphere)
	{
		double pi = 3.1416;
		double s = 1.3333;
		volume_sphere =	s * pi * radius_sphere * radius_sphere * radius_sphere;
		System.out.print("The Volume of Sphere is: "+f.format(volume_sphere)); 
	}

}


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








