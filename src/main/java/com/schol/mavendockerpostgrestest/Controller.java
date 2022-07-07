package com.schol.mavendockerpostgrestest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class Controller {
        @GetMapping(value = "/")
        @ResponseStatus(HttpStatus.OK)
        public String findById() {
            return "asd";
        }

}
