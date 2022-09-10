package by.k19.eduui.service;

import by.k19.eduui.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public Collection<User> getUsers() {
        String url = "http://localhost:8081/users";
        return Arrays.asList(Objects.requireNonNull(this.restTemplate.getForObject(url, User[].class)));
    }
}
