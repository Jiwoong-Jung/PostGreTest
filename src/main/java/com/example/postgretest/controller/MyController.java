package com.example.postgretest.controller;

import com.example.postgretest.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin("*")
public class MyController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/ins")
    public String insert(@RequestParam String str) {
        log.info("------------------------>{}",str);
        return str;
    }
}
