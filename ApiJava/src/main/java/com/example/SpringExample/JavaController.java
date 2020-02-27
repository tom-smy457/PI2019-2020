package com.example.SpringExample;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JavaController {
    private Quatation quatations;

    public JavaController() {
        this.quatations = new Quatation("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Jonasz Jaki", "JAVA");
    }

    @GetMapping("/all")
    public Quatation getAll() {
        return quatations;
    }

}
