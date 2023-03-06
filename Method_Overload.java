package JAVA_METHODS;

public class Method_Overload {
	
	public void areaOfTriangle(int b , int h )
	{
		System.out.println(" The are of the triangle is :"+(0.5*b*h));
		
	}
	public void areaOfCircle(int r)
	{
		System.out.println("The area of the circle is :"+(3.142*r*r));
	}
	public static void main(String arg[])
	{
		
		Method_Overload s=new Method_Overload();
		
		s.areaOfTriangle(5, 6);
		s.areaOfCircle(5);
		
		
	}

}
