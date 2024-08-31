package com.glucode.news.search;

import com.glucode.news.NewsApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsSearchService {

    private final NewsApplicationConfiguration configuration;

    @Autowired
    public NewsSearchService(NewsApplicationConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getSuccessResponse() {
        return this.configuration.successResponse();
    }

}
