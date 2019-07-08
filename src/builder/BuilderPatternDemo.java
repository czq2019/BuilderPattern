package builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		
		Meal veMeal=mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		veMeal.showItems();
		System.out.println("Total Cost"+veMeal.getCost());
		
		Meal nonVeMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("\\n\\n Non-Veg Meal");
		nonVeMeal.showItems();
		System.out.println("Total Cost: " +nonVeMeal.getCost());
	}
}
