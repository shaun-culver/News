package com.glucode.news;

import com.glucode.news.search.NewsSearchController;
import com.glucode.news.search.NewsSearchService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(NewsSearchController.class)
public class NewsSearchControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NewsSearchService searchService;

    @BeforeEach
    public void setUp() {
        when(searchService.getSuccessResponse()).thenReturn("Success");
    }

    @Test
    public void testGetEndpointReturnsSuccess() throws Exception {
        this.mockMvc.perform(get("/api/search"))
                .andExpect(status().isOk())
                .andExpect(content().string("Success"));
    }

    @Test
    public void testPostEndpointReturnsSuccess() throws Exception {
        this.mockMvc.perform(post("/api/search"))
                .andExpect(status().isOk())
                .andExpect(content().string("Success"));
    }

}
