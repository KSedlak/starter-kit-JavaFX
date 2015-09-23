package pl.spring.demo.desktop.model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class AuthorModel {

    private final StringProperty firstName;
    private final StringProperty lastName;


    public  AuthorModel() {
        this(null, null);
    }

    public  AuthorModel(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

    }

	public StringProperty getFirstName() {
		return firstName;
	}

	public StringProperty getLastName() {
		return lastName;
	}

}