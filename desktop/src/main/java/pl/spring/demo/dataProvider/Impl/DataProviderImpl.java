package pl.spring.demo.dataProvider.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import javafx.collections.ObservableList;
import pl.spring.demo.dataProvider.DataProvider;
import pl.spring.demo.model.BookModel;
import pl.spring.demo.to.BookTo;

public class DataProviderImpl implements DataProvider {
	@Autowired
	BookModel bookModel;
	@Override
	public  void findAllBooks() {

		RestTemplate rest = new RestTemplate();
		String response;

		response = rest.getForObject("http://www.google.com", String.class);
		System.out.println(response);
	}

}
