package BuilderDesignPattern;

abstract class Cooldrinks implements Item{
	//private Packing package1 = new Packing();
	public void getPacking() {
		System.out.print("Bottle");
	}
}
class Coke extends Cooldrinks 
{
    float price=30.0f;
	@Override
	public void itemName() {
		// TODO Auto-generated method stub
		System.out.print("Coke");
	}

	@Override
	public float itemPrice() {
		// TODO Auto-generated method stub
        return price; 
	}

	
	
}
class Pepsi extends Cooldrinks
{
    float price=35.0f;
	@Override
	public void itemName() {
		// TODO Auto-generated method stub
		System.out.print("Pepsi");
	}

	@Override
	public float itemPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
