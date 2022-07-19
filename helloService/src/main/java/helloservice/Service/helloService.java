package helloservice.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class helloService {

    public String getName() {
        RestTemplate restTemplate = new RestTemplate();
        String nameUrl = "http://name:8081/name";
        return restTemplate.getForObject(nameUrl, String.class);
    }
}
