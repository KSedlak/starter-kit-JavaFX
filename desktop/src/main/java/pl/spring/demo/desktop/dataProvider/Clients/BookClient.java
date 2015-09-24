package pl.spring.demo.desktop.dataProvider.Clients;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.spring.demo.to.BookTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookClient {

	@Value("${server.bookServer}")
    private String SERVER;;

    @Autowired
    private RestTemplate restTemplate;

    public List<BookTo> list() {

        String url = SERVER + "/books-by-title";
        BookTo[] books =  restTemplate.getForObject(url, BookTo[].class);
        return Arrays.asList(books);
    }



    public BookTo saveBook(BookTo book){

        String url = SERVER + "/book";
    	BookTo returned;
    	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
    	messageConverters.add(new MappingJackson2HttpMessageConverter());
    	restTemplate.setMessageConverters(messageConverters);
    	returned = restTemplate.postForObject(url,book, BookTo.class);
    	return returned;
    }

}