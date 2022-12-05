package application;
import java.util.Scanner;  // Import the Scanner class
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Dinner Time!");
		
		
		
		Label title = new Label("Dinner Time");
		
		//create button bar with options
		ToggleButton cookTime = new ToggleButton("Time.");
		cookTime.setPrefSize(60, 40);
		ToggleButton ingredients = new ToggleButton("Ingredients");
		ingredients.setPrefSize(90, 40);
		ToggleButton search = new ToggleButton("Search");
		search.setPrefSize(60, 40);
		ToggleButton help = new ToggleButton("Help");
		help.setPrefSize(60, 40);
		//add buttons to their own group
		ToggleGroup buttonGroup = new ToggleGroup();
		cookTime.setToggleGroup(buttonGroup);
		ingredients.setToggleGroup(buttonGroup);
		search.setToggleGroup(buttonGroup);
		help.setToggleGroup(buttonGroup);
		
		//create button bar
		ButtonBar buttonBar = new ButtonBar();
		ButtonBar.setButtonData(cookTime, ButtonData.APPLY);
		ButtonBar.setButtonData(ingredients, ButtonData.APPLY);
		ButtonBar.setButtonData(search, ButtonData.APPLY);
		ButtonBar.setButtonData(help, ButtonData.APPLY);
		buttonBar.getButtons().addAll(cookTime, ingredients, search, help);
		
		HBox box = new HBox(5);
		box.setPadding(new Insets(50,200,50,150));
		box.getChildren().addAll(buttonBar);
		box.setStyle("-fx-background-color: BEIGE");
		
		Scene scene = new Scene(box, 600, 300);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		String userChoice = scan.nextLine();  // Read user input
	}
}
