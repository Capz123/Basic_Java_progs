import java.util.*;

public class DimensionDemo
{
	public static void main(String args[]) 
	{
    	Scanner sc = new Scanner(System.in);
    	
    	
    //	Square				Rectangle			Triangle			Circle
    	int s_square;		long length_r;		double height_t;	double radius_circle;
    	int Square;			long width_r;		double side_t1;		double Circle;
    						long Rectangle;		double side_t2;
    											double base_t;
    											double Triangle;
	//	Cube				Prism				Cylinder				Cone					Sphere
		int s_cube;			float b_prism;		double radius_cylinder;	double height_cone;		double radius_sphere;
							float h_prism;		double height_cylinder;	double radius_cone;
	
	//	Variables for JavaProgram
	
		int n;
		int shape;
		int s;
		int cone;
		int sphere;
	
	
	do
	{
	
			System.out.print("--__Choose a Number To Select a Topic__--\n");
			System.out.println("1. Two Dimensional Shapes");
			System.out.println("2. Three Dimensional Shapes");
			System.out.println("3. Exit the Program");
			System.out.print("\n\nEnter a number to Select: ");
			n = sc.nextInt();
			
			if(n==1)
			{
				do
				{
					System.out.print("\n\n---Choose a Number To Select Shape---\n");
					System.out.println("\n1. Square");
					System.out.println("\n2. Rectangle");
					System.out.println("\n3. Triangle");
					System.out.println("\n4. Circle");
					System.out.println("\n5. Back !");
					System.out.print("\n\nEnter Number to Select: ");
					shape = sc.nextInt();
					
					if(shape == 1)
					{
						System.out.println("\nYou Selected Square\n");
						System.out.print("Enter Side: ");
						s_square = sc.nextInt();
						Square sq = new Square(s_square);
						sq.area(s_square);
						sq.perimeter(s_square);
					}
					else if(shape == 2)
					{
						System.out.println("\nYou Selected Rectangle\n");
						System.out.print("Enter Length: ");
						length_r = sc.nextInt();
						System.out.print("Enter Width: ");
						width_r = sc.nextInt();
						Rectangle rc = new Rectangle(length_r,width_r);
						rc.area(length_r,width_r);
						rc.perimeter(length_r,width_r);
					}
					else if(shape == 3)
					{
						System.out.println("\nYou Selected Triangle\n");
						System.out.print("Enter Height: ");
						height_t = sc.nextInt();
						System.out.print("Enter Side A: ");
						side_t1 = sc.nextInt();
						System.out.print("Enter Side B: ");
						side_t2 = sc.nextInt();
						System.out.print("Enter Base: ");
						base_t = sc.nextInt();
						
						Triangle tr = new Triangle(height_t,side_t1,side_t2,base_t);
						tr.area(base_t,height_t);
						tr.perimeter(side_t1,side_t2,base_t);
					}
					else if(shape == 4)
					{
						System.out.println("\nYou Selected Circle\n");
						System.out.print("Enter Radius: ");
						radius_circle = sc.nextInt();
						
						Circle c = new Circle(radius_circle);
						c.area(radius_circle);
						c.perimeter(radius_circle);
					}
					else
					{
						break;
					}
					
				}while(shape != 5);
			}
			else if (n == 2)
			{
				do
				{
					System.out.println("\n---__Choose a number to Selec Shape__---\n");
					System.out.println("\n1. Cube");
					System.out.println("\n2. Prism");
					System.out.println("\n3. Cylinder");
					System.out.println("\n4. Cone");
					System.out.println("\n5. Sphere");
					System.out.println("\n6. Back !");
					System.out.print("\n\nEnter number to Select Shape: ");
					s = sc.nextInt();
					
					if(s == 1)
					{
						System.out.println("\nYou Selected Cube\n");
						System.out.print("Enter Side: ");
						s_cube = sc.nextInt();
						
						Cube cb = new Cube(s_cube);
						cb.volume(s_cube);
					}
					else if(s == 2)
					{
						System.out.println("\nYou Selected Prism\n");
						System.out.print("Enter Base: ");
						b_prism = sc.nextFloat();
						System.out.print("Enter Height: ");
						h_prism = sc.nextFloat();
						
						Prism p = new Prism(b_prism,h_prism);
						p.volume(b_prism,h_prism);
					}
					else if(s == 3)
					{
						System.out.println("\nYou Selected Cylinder\n");
						System.out.print("Enter Radius: ");
						radius_cylinder = sc.nextDouble();
						System.out.print("Enter Height: ");
						height_cylinder = sc.nextDouble();
						
						Cylinder cl = new Cylinder(radius_cylinder, height_cylinder);
						cl.volume(radius_cylinder,height_cylinder);
					}
					else if(s == 4)
					{
						System.out.println("\nYou Selected Cone\n");
						System.out.print("Enter Height: ");
						height_cone = sc.nextDouble();
						System.out.print("Enter Radius: ");
						radius_cone = sc.nextDouble();
						double p = 3.1416;
						cone = 0;
						
						
						
						Cone cn = new Cone(height_cone,radius_cone,p);
						cn.volume(height_cone, radius_cone,cone);
					}
					else if(s == 5)
					{
						System.out.println("\nYou Selected Sphere\n");
						System.out.print("Enter Radius: ");
						radius_sphere = sc.nextDouble();
						
						sphere = 0;
						Sphere ph = new Sphere(radius_sphere);
						ph.volume(radius_sphere,sphere);
					}
					else
					{
						break;
					}
					
				}while(s != 6);
			}
			else
			{
				break;
			}
	
	}while(n != 3);
		
	
	}
}