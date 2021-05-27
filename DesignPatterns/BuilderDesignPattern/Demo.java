package BuilderDesignPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
      VegMealBuilder vm =new VegMealBuilder();
      System.out.println("Veg-Meal");
  //    director.construct(vm);
      Meal meal = vm.getMeal();
       meal.showitems();
       System.out.println("Total Price:"+(new VegBurger().price + new Coke().price));
      
       System.out.println("");
       NonVegMealBuilder nonveg = new NonVegMealBuilder();
       System.out.println("Non-VegMeal");
       Meal meal1 = nonveg.getMeal();
       meal1.showitems();
       System.out.println("Total Price:"+(new ChickenBurger().price + new Pepsi().price));
	}

}
