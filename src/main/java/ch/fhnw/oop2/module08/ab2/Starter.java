package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		PresentationModel pm = new PresentationModel();

		Scene scene = new Scene(new ApplicationUI(pm));
		primaryStage.setResizable(false);
		primaryStage.titleProperty().bind(pm.getTitleProperty());
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.show();
	}

}
