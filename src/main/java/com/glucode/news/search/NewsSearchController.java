package com.glucode.news.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
public class NewsSearchController {

    private final NewsSearchService searchService;

    @Autowired
    public NewsSearchController(NewsSearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public String get() {
        return searchService.getSuccessResponse();
    }

    @PostMapping
    public String post() {
        return searchService.getSuccessResponse();
    }

}
