package com.example.postgretest;

import com.example.postgretest.entity.Member;
import com.example.postgretest.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PostGreTestApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void insertTest() {
        for (int i = 0; i < 10; i++) {
            Member member = Member.builder()
                    .email("user"+i+"@gmail.com")
                    .userid("사용자"+i)
                    .password("1234")
                    .build();

            memberRepository.save(member);
        }
    }

    @Test
    public void selectTest() {
        List<Member> list = memberRepository.findAll();
        for (Member member: list) {
            System.out.println(member);
        }
    }

}
