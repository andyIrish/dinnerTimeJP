import java.util.Scanner;  // Import the Scanner class
package groupProject;
public class ReceipeList {

	//It's the main that creates a array List 
	public static void main(String[] args) { 
		ArrayListFunctions chickenFriedSteak = new ArrayListFunctions();
		ArrayListFunctions chickenFriedSteakMain = new ArrayListFunctions();
		ArrayListFunctions chickenFriedSteakTime = new ArrayListFunctions();
		ArrayListFunctions chickenFriedSteakServings = new ArrayListFunctions();
		
		ArrayListFunctions TacoSalad = new ArrayListFunctions();
		ArrayListFunctions TacoSaladMain = new ArrayListFunctions();
		ArrayListFunctions TacoSaladTime = new ArrayListFunctions();
		ArrayListFunctions TacoSaladServings = new ArrayListFunctions();
		
		ArrayListFunctions Ramen = new ArrayListFunctions();
		ArrayListFunctions RamenMain = new ArrayListFunctions();
		ArrayListFunctions RamenTime = new ArrayListFunctions();
		ArrayListFunctions RamenServings = new ArrayListFunctions();
		 
		//chickenFriedSteak.appendElement("Chicken Fried Steak: 1 1/2 cups milk, 2 Eggs, 2 cups flour, 2 teaspoons seasoned salt, black pepper, 3/4 teaspoon paprika, 1/4 teaspoon cayenne pepper, 3 pounds cube steak, kosher salt, 1/2 cup of vegetable oil, 1 tablespoon butter ");
		chickenFriedSteak.appendElement("Chicken Fried Steak: ");
		chickenFriedSteak.appendElement("2 Eggs ");
		chickenFriedSteak.appendElement("2 cups flour ");
		chickenFriedSteak.appendElement("2 teaspoons seasoned salt ");
		chickenFriedSteak.appendElement("black pepper ");
		chickenFriedSteak.appendElement("3/4 teaspoon paprika ");
		chickenFriedSteak.appendElement("1/4 teaspoon cayenne pepper ");
		chickenFriedSteak.appendElement("3 pounds cube steak ");
		chickenFriedSteak.appendElement("kosher salt ");
		chickenFriedSteak.appendElement("1/2 cup of vegetable oil ");
		chickenFriedSteak.appendElement("1 tablespoon butter ");
		
		chickenFriedSteakTime.appendElement("60 mins ");
		
		chickenFriedSteakServings.appendElement("6 servings ");
		
		chickenFriedSteakMain.appendElement("Chicken ");
		
		chickenFriedSteak.printArray();
		
		//Ramen.appendElement("Chicken Ramen: 2 boneless chicken breast, salt and pepper to season, 1 tablespoon unsalted butter, 2 teaspoon vegetable oil, 2 teaspoon fresh ginger, 1 tablespoon fresh garlic, 3 teaspoon soy sauce, 2 tablespoon mirin, 4 cups rich chicken stock, 1 oz dried shitake mushrooms, 1-2 sea salt, 2 eggs, 1/2 scallions, 6oz dried ramen noodles  ");
		Ramen.appendElement("Ramen: ");
		Ramen.appendElement("2 boneless chicken breast ");
		Ramen.appendElement("salt and pepper to season ");
		Ramen.appendElement("1 tablespoon unsalted butter ");
		Ramen.appendElement("2 teaspoon vegetable oil ");
		Ramen.appendElement("2 teaspoon fresh ginger ");
		Ramen.appendElement("1 tablespoon fresh garlic ");
		Ramen.appendElement("3 teaspoon soy sauce ");
		Ramen.appendElement("2 tablespoon mirin ");
		Ramen.appendElement("4 cups rich chicken stock ");
		Ramen.appendElement("1 oz dried shitake mushrooms ");
		Ramen.appendElement("1-2 sea salt ");
		Ramen.appendElement("1/2 scallions ");
		Ramen.appendElement("2 eggs ");
		Ramen.appendElement("6oz dried ramen noodles ");
		
		RamenServings.appendElement("2 servings ");
		RamenTime.appendElement("60 minutes ");
		RamenMain.appendElement("Chicken ");
		Ramen.printArray();
		
		
		//TacoSalad.appendElement("Taco Salad: 1oz taco seasoning packet, Salsa, Sour cream, 1 avocade, 1/8 teaspoon salt, 1 teaspoon line juice, 1 tablespoon ovile oil, 1lb ground beef, 3 tablespoons cilantro, 1 head of lettuce, 2 roma tomatoes, 2 jalapeno peppers, 1 cup black beans, 1 cup corn, 1/4 cup black olives, 1/3 cup red onion, 1 1/2 cups shredded cheese  ");
		TacoSalad.appendElement("Taco Salad: ");
		TacoSalad.appendElement("1oz taco seasoning packet ");
		TacoSalad.appendElement("Salsa ");
		TacoSalad.appendElement("Sour cream ");
		TacoSalad.appendElement("1 avocade ");
		TacoSalad.appendElement("1/8 teaspoon salt ");
		TacoSalad.appendElement("1 teaspoon line juice ");
		TacoSalad.appendElement("1 tablespoon ovile oil ");
		TacoSalad.appendElement("1lb ground beef ");
		TacoSalad.appendElement("3 tablespoons cilantro ");
		TacoSalad.appendElement("1 head of lettuce ");
		TacoSalad.appendElement("2 roma tomatoes ");
		TacoSalad.appendElement("2 jalapeno peppers ");
		TacoSalad.appendElement("1 cup black beans ");
		TacoSalad.appendElement("1 cup corn ");
		TacoSalad.appendElement("1/4 cup black olives ");
		TacoSalad.appendElement("1/3 cup red onion ");
		TacoSalad.appendElement("1 1/2 cups shredded cheese ");
		
		TacoSaladTime.appendElement("30 mins ");
		TacoSaladServings.appendElement("4 servings ");
		TacoSaladMain.appendElement("Beef ");
		TacoSalad.printArray();
		
		
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		String userChoice = scan.nextLine();  // Read user input
		
		
		//  if (RamenTime == "60");
		//	Ramen.printArray;
		// if (userNext().TacoSaladTime == "30"
		// 	TacoSaladTime.printArray;
		
		
	}

}


