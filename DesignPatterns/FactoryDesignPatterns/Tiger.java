package DesignPatterns;

public class Tiger extends Animal {

	public Tiger() {
		super(AnimalType.Tiger);
		// TODO Auto-generated constructor stub
		Walk();
	}

	@Override
	protected void Walk() {
		// TODO Auto-generated method stub
		System.out.println("Tiger says Halum-Halum");
		
	}

	@Override
	protected void Eat() {
		// TODO Auto-generated method stub
		
	}

}
