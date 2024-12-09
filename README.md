RED
![image](https://github.com/user-attachments/assets/a09e95e9-bad3-410c-8fbc-825f6462ccaa)

API 명세서
![image](https://github.com/user-attachments/assets/9e91e987-7374-4123-ba60-55e966c89e4d)

SQL (2번 BTS -> 김연아로 바꿨습니다)
use todo;

-- 테이블 생성 (student)
CREATE TABLE student
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '학생 식별자',
    name VARCHAR(100) COMMENT '이름',
    todo  VARCHAR(100) COMMENT '할일' ,
    pw  VARCHAR(100) COMMENT  '비밀번호',
    date DATE COMMENT '날짜'
);

-- student 테이블에 데이터 삽입
INSERT INTO student (name, todo, pw, date) VALUES('최민성', '청소', '1234', '2024.12.06');
INSERT INTO student (name, todo, pw, date) VALUES('BTS', '요리', '1234', '2024.12.07');
INSERT INTO student (name, todo, pw, date) VALUES('봉준호', '오락', '5555', '2024.12.08');
INSERT INTO student (name, todo, pw, date) VALUES('페이커', '영화감상', '2222', '2024.12.09');


-- student 전체 조회
SELECT * FROM student;

![image](https://github.com/user-attachments/assets/38821c07-3b4d-402f-9b49-5c8a3d7e2aef)
