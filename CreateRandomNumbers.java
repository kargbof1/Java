import java.util.Random;
import java.util.Arrays;
class CreateRandomNumbers {
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
               

    }
    
}
