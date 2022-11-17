package com.board.springbootmustachenew.controller;

import com.board.springbootmustachenew.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    //1. 매개변수가 없는 GET 메서드 구현
    //http:localhost:8080/api/v1/get-api/name
    @GetMapping("/name")
    public String getHello() {
        return "Hello World";
    }

    //2. @PathVariable 활용한 GET 메서드 구현
    //http:localhost:8080/api/v1/get-api/variable1/{String값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable(value="variable") String variable) {
        return variable; //매개변수와 명칭 같아야 함 (String variable)
    }

    //3. @RequestParam 활용한 GET 메서드 구현
    //http:localhost:8080/api/v1/get-api/request1?name=value1&email=value2&organization=value3
    @GetMapping(value="request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    //4. @RequestParam()-2. Map(key-value) 조합. 값에 상관없이 요청을 받을 수 있다
    //http:localhost:8080/api/v1/get-api/request1?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    //5.DTO 객체를 활용한 GET 메서드 구현
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto) {
        //return memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
        return memberDto.toString();
    }
}
