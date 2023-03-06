package JAVA_METHODS;

import java.util.Scanner;

public class Method_Execution {
	
	public int multiplynumbers(int a, int b)              // creation of the method 
	{
	
	int z=a*b;
	return z;
	}
	
		 public static void main(String arg[])
		 {
			
			 
			
			 
			 Method_Execution s=new Method_Execution();   // creating the object for the class 
			 
			 int ans=s.multiplynumbers(1000,2000);        // here the multiplication operation is performed 
			 System.out.println(" MULTIPLICATION "+ans);
			 
			 
		 }
		
	

}
