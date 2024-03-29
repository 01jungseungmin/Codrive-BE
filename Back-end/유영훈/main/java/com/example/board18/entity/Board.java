package com.example.board18.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 데이터 저장용 entity (틀)
@Entity
@Data
public class Board {

    // 아이디 데이터베이스(id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 제목 데이터베이스(title)
    private String title;

    // 내용 데이터베이스(content)
    private String content;

    // 작성일자 데이터베이스(day)
    private String day;

    // 언어태그 데이터베이스(tag)
    private String tag = "test";

    // 작성자 데이터베이스(user)
    private String user = "user";

    private String filename;

    private String filepath;
}
