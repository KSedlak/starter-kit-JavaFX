package pl.spring.demo.desktop.dataProvider.Clients;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import pl.spring.demo.to.BookTo;

import java.util.Arrays;
import java.util.List;

@Component
public class BookClient {

    private static final String SERVER = "http://localhost:9000/rest/books";

    @Autowired
    private RestTemplate restTemplate;

    public List<BookTo> list() {
        String url = SERVER + "/books-by-title";
        BookTo[] books =  restTemplate.getForObject(url, BookTo[].class);
        System.out.println(books.length);
        return Arrays.asList(books);
    }

}