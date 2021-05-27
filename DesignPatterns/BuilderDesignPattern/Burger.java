package BuilderDesignPattern;

abstract class Burger implements Item
{
	@Override
	public void getPacking(){
		// TODO Auto-generated method stub
		System.out.print("Wrapper"); 
	}
	
}
class VegBurger extends Burger{

	String name="Veg Burger";
	float price=25.0f;
	@Override
	public void itemName() {
		// TODO Auto-generated method stub
		System.out.print(name);
	}

	@Override
	public float itemPrice() {
		// TODO Auto-generated method stub
		return price;
	}


}
 class ChickenBurger extends Burger{
 
	String name="ChickenBurger";
	float price=50.5f;
	@Override
	public void itemName() {
		// TODO Auto-generated method stub
		System.out.print(name);
	}

	@Override
	public float itemPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	

}