package BuilderDesignPattern;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<Item>();;
    
    public void additems(Item i)
    {
    	items.add(i);
    }
    public void getCost()
    {
    	for(Item id:items)
    	{
    		id.itemPrice();
    		
    	}
    	
    }
    public void showitems() {
    	for(Item ite:items)
    	{
    		System.out.print("Item:");ite.itemName();
    		System.out.print(" Packing: ");ite.getPacking();
    		System.out.println(" Price: "+ite.itemPrice());
    	}
    }
}
