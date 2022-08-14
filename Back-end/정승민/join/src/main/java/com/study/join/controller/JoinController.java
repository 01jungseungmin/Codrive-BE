package com.study.join.controller;

import com.study.join.entity.Join;
import com.study.join.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {

    @Autowired
    private JoinService joinService;

    //회원가입 폼
    @GetMapping("/board/join") //localhost:8080/jointable/join=주소
    public String joinForm(){

        return "join";
    }

    //회원가입 진행
    @PostMapping("/board/signUp")
    public String boardsignUp(Join join){

        joinService.write(join);

        return "redirect:/join";
    }
}
