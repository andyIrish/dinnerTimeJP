package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Dinner Time!");
		
		
		TilePane r = new TilePane();
		Label title = new Label("Dinner Time");
		
		//create button bar with options
		Button cookTime = new Button("Time.");
		cookTime.setPrefSize(60, 40);
		Button ingredients = new Button("Ingredients");
		ingredients.setPrefSize(60, 40);
		Button search = new Button("Search");
		search.setPrefSize(60, 40);
		Button help = new Button("Help");
		help.setPrefSize(60, 40);
		Button exitButton = new Button("Exit");
		exitButton.setPrefSize(60, 40);
		exitButton.setOnAction(actionEvent -> Platform.exit());
		//add buttons to their own group
		Group buttonGroup = new Group();
		buttonGroup.getChildren().add(cookTime);
		buttonGroup.getChildren().add(ingredients);
		buttonGroup.getChildren().add(search);
		buttonGroup.getChildren().add(help);
		buttonGroup.getChildren().add(exitButton);
		
		//create button bar
		ButtonBar buttonBar = new ButtonBar();
		ButtonBar.setButtonData(cookTime, ButtonData.APPLY);
		ButtonBar.setButtonData(ingredients, ButtonData.APPLY);
		ButtonBar.setButtonData(search, ButtonData.APPLY);
		ButtonBar.setButtonData(help, ButtonData.APPLY);
		ButtonBar.setButtonData(exitButton, ButtonData.APPLY);
		buttonBar.getButtons().addAll(cookTime, ingredients, search, help, exitButton);
		
		HBox box = new HBox(5);
		box.setPadding(new Insets(50,100,50,50));
		box.getChildren().addAll(buttonBar);
		box.setStyle("-fx-background-color: GREY");
		//create dialog box for time
		TextInputDialog timeBox = new TextInputDialog();
		timeBox.setHeaderText("Enter time in minutes ");
		//dialog box for ingredients
		TextInputDialog foodBox = new TextInputDialog();
		foodBox.setHeaderText("Enter ingredients one at a time.");
		Label userTime = new Label("no text input");
		
		Scene scene = new Scene(box, 600, 300);
		
		primaryStage.setScene(scene);
		//add label for time
		r.getChildren().add(userTime);
		primaryStage.show();
		

		//shows time dialog box when pressed
		cookTime.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				timeBox.showAndWait();
				
				userTime.setText(timeBox.getEditor().getText());
			}
		});
		//brings up dialog box to insert ingredients
		ingredients.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				foodBox.show();
			}
		});
		
	
		
	
		
	}
	public static void main(String[] args) {
		ArrayListFunctions recipes = new ArrayListFunctions();
		ReceipeList userParameters = new ReceipeList();
		int userTime = 0; 
		String[] testList = { "Milk", "Steak", "Jelly Beans"};
		String[] testList2 = { "oatmeal", "water"};
		String[] testList3 = { "Potatoes", "Lamb Chops", "Seasame Oil" , "Salt and Pepper", "Love"};
		String[] testList4 = { "herring", "pickled eggs","oatmeal""turkey broth", "orange jello", "coffee water", "love"};
		String[] testList5 = { "eggs", "Steak", "chevre", "salt and pepper"};
		String[] testList6 = { "protein powder", "water"};
		
		
		ReceipeList milkSteak = new ReceipeList(testList, userTime);
		ReceipeList oatMeal = new ReceipeList(testList2, 5);
		ReceipeList YummoLambAndTaters = new ReceipeList(testList3, 45);
		ReceipeList PickledHerring = new ReceipeList(testList4, 30);
		ReceipeList Omelet = new ReceipeList(testList4, 15);
		ReceipeList ProteinShake = new ReceipeList(testList5, 5);
		
		
		recipes.appendElement(milkSteak);
		recipes.appendElement(oatMeal);
		//recipes.findElementByTime(3);
		launch(args);
		
		System.out.println(userTime);
	}
}
