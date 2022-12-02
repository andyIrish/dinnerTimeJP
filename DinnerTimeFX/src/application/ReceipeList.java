package application;



public class ReceipeList {
	//variables
	public String[] ingredients;
	public int time;
	
	
	
	ReceipeList() {
		String[] ingredients = {""};
		time = 0;
	}
	//constructor
	ReceipeList(String[] ingredients, int preptime) {
		this.ingredients = ingredients;
		time = preptime;
	}
	
	//setters and getters
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime() {
		return time;
	}
	public void setIngredients(String[] food) {
		ingredients = food;
	}
	public String[] getIngredients() {
		return ingredients;
	}

	//prints ingredients
	public void printIngredients() {
		for (int i = 0; i < ingredients.length; i++ ) {
			System.out.println(ingredients[i]);
		}
	}

	//It's the main that creates a array List 
	//public static void main(String[] args) {
		//60 mins to make 6 servings 
		//ArrayListFunctions chickenFriedSteak = new ArrayListFunctions();
		//30 mins to make 4 servings 
		//ArrayListFunctions TacoSalad = new ArrayListFunctions();
		//60 mins to make 2 servings 
		//ArrayListFunctions Ramen = new ArrayListFunctions();
		
		//chickenFriedSteak.appendElement("Chicken Fried Steak: 1 1/2 cups milk, 2 Eggs, 2 cups flour, 2 teaspoons seasoned salt, black pepper, 3/4 teaspoon paprika, 1/4 teaspoon cayenne pepper, 3 pounds cube steak, kosher salt, 1/2 cup of vegetable oil, 1 tablespoon butter ");
		//chickenFriedSteak.printArray();
		//Ramen.appendElement("Chicken Ramen: 2 boneless chicken breast, salt and pepper to season, 1 tablespoon unsalted butter, 2 teaspoon vegetable oil, 2 teaspoon fresh ginger, 1 tablespoon fresh garlic, 3 teaspoon soy sauce, 2 tablespoon mirin, 4 cups rich chicken stock, 1 oz dried shitake mushrooms, 1-2 sea salt, 2 eggs, 1/2 scallions, 6oz dried ramen noodles  ");
		//Ramen.printArray();
		//TacoSalad.appendElement("Taco Salad: 1oz taco seasoning packet, Salsa, Sour cream, 1 avocade, 1/8 teaspoon salt, 1 teaspoon line juice, 1 tablespoon ovile oil, 1lb ground beef, 3 tablespoons cilantro, 1 head of lettuce, 2 roma tomatoes, 2 jalapeno peppers, 1 cup black beans, 1 cup corn, 1/4 cup black olives, 1/3 cup red onion, 1 1/2 cups shredded cheese  ");
		//TacoSalad.printArray();
		
		/*TacoSalad.add("1oz taco seasoning packet ");
		TacoSalad.add("Salsa ");
		TacoSalad.add("Sour cream ");
		TacoSalad.add("1 avocade ");
		TacoSalad.add("1/8 teaspoon salt ");
		TacoSalad.add("1 teaspoon line juice ");
		TacoSalad.add("1 tablespoon ovile oil ");
		TacoSalad.add("1lb ground beef ");
		TacoSalad.add("3 tablespoons cilantro ");
		TacoSalad.add("1 head of lettuce ");
		TacoSalad.add("2 roma tomatoes ");
		TacoSalad.add("2 jalapeno peppers ");
		TacoSalad.add("1 cup black beans ");
		TacoSalad.add("1 cup corn");
		TacoSalad.add("1/4 cup black olives ");
		TacoSalad.add("1/3 cup red onion ");
		TacoSalad.add("1 1/2 cups shredded cheese ");
		System.out.println("Taco salad " + TacoSalad);*/
		

		
		
	//}

}
