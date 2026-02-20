package ie.atu.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Basic extends Application {
	@Override
	public void start(Stage primaryStage) {
			// Create nodes
			// First choose root node. Starting point of scene graph.
//			StackPane root = new StackPane();
//			HBox root = new HBox();
			GridPane root = new GridPane();
			
			Label labelHello = new Label("Hello Label");
			labelHello.setTextFill(Color.RED);
			Button buttonHello = new Button("Say Hello Button");
			
			// Add event to button
//			buttonHello.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					labelHello.setText("Goodbye");
//				}
//			});
//			buttonHello.setOnAction(event -> System.out.println("Hello!"));
//			buttonHello.setOnAction(event -> labelHello.setText("Goodbye"));
			buttonHello.setOnAction(event -> {
				if (labelHello.getText().equals("Hello Label")) {
					labelHello.setText("Goodbye");
				} else {
					labelHello.setText("Hello Label");
				}	
			});
			// Add child node to root node
//			root.getChildren().add(buttonHello);
//			root.getChildren().add(labelHello);
			root.add(buttonHello,1,0);
			root.add(labelHello,0,0);
			
			// Create Scene and set it then show Stage
//			Scene scene = new Scene(root);
			Scene scene = new Scene(root, 300, 300);
			primaryStage.setTitle("This is the primary stage title!");
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	} // End Main
	
} // End Class
