package com.example.SpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class BasicController {

    @Autowired
    ApiComponent apiComponent;

    @GetMapping("/test")
    public Response getAll() throws IOException {
        return  apiComponent.getAll();
    }

}
