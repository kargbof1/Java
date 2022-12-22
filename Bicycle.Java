public class Bicycle{

    public static void main(String[] args) {
        BicycleState bicycle1 = new BicycleState();
        BicycleState bicycle2 = new BicycleState();

        bicycle1.changeCandence(50);
        bicycle1.changeGear(2);
        bicycle1.changeSpeed(10);
        bicycle1.printState();

       bicycle2.changeCandence(60);
        bicycle2.changeGear(4);
        bicycle2.changeSpeed(20);
        bicycle2.printState();

    }
    

}
class BicycleState{
  //Initial state of the bicycle
    int candence =0;
    int speed =0;
    int gear = 1;
    void changeCandence(int newValue){
        candence = newValue;
        
    }
    
    void changeGear(int newValue)
    {
        gear = newValue;

    }

    void changeSpeed(int increaseSpeed)
    {
        speed = speed + increaseSpeed;
    }
    void applybreak(int decreaseSpeed)
    {
        speed = speed - decreaseSpeed;
 
    }
    void printState()
    {
       // System.out.println(candence + speed + gear);
       System.out.println("cadence:" +
       candence + " speed:" + 
             speed + " gear:" + gear);
    }
}
