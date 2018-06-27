# Agenda
* 사전준비
* 과제

## 사전준비

* Java SE Development Kit 8 Downloads : http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* STS 다운로드 : https://spring.io/tools/sts/all
(intelliJ 쓰시는 분들은 쓰셔도 되요)
* github 가입
* sourceTree 설치

## 과제
* 아래 주어진 요구사항을 만족하는 Java 프로그램을 개발해서 본인의 git repository에 올리고 저한테 링크알려주시면 됩니다!

### 요구사항
Java로 학생부 프로그램을 만듭니다.

1. 프로그램을 실행하면 `1. 학생`, `2. 교수`, `3. 과목`, `4. 성적`, `5. 종료` 5가지 선택지가 나오고 종료를 선택하면 프로그램이 종료된다.

2. `학생`을 선택하게 되면 1. 조회, 2. 입력, 3. 삭제 4. 이전 화면을 선택할 수 있다.

  - 조회를 누르면 전체학생들의 번호, 이름, 생년월일(YYMMDD)을 출력
  - 입력을 누르면 번호, 이름, 생년월일을 입력받는다
  - 삭제 버튼을 누르면 학생의 번호를 입력받고 입력받은 학생을 삭제한다
  - 이전화면을 누르면 첫번째 화면으로 돌아간다.

3. `교수`를 선택하게 되면 1. 조회, 2. 입력, 3. 삭제, 4. 이전 화면을 선택할 수 있다.

  - 조회를 누르면 전체교수들의 번호, 이름, 생년월일(YYMMDD, 과목을 출력
  - 입력을 누르면 번호, 이름, 생년월일, 과목명(ex. 컴퓨터공학) 을 입력받는다
  - 삭제를 선택하면 교수의 번호를 입력받고 입력받은 교수를 삭제한다.
  - 이전 화면을 누르면 첫번째 화면으로 돌아간다.

4. `과목`을 선택하게 되면 1. 조회, 2. 입력, 3. 삭제, 이전화면을 선택할 수 있다.

  - 조회를 누르면 전체 과목의 번호, 과목명을 출력
  - 입력을 누르면 과목번호, 과목명을 출력한다
  - 삭제를 선택하면 과목번호를 입력받고 입력받은 과목을 삭제한다
  - 이전 화면을 선택하면 첫번째 화면으로 돌아간다

5. `성적`을 선택하게 되면 1. 학생별 성적조회, 2. 과목별 성적 조회, 3. 성적 입력, 4. 성적 삭제, 5. 이전화면 선택가능하다.

  - 학생별 성적조회를 선택하면 다시 학생의 번호를 입력받고 해당하는 학생의 성적을 성적번호, 학생의번호, 과목번호, 성적순으로 출력한다
  - 과목별 성적조회를 선택하면 다시 과목의 번호를 입력받고 해당하는 과목의 성적을 성적번호, 학생의번호, 과목번호, 성적순으로 출력한다
  - 성적 입력을 선택하면 성적번호, 학생의번호, 과목번호, 성적순으로 입력한다
  - 성적 삭제를 선택하면 다시 성적번호를 입력받고 해당하는 성적을 삭제한다.

* 종료를 선택하기 전까지는 프로그램이 종료되지 않음
* 변수의 type은 자유

다하고 본인의 git repository에 업로드 해주세요!
모르는건 아무때나 물어보셔도 됩니다!

## 2주차

### 1. Hello World 띄워보기
* STS, MySQL을 설치한다!
* STS(IntellJ)와 같은 IDE에서 SpringBoot 프로젝트를 생성한 뒤 아래의 Controller를 추가한다
  - 프로젝트 생성할 때 spring initializr를 선택하고 web, mybatis, mysql을 추가로 선택한다
  - 프로젝트 load 후 mysql 설정을 application-properties에 입력한다

```
spring.datasource.url=jdbc:mysql://localhost:3306/school
spring.datasource.username=??
spring.datasource.password=??
```


```java
package com.nhnent.rookie5.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
```

HelloWorldController.java

* 프로젝트 build 빌드 후 http://localhost:8080/helloworld 에 접속해서 "helloworld!"가 제대로 print되는지 확인한다

### 2. Console Program -> Spring Project
* 기존에 만들었던 학생부 프로젝트를 Spring 기반 웹 프로젝트로 교체하기
  1. sourceTree를 이용해서 https://github.com/mskwon25/springstudy.git 프로젝트를 Clone한다.
  2. sourcetree에서 branch를 선택하고 `feature/영문이름` 형식의 새로운 브랜치를 생성한다
  (이후 master가 아닌 생성한 브랜치에서만 작업)
  3. sts를 실행한뒤 해당프로젝트 경로를 입력하고 프로젝트를 import시킨다.
  4. application.properties 파일에서 mysql관련 설정을 변경한다
  5. src/test/java/com/springstudy/first/demo/service/UserServiceTests를 실행시켜서 존재하는 2개의 테스트를 완성시킨다
  `resources/UserMapper`에 Query를 알맞게 설정해야 테스트가 완성됨.
  6. UserServiceTests가 모두 성공한다면 같은 방식으로 교수, 학점, 학과 모두 생성한다.


* table 생성 쿼리
```sql
CREATE TABLE student (
  student_id int,
  student_name varchar(10),
  student_birthday varchar(10),
  primary key(student_id)
);
```

* 다 완성하신 분들 파일 업로드 하는법
  1. sourceTree에 들어가서 파일상태를 클릭한 후 커밋메세지 칸에
  text(과제 완료....)를 입력한후 커밋 버튼을 누른다
  2. 상단에 푸시 버튼을 눌러서 푸쉬한다
  3. https://github/mskwon25/springstudy 에 접속해서 pullRequest 탭을 누른다
  4. add PullRequest 버튼을 누르고 base:master로 설정하고 pullRequest를 create한다. 최종 merge요청은 하지마세요!!
