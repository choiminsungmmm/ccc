package com.spring.basic.repository;

import com.spring.basic.dto.TodoCreateResponseDto;
import com.spring.basic.entity.Memo;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
//@Repository란?
// * Annotation @Repository는 @Component와 같다, Spring Bean으로 등록한다는 뜻.
// * Spring Bean으로 등록되면 다른 클래스에서 주입하여 사용할 수 있다.
// * 명시적으로 Repository Layer 라는것을 나타낸다.
// * DB와 상호작용하여 데이터를 CRUD하는 작업을 수행한다.
public class TodoRepository {

    /**
     * 속성
     */
        private final JdbcTemplate jdbcTemplate;
    /**
     * 생성자
     */
        public TodoRepository(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
        }
    /**
     * 기능
     */
    public TodoCreateResponseDto saveTodo(Memo memo) {


        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("memo").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();

        parameters.put("todo", memo.getTodo());
        parameters.put("name", memo.getName());
        parameters.put("pw", memo.getPw());
        parameters.put("date", memo.getDate());
        parameters.put("updated", memo.getUpdated());

        // 저장 후 생성된 key값을 Number 타입으로 반환하는 메서드
        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));

        TodoCreateResponseDto todoCreateResponseDto = new TodoCreateResponseDto(key.longValue(), memo.getTodo(), memo.getName(), memo.getDate(),memo.getUpdated());
        return todoCreateResponseDto;
        // 일정 조회 데이터 접근 로직 메서드
    }
}
