package pl.spring.demo.desktop.dataProvider.Impl;

import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import javafx.collections.ObservableList;
import pl.spring.demo.desktop.App;
import pl.spring.demo.desktop.beans.*;
import pl.spring.demo.desktop.dataProvider.DataProvider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.spring.demo.to.BookTo;

public class DataProviderImpl implements DataProvider {

	@Override
	public  void findAllBooks() {

        BookClient clientBook = (BookClient) App.getContext().getBean("bookClient");
List<BookTo> books= clientBook.list();
System.out.println(books.get(0).getTitle());


	}

}
