package com.glucode.news.search;

import com.glucode.news.search.api.SearchApi;
import com.glucode.news.search.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsSearchController implements SearchApi {

    private final NewsSearchService searchService;

    @Autowired
    public NewsSearchController(NewsSearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public ResponseEntity<String> searchGet() {
        return ResponseEntity.ok(searchService.getSuccessResponse());
    }

    @Override
    public ResponseEntity<String> searchPost(@RequestBody Message message) {
        return ResponseEntity.ok(message.getMessage());
    }

}