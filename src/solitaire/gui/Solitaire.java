package solitaire.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Solitaire extends Application{
	
	private static final int WIDTH = 680;
	private static final int HEIGHT = 500;
	private static final String  TITLE = "Solitaire";
	private static final String VERSION = "2.0";
	private DeckView deckView = new DeckView();
	private WasteView wasteView = new WasteView();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(TITLE + " " + VERSION);
		
		GridPane root = new GridPane();
		root.setStyle("-fx-background-color: green;");
		
		root.add(deckView, 0, 0);
		root.add(wasteView, 1, 0);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
		primaryStage.show();
	}

	
	
	
	
	
	
	
	
	
}
