package pl.spring.demo.model;

import org.springframework.web.client.RestTemplate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.spring.demo.to.BookTo;

public class BookModel {
    private ObservableList<BookTo> Books = FXCollections.observableArrayList();

    public ObservableList<BookTo> getBooks() {
        return Books;
    }

    private RestTemplate restTemplate;

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @SuppressWarnings("unchecked")
    public void loadData() {
        BookTo [] Books = restTemplate.getForObject("http://localhost:8080/work/Books", BookTo[].class);
        this.Books.setAll(Books);
    }


    public void remove(BookTo Book) {
        restTemplate.delete("http://localhost:8080/crm/Book/" + Book.getId());
        Books.remove(Book);
    }

}
