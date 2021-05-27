package BuilderDesignPattern;

public class Director {
  static MealBuilder mybuilder;
  public void construct(MealBuilder builder)
  {
	  mybuilder = builder;
	//  mybuilder.buildBurger();
	//  mybuilder.buildDrink();
	  mybuilder.getMeal();
  }
}
