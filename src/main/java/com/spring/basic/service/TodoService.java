package com.spring.basic.service;

import com.spring.basic.dto.TodoCreateRequestDto;
import com.spring.basic.dto.TodoCreateResponseDto;
import com.spring.basic.dto.TodoFindResponseDto;
import com.spring.basic.entity.Memo;
import com.spring.basic.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
//@Service란?
//* Annotation @Service는 @Component와 같다, Spring Bean으로 등록한다는 뜻.
// * Spring Bean으로 등록되면 다른 클래스에서 주입하여 사용할 수 있다.
// * 명시적으로 Service Layer 라는것을 나타낸다.
// * 비지니스 로직을 수행한다.
public class TodoService {

    /**
     * 속성
     */
    private final TodoRepository todoRepository;

    /**
     * 생성자
     *
     * @param todoRepository
     */
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    /**
     * 기능
     *
     * @return
     */
    //일정 생성 서비스
    public TodoCreateResponseDto createTodoService(TodoCreateRequestDto dto) {
        //비즈니스 로직
        String todo = dto.getTodo();
        String name = dto.getName();
        String pw = dto.getPw();
        LocalDateTime date = dto.getDate();

        Memo memo = new Memo(todo, name, pw, date, date);
        return todoRepository.saveTodo(memo);
    }

    public TodoFindResponseDto findTodoById(Long id, String updateDate, String name) {

        // updateDate가 있을때
//        if (updateDate ) {
//        findTodoById(updateDate);
//        } else if (name) {
//            findTodoById(name);
//        } else if (updateDate && name) {
//            findTodoById(updateDate,name);
//        } else if (!updateDate && !name){
//            findTodoById(id);
//        }
        // name이 있을때
        
        // 둘 다 있을때

        // 둘 다 없을때



        return null;
    }

//    public TodoCreateResponseDto createTodoService(TodoCreateRequestDto requestDto) {
//    }
}