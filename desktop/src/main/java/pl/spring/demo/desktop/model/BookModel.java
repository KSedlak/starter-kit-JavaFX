package pl.spring.demo.desktop.model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.spring.demo.to.AuthorTo;
import javafx.beans.property.SetProperty;

public class BookModel {

    private final StringProperty title;
    private final SetProperty<AuthorTo> authors;



    public BookModel(String title) {
        this.title= new SimpleStringProperty(title);
        authors=null;

    }


	public StringProperty getTitle() {
		return title;
	}


	public SetProperty<AuthorTo> getAuthors() {
		return authors;
	}

}