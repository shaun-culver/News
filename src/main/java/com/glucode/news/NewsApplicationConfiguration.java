package com.glucode.news;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewsApplicationConfiguration {

    @Bean
    public String successResponse() {
        return "Success";
    }

}
