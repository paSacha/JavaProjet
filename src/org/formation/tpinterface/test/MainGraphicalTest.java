package org.formation.tpinterface.test;

import org.formation.tpinterface.Circle;

import com.sun.glass.ui.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainGraphicalTest extends javafx.application.Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Circle circle = new Circle(100.0);
		circle.printMe("Bonjour");
		Pane pane = new Pane();
		pane.getChildren().add(circle.getShape());
		Scene scene = new Scene(pane, 250, 250);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javafx.application.Application.launch(args);
	}

}
