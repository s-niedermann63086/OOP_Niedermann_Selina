package oop_Niedermann_Selina;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

		
		public void start(Stage primaryStage) {
			
			try {
				Parent rootPane = FXMLLoader.load(getClass().getResource("/fxml/Leasing_Berechnung.fxml"));
				
				primaryStage.setTitle("Leasing Berechnungen");
				Scene scene = new Scene(rootPane, 533, 476);
				primaryStage.setScene(scene);
				primaryStage.show();
				
			} catch (IOException e) {
				e.printStackTrace();
			}



		}

		public static void main(String[] args) {
			launch(args);
		}
	}



