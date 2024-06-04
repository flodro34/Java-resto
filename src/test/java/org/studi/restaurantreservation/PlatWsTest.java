package org.studi.restaurantreservation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.studi.restaurantreservation.service.PlatService;
import org.studi.restaurantreservation.webservice.PlatWs;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(PlatWs.class)
public class PlatWsTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlatService platService;

    //test de création
    @Test
    public void voidCreatePlatWs() throws Exception {
        mockMvc.perform((RequestBuilder) post("/api/plat")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{" +
                       " \"libelle\": \"tartiflette\"," +
                           " \"description\": \" à base de fromage\","+
                            "\"price\":10"+
                        "}"))
                .andExpect(status().isOk());
    }



}
