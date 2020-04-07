package ch.fhnw.oop2.module08.ab2;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	private Button b;
	private PresentationModel pm;

	public ApplicationUI(PresentationModel pm) {
		this.pm = pm;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		b = new Button();
		b.textProperty().bind(pm.getButtonProperty());
	}

	private void layoutControls() {
		b.setOnAction(e -> pm.toggle());
		this.getChildren().addAll(b);
	}
}
