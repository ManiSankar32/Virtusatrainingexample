package BuilderDesignPattern;

public interface MealBuilder {
  void buildBurger();
  void buildDrink();
  Meal getMeal();
  
}

class VegMealBuilder implements MealBuilder{
    private Meal meal = new Meal();
	@Override
	public void buildBurger() {
		// TODO Auto-generated method stub
		meal.additems(new VegBurger());
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.additems(new Coke());
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		buildBurger();
		buildDrink();
		return meal;
	}
	
}
class NonVegMealBuilder implements MealBuilder{
    private Meal meal = new Meal();
	@Override
	public void buildBurger() {
		// TODO Auto-generated method stub
		meal.additems(new ChickenBurger());
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.additems(new Pepsi());
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		buildBurger();
		buildDrink();
		return meal;
	}
	
}