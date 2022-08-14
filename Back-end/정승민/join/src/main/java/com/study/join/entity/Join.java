package com.study.join.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity //테이블
@Data
public class Join {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID; //id

    private String userNAME; //이름

    private Integer birthYEAR; //생일

    private String userPW; //비밀번호

    private String userEmail; //이메일
}