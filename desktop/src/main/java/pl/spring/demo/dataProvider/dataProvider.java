package pl.spring.demo.dataProvider;

import java.util.ArrayList;
import java.util.List;

import pl.spring.demo.service.BookService;
import pl.spring.demo.service.impl.BookServiceImpl;
import pl.spring.demo.to.AuthorTo;
import pl.spring.demo.to.BookTo;

public class dataProvider {
	public dataProvider() {
		// TODO Auto-generated constructor stub
	}
	BookService bookService = new BookServiceImpl();

	List<BookTo> listOfBooks;
	List<AuthorTo> listOfauthors;

	public void setListOfBooks(List<BookTo> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	public List<AuthorTo> getListOfauthors() {
		return listOfauthors;
	}
	public void setListOfauthors(List<AuthorTo> listOfauthors) {
		this.listOfauthors = listOfauthors;
	}



}
