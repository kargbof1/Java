public class TryCatch {
    public static void main(String[] args)
    {
    int a = 1;
    int b = 0;
    int c = 0;
         
    try {
        c= a/b;
        
    } catch (Exception e) {
        System.out.println("it broke");

        // TODO: handle exception
    }

       
    }
    
}


// Java program to demonstrate ArithmeticException
class ArithmeticException_Demo
{
	public static void main(String args[])
	{
		try {
			int a = 30, b = 0;
			int c = a/b; // cannot divide by zero
			System.out.println ("Result = " + c);
		}
		catch(ArithmeticException e) {
			System.out.println ("Can't divide a number by 0");
		}
	}
}
