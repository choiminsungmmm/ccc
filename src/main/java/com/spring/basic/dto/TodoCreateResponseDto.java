package com.spring.basic.dto;

import java.time.LocalDateTime;

public class TodoCreateResponseDto {

    /**
     * 속성
     */
    private Long id;
    private String todo;
    private String name;
    private LocalDateTime date;
    private LocalDateTime update;

    /**
     * 생성자
     * @param todo
     * @param name
     * @param date
     * @param update
     */
    public TodoCreateResponseDto(Long id, String todo, String name, LocalDateTime date, LocalDateTime update){

        this.id = id;
        this.todo = todo;
        this.name = name;
        this.date = date;
        this.update = update;
    }

    /**
     * 기능
     */
    public Long getId(){return  id;}
    public String getTodo(){
        return todo;
    }
    public String getName(){
        return name;
    }
    public LocalDateTime getDate(){
        return date;
    }
    public LocalDateTime getUpdate(){return update;}



}
