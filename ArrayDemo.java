class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray ={10,100,200,300,400,500,600,700,800,900,1000};
           String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        int[] copyTo = java.util.Arrays.copyOfRange(anArray, 2, 4);
        System.out.println(copyTo[0]); //copy range
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 0: " + anArray[10]);
        System.out.println(anArray.length);
        for (int i =0; i <anArray.length;i++ ){System.out.println(anArray[i]);}
                
       // System.out.println("Element at index 0: " + anArray[1]+anArray[2]);
       // System.out.println("Sum Element at index 0 and 1: " + anArray[0] + anArray[1] );
        
    }
} 
