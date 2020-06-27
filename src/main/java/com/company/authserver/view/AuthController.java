package com.company.authserver.view;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Past;

@RestController
//@RequestMapping("/auth1")
public class AuthController {

    @GetMapping(path = "/auth1")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)

    public void auth() {
        System.out.println("Invoked auth!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @GetMapping(path = "/auth2")
    @ResponseStatus(HttpStatus.OK)
    public void auth2() {
        System.out.println("Invoked auth2!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
