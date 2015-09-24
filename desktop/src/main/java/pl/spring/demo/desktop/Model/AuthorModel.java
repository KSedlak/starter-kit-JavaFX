package pl.spring.demo.desktop.model;


import java.util.ArrayList;



import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import pl.spring.demo.to.AuthorTo;


public class AuthorSearchModel {

    private final StringProperty firstName;
    private final StringProperty lastName;
	private final ListProperty<AuthorTo> result = new SimpleListProperty<>(
			FXCollections.observableList(new ArrayList<>()));



    public  AuthorSearchModel() {
        this(null, null);
    }

    public  AuthorSearchModel(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

    }

	public StringProperty getFirstName() {
		return firstName;
	}

	public StringProperty getLastName() {
		return lastName;
	}

	public ListProperty<AuthorTo> getResult() {
		return result;
	}
	public ListProperty<AuthorTo> resultProperty() {
		return result;
	}

	public void setResult(ArrayList<AuthorTo> value) {
		result.setAll(value);

	}
}