package DesignPatterns;

public class AnimalFactory {

	public static Animal Type(AnimalType animal)
	{
		Animal animal1 = null;
		switch(animal)
		{
		case Duck:
			animal1 = new Duck();
			 break;
		case Tiger:
			animal1 = new Tiger();
			break;
		default:
			break;
		}
		return animal1;
	}
}
