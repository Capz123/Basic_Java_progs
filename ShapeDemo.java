import java.util.*;


public class ShapeDemo
{
	public static void main(String args[])
	{
    	Scanner scan = new Scanner(System.in);
    	
    	int rectangleL,rectangleW;
    	int triangleS;
    	
    	System.out.print("Enter Length: ");
    	rectangleL = scan.nextInt();
    	System.out.print("Enter Width: ");
    	rectangleW = scan.nextInt();
    	System.out.print("Enter Side: ");
    	triangleS = scan.nextInt();
    	Rectangle s = new Rectangle(rectangleL,rectangleW);
    	s.areaRectangle();
    	s.perimeterRectangle();
    	Triangle t = new Triangle(triangleS);
    	t.areaTriangle();
    	t.perimeterTriangle();
	}
}