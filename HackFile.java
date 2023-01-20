public class HackerRankSolution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        String hello = "Hello, World." + " \nHello, Java.";
        System.out.println(hello);
    }
}

public class ScannerSolution {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
    }
}


public class MultiIntergerPrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println( a + "\n"+ b + "\n" + c + "\n" );
        
    }
}
