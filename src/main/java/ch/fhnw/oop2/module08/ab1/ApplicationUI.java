package ch.fhnw.oop2.module08.ab1;

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
		this.getChildren().addAll(b);
	}
}
