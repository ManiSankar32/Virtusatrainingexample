package singletonDesignPattern;

import singletonDesignPattern.Captain.Onecaptain;

class Captain
{
	public String str;
	private Captain(){
	  str = "Trying to select a new captain";
	}
	
	
	public static class Onecaptain{
		 static final Captain INSTANCE = new Captain();

		
	}
	public static Captain getInstance() {
		return Onecaptain.INSTANCE;
	}
	
}
public class SingletonEx {
public static void main(String args[])
{
	//Captain c = new Captain();
	Captain cap = Captain.getInstance();
	System.out.println(cap.str);
	if(cap!=null)
		System.out.println("New Captain Selected for our team");
	Captain str=Captain.getInstance();
	if(str!=null)
		System.out.println("Trying to make a new captain for our team");
	if(cap == str)
	{
		System.out.println("You already have a Captain.send him for the toss");
	    System.out.println("both instances are same");
	}
	System.out.println(cap);
	
}


}
