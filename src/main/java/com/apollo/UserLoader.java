package com.apollo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    private Logger log = Logger.getLogger(UserLoader.class);

    @Autowired
    public void setUserRepository(UserRepository productRepository) {
        this.userRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        List<String> names = Arrays.asList("frank", "tony", "andy");
        for(String s: names) {
            userRepository.save(new User(s,"password"));
        }

        for (User u: userRepository.findAll()) {
            System.out.println(u.getName());
        }

        log.info("Completed data loading");
    }
}