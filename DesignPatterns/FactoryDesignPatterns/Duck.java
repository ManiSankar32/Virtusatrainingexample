package DesignPatterns;

public class Duck extends Animal{

	public Duck() {
		super(AnimalType.Duck);
		// TODO Auto-generated constructor stub
		Walk();
	}

	

	@Override
	protected void Walk() {
		// TODO Auto-generated method stub
		System.out.println("Duck Says Pack-Pack");
	}

	@Override
	protected void Eat() {
		// TODO Auto-generated method stub
		
	}
 
	
}
