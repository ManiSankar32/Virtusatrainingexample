interface  Ivehicle
{
    public abstract void drive();
    abstract public  void turnleft();
    abstract public void Break();
    

}
interface IpubllicInterface{
   public abstract void getNumberofPeople();
}
class MotorisedVehicle{
    public void Checkmotor(){
        System.out.println("The motor of the vehicle in good condition");
        
    }
    
}
class Car extends MotorisedVehicle implements Ivehicle{
   public void drive()
   {
       
   }
   public void turnleft()
   {
       
   }
    public void Break()
    {
        System.out.println("The car is in Break mode");
    }
    
}
class Train implements Ivehicle,IpubllicInterface{
   public void drive()
   {
       
   }
   public void Break()
   {
       
   }
    public void getNumberofPeople()
    {
        System.out.println("100");
    }
    public void turnleft()
    {
        System.out.println("the train was turning left");
    }
}
class InterfaceDemo{

public static void main (String[] args) {
    
    Car ca = new Car();
    ca.Break();
    ca.Checkmotor();
    Train tr = new Train();
    tr.getNumberofPeople();
    tr.turnleft();
}
}