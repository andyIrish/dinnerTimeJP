package application;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;


public class Main extends Application {
	static int userTime = 0;
	static ArrayList<String> userList = new ArrayList<String>();
	static ArrayListFunctions recipes = new ArrayListFunctions();
	
	
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
	
		Scene scene = new Scene(box, 600, 300);
		
		primaryStage.setScene(scene);
		//add label for time
		primaryStage.show();
		

		//shows time dialog box when pressed
		cookTime.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				timeBox.showAndWait();
				
				
				userTime = Integer.parseInt(timeBox.getEditor().getText());
			}
		});
		//brings up dialog box to insert ingredients
		ingredients.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				foodBox.showAndWait();
				userList.add(foodBox.getEditor().getText());
				
				
				
			}
		});
		search.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				recipes.findElementByTime(userTime);
				
				
				
				
			}
		});
		
	
		
	
		
	}
	public static void main(String[] args) {
		String[] testList = { "Milk", "Steak", "Jelly Beans"};
		String[] testList2 = { "oatmeal", "water"};
		ReceipeList milkSteak = new ReceipeList("Milk Steak", testList, 10);
		ReceipeList oatMeal = new ReceipeList("Oat Meal", testList2, 3);
		recipes.appendElement(milkSteak);
		recipes.appendElement(oatMeal);
		launch(args);
		
		System.out.println(userTime);
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
		
	}
}
