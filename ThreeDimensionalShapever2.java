public class ThreeDimensionalShape
{
																	//		Cube							Prism							
	private int side;				private int radius_cylinder;			private int volume_cube;		private double volume_prism;
	private int base_prism;			private int height_cylinder;	//		Cone							Cylinder
	private int radius_cone;		private int height_prism;				private double volume_cone;		private double volume_cylinder;
	private int height_cone;		private int radius_sphere;		//		Sphere												
	private double pi = 3.1416;												private double volume_sphere;
	
	
	//Constructor for Cube
	ThreeDimensionalShape(int side)
	{
		this.side = side;
	}
	
	//Constructor for Prism
	ThreeDimensionalShape(int base_prism, int height_prism)
	{
		this.base_prism = base_prism;
		this.height_prism = height_prism;
	}
	
	//Constructor for Cylinder
	ThreeDimensionalShape(int radius_cylinder, int height_cylinder)
	{
		this.radius_cylinder = radius_cylinder;
		this.height_cylinder = height_cylinder;
	}
	
	//Constructor of Cone
	ThreeDimensionalShape(int radius_cone, int height_cone)
	{
		this.radius_cone = radius_cone;
		this.height_cone = height_cone;
	}
	
	//Constructor of Sphere
	ThreeDimensionalShape(int radius_sphere)
	{
		this.radius_sphere = radius_sphere;
	}
	
	//Volume of Cube
	protected void volume()
	{
		volume_cube = side*side;
		System.out.print("The Volume of Cube is: "+volume_cube);
	}
	
	//Volume of Prism
	protected void volume()
	{
		volume_prism = base_prism * base_prism;
		System.out.print("The Volume of Prism is: "+volume_prism);
	}
	
	//Volume of Cylinder
	protected void volume()
	{
		volume_cylinder = pi * radius_cylinder * radius_cylinder * height_cylinder;
		System.out.print("The Volume of Cylinder is: "+volume_cylinder);
	}
	
	//Volume of Cone 
	protected void volume()
	{
		double h = height_cone/3;
		volume_cone = pi*radius_cone*radius_cone*h;
		System.out.print("The Volume of Cone is: "+volume_cone);
	}
	
	//Volume of Sphere
	protected void volume()
	{
		double s = 4/3;
		volume_sphere =	s * pi * radius_sphere* radius_sphere* radius_sphere;
		System.out.print("The Volume of Sphere is: "+volume_sphere); 
	}

}


//Class of Cube
class Cube extends ThreeDimensionalShape
{
	Cube(int s)	
	{
		super(s);
	}
	public void volume()
	{
		System.out.print("---CUBE---");
		super.volume();
	}
}


//Class of Prism
class Prism extends ThreeDimensionalShape
{
	Prism(int b_p, int h_p)
	{
		super(b_p,h_p);
	}
	
	public void volume()
	{
		System.out.print("---PRISM---");
		super.volume();
	}
}

//Class of Cylinder
class Cylinder extends ThreeDimensionalShape
{
	Cylinder(int r_c,int r_h)
	{
		super(r_c,r_h);
	}
	
	public void volume()
	{
		System.out.print("---CYLINDER---");
		super.volume();
	}
}

//Class of Cone
class Cone extends ThreeDimensionalShape
{
	Cone(int r_cone,int h_cone)
	{
		super(r_cone,h_cone);
	}
	
	public void volume()
	{
		System.out.print("---CONE---");
		super.volume();
	}
}


//Class of Sphere
class Sphere extends ThreeDimensionalShape
{
	Sphere(int r_sphere)
	{
		super(r_sphere);
	}
	
	public void volume()
	{
		System.out.print("---SPHERE---");
		super.volume();
	}
}