package pl.spring.demo.dataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import pl.spring.demo.dataProvider.Impl.DataProviderImpl;
import pl.spring.demo.service.BookService;
import pl.spring.demo.service.impl.BookServiceImpl;
import pl.spring.demo.to.AuthorTo;
import pl.spring.demo.to.BookTo;

public interface DataProvider {


	DataProvider INSTANCE = new DataProviderImpl();


	void findAllBooks();
}