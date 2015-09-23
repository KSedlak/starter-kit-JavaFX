package pl.spring.demo.desktop.dataProvider.Impl;

import java.util.List;


import pl.spring.demo.desktop.App;
import pl.spring.demo.desktop.dataProvider.DataProvider;
import pl.spring.demo.desktop.dataProvider.Clients.AuthorClient;
import pl.spring.demo.desktop.dataProvider.Clients.BookClient;
import pl.spring.demo.to.AuthorTo;
import pl.spring.demo.to.BookTo;

public class DataProviderImpl implements DataProvider {

	  BookClient clientBook = (BookClient) App.getContext().getBean("bookClient");
	  AuthorClient clientAuthor = (AuthorClient) App.getContext().getBean("authorClient");

	@Override
	public  List<BookTo> findAllBooks() {
			return clientBook.list();
	}
	@Override
	public List<AuthorTo> findAllAuthors() {
		return clientAuthor.list();
	}

}
