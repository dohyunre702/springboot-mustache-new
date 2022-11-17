package com.board.springbootmustachenew.controller;

import com.board.springbootmustachenew.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    ///1.RequestBody, Map 활용
    //http:localhost:8080/api/v1/put-api/member
    @PutMapping("/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map-> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    //2.DTO 객체 활용
    //http:localhost:8080/api/v1/put-api/member2
    @PutMapping("/member2")
    public MemberDto postMemberDto2(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    //3.ResponseEntity를 활용한 PUT 메서드 구현
    //http:localhost:8080/api/v1/put-api/member3
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> postMemberDto3(@RequestBody MemberDto memberDto) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }
}
