package com.techreturners.bookmanager.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class BookManagerControllerTests {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetAllBooks() throws Exception {

        String expectedContent = "view all books endpoint";

        this.mockMvcController.perform(
            MockMvcRequestBuilders.get("/api/book"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }
}
