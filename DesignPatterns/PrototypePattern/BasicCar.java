package PrototypePattern;

public abstract class BasicCar implements Cloneable {
   
	protected String modelname;
	private int price;
	abstract void color();
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getprice(int price)
	{
		return price;
	}
	public Object clone() {
		Object clone = null;
	
	try {
		clone = super.clone();
		
	}catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
	}
	return clone;
	}
}
class Ford extends BasicCar{
      public Ford()
      {
    	  modelname="Ford";
      }
	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("Green");
	}
	
}
class Nano extends BasicCar{
    public Nano()
    {
    	modelname="Nano";
    }
	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
		
	}
	
}