package BuilderDesignPattern;

public interface Packing {
  String pack();
  
}

class Wrapper implements Packing
{

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Wrapper";
	}
	
}

class Bottle implements Packing
{

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Bottle" ;
	}
	
}