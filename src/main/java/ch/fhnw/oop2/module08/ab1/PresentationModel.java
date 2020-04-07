package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty buttonProperty = new SimpleStringProperty();
	private StringProperty titleProperty = new SimpleStringProperty();

	public PresentationModel() {
		buttonProperty.setValue("Hello button");
		titleProperty.setValue("Hello title");
	}

	public StringProperty getButtonProperty() {
		return buttonProperty;
	}

	public StringProperty getTitleProperty() {
		return titleProperty;
	}

}
