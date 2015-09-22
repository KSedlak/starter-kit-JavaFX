package pl.spring.demo.dataProvider.Rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import pl.spring.demo.model.BookModel;

import java.io.IOException;
import java.util.Collections;

@Configuration
public class AppConfiguration {
    @Bean
    BookModel bookModel() throws IOException {
            BookModel bookModel= new BookModel();
            bookModel.setRestTemplate(restTemplate());
            bookModel.loadData();
        return bookModel;
    }

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("bean created");
        restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(new MappingJackson2HttpMessageConverter()));
        return restTemplate;
    }
}