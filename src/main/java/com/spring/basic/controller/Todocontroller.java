package com.spring.basic.controller;

import com.spring.basic.dto.TodoCreateRequestDto;
import com.spring.basic.dto.TodoCreateResponseDto;
import com.spring.basic.dto.TodoFindResponseDto;
import com.spring.basic.service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController       //@RestController   // @Controller + @ResponseBody
@RequestMapping("/todos")     // prefix 공통적으로 저장될 URL "todo" 라는 url 사용
public class Todocontroller {

    //- Controller의 역할
    //    1. 클라이언트의 **요청**을 받는 역할을 수행한다.
    //    2. 요청에 대한 처리를 Service Layer에 전달한다.
    //    3. Service에서 처리 완료된 결과를 클라이언트에 응답한다.
    //요청, 응답을 제외한 모두를 Controller에서 분리 해야한다.

    /**
     * 속성
     */
    private final TodoService todoService;

    /**
     * 생성자
     *
     * @param todoService
     */
    public Todocontroller(TodoService todoService) {          //service에 의존성을 주입하기 위해서
        this.todoService = todoService;
    }

    /**
     * 기능
     *
     * @return
     */

    //일정 생성 API
    @PostMapping
    public TodoCreateResponseDto createTodoAPI(@RequestBody TodoCreateRequestDto requestDto) {
        System.out.println("투두 생성 API");

        return todoService.createTodoService(requestDto);


    }

    //일정 조회 API

    @GetMapping("/{id})") // http://localhost:8080/id/1?updateDate=2024-12-08&name=tom
    public TodoFindResponseDto findTodo(@PathVariable Long id, @RequestParam(name = "updateDate") String updateDate, @RequestParam(name = "name") String name) {
        System.out.println("투두 조회 API");


        return todoService.findTodoById(id, updateDate, name);

    }
        // 선택 일정 조회 API
        @GetMapping("/{id}")

        public TodoCreateResponseDto findTodoById (@PathVariable Long Id){

            System.out.println("투투 선택 조회 API");

        return null; //todoService.findTOdoById();

    }
    //선택한 일정 수정 API

    @PutMapping("/{todo}")

    public TodoCreateResponseDto updateTodo(@PathVariable String todo, String name){

        System.out.println(" 투두 선택한 일정 수정 API");

        return null; // todoService.updateTOdo();
    }






}