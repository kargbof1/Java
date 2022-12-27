import java.util.Random;
import java.util.Arrays;
class BubbleSort {
    public static void main(String [] args){
        //call random
        Random rand = new Random();
        //create list of numbers and create memory
        int[] numbers = new int[10];
        //create the list of random numbers and iterate through the list of numbers 
        for(int i=0; i < numbers.length;i++){
            numbers[i]=rand.nextInt(100); //create 10 randoms from 0 to 100
            System.out.println(numbers[i]);
       
        }
               
        //Bubble sort algorithm
        boolean swappedSomething = true;
        while(swappedSomething){
            swappedSomething=false;
        for (int i = 0; i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                swappedSomething=true;
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1]=temp;

            }
        }
    }

    }
    
}
