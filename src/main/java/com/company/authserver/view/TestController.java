package com.company.authserver.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/test")
    public void test() {
        System.out.println("Tet endpoint");
    }

}
