package org.studi.restaurantreservation.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiRegistration.REST_API + ApiRegistration.REST_CLIENT)
public class ClientWs {

    //ceci est 1 porte d'entrée ds l'app
    @GetMapping
    public String hello() {
        return "Hello World";
    }


}
