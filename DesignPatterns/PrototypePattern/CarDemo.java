package PrototypePattern;

public class CarDemo {

	public static void main(String[] args) {
      BasicCarCache.loadcache();
      
      System.out.println("*** Prototype pattern Demo ***");
      BasicCar clonedcar = BasicCarCache.getCar("Green Nano");
      System.out.println("Car: "+clonedcar.getModelname()+" and its price is: Rs."+clonedcar.getprice(189818));
      
      BasicCar clonedcar1 = BasicCarCache.getCar("Yellow Ford");
      System.out.println("Car: "+ clonedcar1.getModelname() +" and its price is: Rs."+clonedcar1.getprice(561925));
	}

}
