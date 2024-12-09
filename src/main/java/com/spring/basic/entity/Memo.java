package com.spring.basic.entity;

import com.spring.basic.dto.TodoCreateRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Memo {

    private Long id;
    private String todo;
    private String name;
    private String pw;
    private LocalDateTime date;
    private LocalDateTime updated;


    public Memo(String todo, String name, String pw,LocalDateTime date,LocalDateTime updateDate){


        this.todo = todo;
        this.name =name;
        this.pw = pw;
        this.date =date;
        this.updated = updateDate;

    }

    public void update(TodoCreateRequestDto dto){
        this.todo = dto.getTodo();
        this.name = dto.getName();
    }



}
