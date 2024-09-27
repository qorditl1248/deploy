package com.study.deploy_back.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${client.address}")
    private String clientAddress; // 나중에 배포되어지는 리액트 주소가 들어옴

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(clientAddress + "테스트");
    }
}
