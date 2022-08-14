package com.study.join.service;

import com.study.join.entity.Join;
import com.study.join.repository.JoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private JoinRepository joinRepository;

    public void write(Join join){

        joinRepository.save(join);
    }
}
