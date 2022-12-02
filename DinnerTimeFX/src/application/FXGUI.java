package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class FXGUI extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Dinner Time!");
		Group group = new Group();
		StackPane stack = new StackPane();
		Scene scene = new Scene(group, 600, 300);
		
		scene.setFill(Color.BROWN);
		Label title = new Label("Dinner Time");
		
		
		stack.getChildren().add(title);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
