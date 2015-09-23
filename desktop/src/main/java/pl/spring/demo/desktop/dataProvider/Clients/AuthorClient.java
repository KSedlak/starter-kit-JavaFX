package pl.spring.demo.desktop.dataProvider.Clients;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import pl.spring.demo.to.AuthorTo;


import java.util.Arrays;
import java.util.List;

@Component
public class AuthorClient {

    private static final String SERVER = "http://localhost:9000/rest/authors";

    @Autowired
    private RestTemplate restTemplate;

    public List<AuthorTo> list() {
        String url = SERVER + "/authors-list";
       AuthorTo[] authors=  restTemplate.getForObject(url, AuthorTo[].class);

        return Arrays.asList(authors);
    }

}