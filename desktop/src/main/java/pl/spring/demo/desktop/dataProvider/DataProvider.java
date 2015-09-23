package pl.spring.demo.desktop.dataProvider;


import java.util.List;

import pl.spring.demo.desktop.dataProvider.Impl.DataProviderImpl;
import pl.spring.demo.to.AuthorTo;
import pl.spring.demo.to.BookTo;

public interface DataProvider {


	DataProvider INSTANCE = new DataProviderImpl();


	List<BookTo> findAllBooks();
	List<AuthorTo> findAllAuthors();
}