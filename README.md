- [ ]  **ERD 작성하기**
    - [ ]  ERD는 프로젝트 root(최상위) 경로의 `README.md` 에 첨부
RED
![image](https://github.com/user-attachments/assets/a09e95e9-bad3-410c-8fbc-825f6462ccaa)

### Lv 0. API 명세 및 ERD 작성   `필수`

- [ ]  **API 명세서 작성하기**
    - [ ]  API명세서는 프로젝트 root(최상위) 경로의 `README.md` 에 작성
    - 참고) API 명세서 작성 가이드
        - API 명세서란 API명, 요청 값(파라미터), 반환 값, 인증/인가 방식, 데이터 및 전달 형식 등 API를 정확하게 호출하고 그 결과를 명확하게 해석하는데 필요한 정보들을 일관된 형식으로 기술한 것을 의미합니다.
        - request 및 response는 [json(링크)](https://namu.wiki/w/JSON) 형태로 작성합니다.
        
        [예) [서점] 책 API 설계하기](https://www.notion.so/14d2dc3ef514817bafe6e3b9e0062e82?pvs=21)
        
        > API 명세서 추천 무료 Tool
        > 
        > 
        > [Document your APIs in Postman | Postman Learning Center](https://learning.postman.com/docs/publishing-your-api/api-documentation-overview/)
        >
API 명세서
![image](https://github.com/user-attachments/assets/be173314-a33f-43ca-a707-813d101083f6)

- [ ]  **SQL 작성하기**
    - [ ]  설치한 데이터베이스(Mysql)에 ERD를 따라 테이블을 생성
    - 참고) SQL 작성 가이드
        - 과제 프로그램의 root(최상위) 경로에`schedule.sql` 파일을 만들고, 테이블 생성에 필요한 query를 작성하세요.
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
