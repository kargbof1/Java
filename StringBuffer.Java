// Java program to illustrate the
// java.lang.StringBuffer.reverse()
import java.lang.*;

public class Test {

	public static void main(String args[])
	{
		StringBuffer sbf = new StringBuffer("1 2 3 4 5 6 7 8 9 10");
		System.out.println("String buffer = " + sbf);

		// Here it reverses the string buffer
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);
	}
}
