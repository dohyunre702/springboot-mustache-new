package com.board.springbootmustachenew.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    //1.@PathVariable 사용
    //http:localhost:8080/api/v1/delete-api/{String값}
    @DeleteMapping(value="/{variable}")
    public String DeleteVariable(@PathVariable String variable) {
        return variable;
    }

    //2.@RequestParam 사용
    //http:localhost:8080/api/v1/delete-api/request1?email=value
    @DeleteMapping(value = "request1")
    public String getRequestParam1(@RequestParam String email) {
        return "e-mail :" + email;
    }

}
