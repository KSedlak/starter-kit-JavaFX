package pl.spring.demo.desktop.model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SetProperty;

public class BookModel {

    private final StringProperty title;
    private final SetProperty<AuthorModel> authors;



    public BookModel(String title) {
        this.title= new SimpleStringProperty(title);
        authors=null;

    }


	public StringProperty getTitle() {
		return title;
	}


	public SetProperty<AuthorModel> getAuthors() {
		return authors;
	}

}