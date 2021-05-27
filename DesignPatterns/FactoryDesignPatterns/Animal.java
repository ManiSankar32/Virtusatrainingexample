package DesignPatterns;

public abstract class Animal {
    protected AnimalType animal=null;
	public Animal(AnimalType animal){
		this.animal =animal;
	}
	protected abstract void Walk();
	protected abstract void Eat();
	
	public void setType(AnimalType animal)
	{
		this.animal=animal;
	}
	public AnimalType getType()
	{
		return animal;
	}
}
