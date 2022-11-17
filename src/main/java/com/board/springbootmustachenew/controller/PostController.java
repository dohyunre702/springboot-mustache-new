package com.board.springbootmustachenew.controller;

import com.board.springbootmustachenew.dto.MemberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
//POST: 클라이언트가 서버에 리소스를 저장하는 데 사용한다.
@RestController
@RequestMapping("api/v1/post-api")
public class PostController {

    //1. PostMapping(RequestMapping)
    //http:localhost:8080/api/v1/post-api/domain
    @PostMapping("/domian")
    public String postExample() {
        return "Hello Post API";
    }

    //2. RequestBody. body영역에 직접 값을 입력하여 전송
    //http:localhost:8080/api/v1/post-api/member
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    //3.DTO 객체 활용
    //http:localhost:8080/api/v1/post-api/member2
    @PostMapping("/member2")
    public String postMember(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
