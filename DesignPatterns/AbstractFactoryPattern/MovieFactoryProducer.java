package AbstractFactoryPattern;

public class MovieFactoryProducer {
    public static MovieFactory getFactory(String choice)
    {
    	if(choice.equalsIgnoreCase("TollywoodMovie"))
    	{
    		return new TollywoodFactory();
    	}
    	else if(choice.equalsIgnoreCase("BollywoodMovie"))
    	{
    		return new BollywoodFactory();
    	}
    	return null;
    }
}
