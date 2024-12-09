package com.spring.basic.dto;

import lombok.Getter;

import java.time.LocalDateTime;

public class TodoCreateRequestDto {

    /**
     * 속성
     */
    private String todo;
    private String name;
    private String pw;
    private LocalDateTime date;

    /**
     * 생성자
     * @param todo
     * @param name
     * @param pw
     * @param date
     */
    public TodoCreateRequestDto(String todo, String name, String pw, LocalDateTime date){
        this.todo = todo;
        this.name = name;
        this.pw = pw;
        this.date = date;
    }

    /**
     * 기능
     * @return
     */
    public String getTodo(){
        return todo;
    }
    public String getName(){
        return name;
    }
    public String getPw(){
        return pw;
    }
    public LocalDateTime getDate(){
        return date;
    }











}
