
# 스프링 중간고사 예상 문제

23문제 중 선택하여 중간고사 출제함

1. 스프링 프레임워크의 동작 순서대로 작성하시오.
```java
        URL요청 -> ( Controller ) -> ( Service ) -> ( Mapper )
```


2. 스프링 프레임워크와 스프링 부트 프레임워크의 특징과 차이점은 작성하시오.
```java
        **스프링 프레임워크 특징 :**
        경량 컨테이너, 제어 역행, 의존성 주입, AOP(관점 지향 프로그래밍)
        - 컨테이너란? 작성한 코드의 처리 과정을 위임 받은 독립적인 존재
        (알아서 객체 생성, 소멸과 같은 생명주기 관리해줌)
        - 외부 라이브러리의 코드가 프로그래머가 작성한 코드를 호출한다.
        따라서 소스에 의존관계가 명시되지 않음
        - 의존성 주입? 객체가 필요한 객체를 외부에서 밀어 넣는 것
        (의존성으로 인해 높은 결합도를 느슨하게 만들기 위함)

        ### 의존성 주입
        ⓐ ------???-----> ⓑ
        ⓐ는 ⓑ가 필요하다는 신호만 보내고, ⓑ객체를 주입하는 것은 외부에서 이루어진다.

        **스프링 부트 프레임워크 특징 :**
        스프링 프레임워크를 사용하기 위한 설정의 많은 부분을 자동화함X
        내장된 WAS(웹 서버)를 프로젝트에 포함 시킴

        **차이점 :**
        1. 스프링부트는 내장 톰캣을 사용하기 때문에 따로 톰캣을 설치, 매번 버전관리 하지 않아도 됨
        2. 스프링부트는 starter를 통한 dependency 자동화가 된다.
        3. 스프링부트는 XML 설정을 하지 않아도 된다.
        4. 스프링부트는 jar file을 이용해 자바 옵션만으로 손쉽게 배포가 가능하다.
```

3. @Controller 어노테이션에 대해 자세히 설명하시오.
```java
Spring 프레임워크에서 Controller인지 인식 가능하게 하며
Service를 실행하고, 그 Service로부터 받은 결과를 JSP에 전달
JSP 문법에서만 존재하는 session, request를 사용할 수 있음
JSP 문법이 사용가능하기 때문에 각 URL호출에 대해 처리 가능
```

4. @Service 어노테이션에 대해 자세히 설명하시오.
```java
Service는 Controller에서 자신을 찾을 수 있도록 반드시 자신의 이름을 기입함 
또한 반드시 자기 이름 앞에 I를 붙인 인터페이스를 생성하고 구현(implements)함
데이터베이스와 연동하는 Mapper들을 호출
중요 로직처리는 다 Service에서 사용함

/** 3장 33p **/
```

5. @Mapper 어노테이션에 대해 자세히 설명하시오.
```java
Interface를 매퍼로 등록하기 위해 @Mapper 어노테이션을 사용
데이터베이스(오라클, MySQL, MariaDB)로부터 전달받은 결과 값을 자바 객체로 변환시킴, 
자동 변환을 위해 반드시 DTO(Data Transfer Object)를 사용함
DTO를 사용하지 않아도 되지만, 코드가 훨씬 간결해지고 편리함
```

6. SQL 언어를 XML 파일에 작성하여, 소프트웨어의 유지보수를 쉽게 하기 개발된 오픈소스 프레임워크는 무엇인가?
```java
myBatis
```

7. Lombok 외부 라이브러리에 대해 자세히 설명하시오.
```java
스프링 프레임워크에 적용 가능한 프레임워크
자주 사용되는 자바 코드 작성을 쉽게 작성하기 위해
어노테이션(@)으로 코드를 작성함
```

8. JDBC에 대해 자세히 설명하시오.
```java
Java DataBase Connecivity
자바 프로그램 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 프로그래밍 인터페이스.
응용 프로그램과 DBMS간의 통신을 중간에서 번역해주는 역할을 함.
```

9. DTO에 다음과 같이 정의된 변수에 @Setter 어노테이션을 작성하면, 어떤 함수가 자동으로 생성되는가?
```java
        private String user_id;

        public void setUser_id(String user_id){
            this.user_id = user_id;
        }
```

10. DTO에 다음과 같이 정의된 변수에 @Getter 어노테이션을 작성하면, 어떤 함수가 자동으로 생성되는가?
```java
        private String user_id;

        public String getUser_id(){
            return user_id;
        }
```


11. @Resource 어노테이션에 대해 자세히 설명하시오.
```java
컨테이너에 생성된 빈(Bean) 객체를 자동으로 주입받을 수 있도록 해주는 어노테이션
필드명 또는 생성자 파라미터 변수의 이름과 Bean 객체의 ID를 매핑시켜서 먼저 찾는 방식
ex) @Resource(name="NoticeService")는 Service 자바 파일 중 
스프링 문법으로 선언된 NoticeService 찾아서 연결함

```

12. @RequiredArgsConstructor 어노테이션에 대해 자세히 설명하시오.
```java
final 필드에 대해 생성자를 만들어주는 lombok의 annotation.
의존성주입 중 Constructor Injection(생성자 주입)을 임의의 코드 없이 자동으로 설정함
```

13. 비밀번호를 암호화하기 위한 암호화 알고리즘 예와 그 알고리즘에 대해 자세히 설명하시오.
```java
SHA-256
단방향 암호화 기술인 해시 암호화 사용함, 절대 암호를 풀 수 없어야함
```

14. 식별정보(이메일, 계좌번호 등)를 암호화하기 위한 암호화 알고리즘 예와 그 알고리즘에 대해 자세히 설명하시오.
```java
AES 128-CBC 암호화 알고리즘 사용
암호화 및 복호화 지원
암호화와 복호화에 사용되는 동일한 키 존재함
```

15. 메일 발송을 위해 사용되는 프로토콜을 작성하시오.
```java
SMTP(Simple Mail Transfer Protocol)
```

16. 공지사항의 글 작성을 위해 PK컬럼의 값을 자동으로 증가시키기 위한 SQL을 작성하시오.
```java
( SELECT NVL( MAX(A.NOTICE_SEQ), 0 )+1 FROM NOTICE A )
```

17. @Slf4j 어노테이션에 대해 자세히 설명하시오.
```java
스프링 프레임워크에서 로그 처리하는 인터페이스 기술이며
로그 처리 기술인 log4j와 logback과 인터페이스 역할 수행함
스프링 프레임워크는 기본으로 logback을 채택해서 로그 처리함  -3장 27p
```

18. @GetMapping, @PostMapping, @RequestMapping 어노테이션에 대해 자세히 설명하시오.
```java
 - @GetMapping : 주소에 파라미터가 노출 됨
 RequestMapping의 축약형, @RequestMapping(value = "/test7", method = {RequestMethod.GET})
 - @PostMapping : 주소에 파라미터가 노출 안됨
 RequestMapping의 축약형, @RequestMapping(value = "/test7", method = {RequestMethod.POST})
 - @RequestMapping : 
 함수 & 클래스 위에 사용 가능, 
 클래스 위에 쓰면 하나의 컨트롤러에 공통된 주소 붙일 수 있음 
 URL을 컨트롤러의 메서드와 매핑할 때 사용하는 어노테이션
 @RequestMapping(value = "/test7", method = {RequestMethod.GET, RequestMethod.POST})
```

19. Controller의 ModelMap 객체에 대해 자세히 설명하시오.
```java
Model 객체는 컨트롤러에서 데이터를 생성해 이를 JSP 즉 View에 전달하는 역할을 합니다.
HashMap 형태를 갖고 있고, 키(key)와, 밸류(value) 값을 저장합니다.
modelmap.addAttribute() 함수를 사용하여 Model에 데이터를 저정 후 view에서 데이터에 접근이 가능
```

20. 다음과 같은 HTML의 form 태그의 요소들로부터 값을 받기 위한 Controller의 함수를 작성하시오.
```java
        <form method="post" action="/loging">
        <input type="text" name="user_id" />
        <input type="text" name="password" />
        <input type="submit" value="전송" />
        </form>
```
```java 6장 29p
@PostMapping("/loging")
public String loging(HttpServletRequest request, Model model) throws Exception {
    log.info(this.getClass().getName()+".loging Start!!");
    String user_id = CmmUtil.nvl(request.getParameter("user_id"));
    String password = CmmUtil.nvl(request.getParameter("password"));
}
```

21. 스프링 부트 프레임워크 주요 환경설정을 정의하는 파일명은 무엇인가?

```java
application.properties - 3장 14p
```

22. 자바 외부 라이브러리를 자동으로 다운로드 및 프로젝트 자동 반영시켜는 도구의 이름과 설정 파일명을 작성하시오.
 > - 빌드 도구 : maven
 > - 설정 파일 : pom.xml

23. @Transactional 어노테이션에 대해 자세히 설명하시오.
```java
DB,데이터에 변화가 있는 곳에만 사용 ☆☆☆☆☆
롤백과 커밋으로 이루어지는 기능
Service에서 중요한 코드를 사용하기 때문에 서비스에서 사용 ( ex) 업데이트 쿼리 )
롤백 : 우리가 쇼핑물에서 만원짜리 물건을 사는 상황에서 쿠폰,모바일 쿠폰, 내 카드로 결제할 때 오류가 나면 
        그 쿠폰을 사용하지 않고(결제 도중에는 실재 DB에는 반영하지 않고) 실패하면 다시 돌려주는 것
커밋 : 모든 결제 과정에서 오류가 안나고 잘하면 커밋하면서 DB에 적용됨
```