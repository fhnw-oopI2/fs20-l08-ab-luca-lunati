package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty buttonProperty = new SimpleStringProperty();
	private StringProperty titleProperty = new SimpleStringProperty();

	public PresentationModel() {
		setButtonProperty(Toggle.ON);
		setTitleProperty("Toggle");
	}

	public StringProperty getButtonProperty() {
		return buttonProperty;
	}

	public StringProperty getTitleProperty() {
		return titleProperty;
	}

	public void setButtonProperty(Toggle buttonProperty) {
		this.buttonProperty.setValue(buttonProperty.toString());
	}

	public void setTitleProperty(String titleProperty) {
		this.titleProperty.setValue(titleProperty);
	}

	public void toggle() {
		setButtonProperty(Toggle.valueOf(getButtonProperty().getValue()).inverse());
	}

	public enum Toggle {
		ON, OFF;
		public Toggle inverse() {
			if (this.equals(ON)) {
				return OFF;
			}
			return ON;
		}
	}
}
