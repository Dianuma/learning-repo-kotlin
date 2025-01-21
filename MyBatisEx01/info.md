## 목록
- [설정](#설정)
- [파일 내용](#파일-내용)

## 설정
```yaml
# Spring Boot properties
# Change the port number to 8081
server.port=8081

  # Thymeleaf properties
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.check-template-location=true
spring.thymeleaf.cache=false

  # Database properties
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/sample?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=!123456

  # MyBatis properties
mybatis.mapper-locations=classpath:mappers/mapper.xml
```

## 파일 내용
**MybasitController**
- Controller
- /mybatis 로 접속 시 mybatis.html 페이지로 이동

**MybasitDAO**
- DAO
- select() : MybasitMapper 의 select() 메소드 호출

**MybasitMapper**
- Mapper Interface
- select() : now() 함수를 호출하여 현재 시간을 출력

**mapper.xml**
- Mapper XML
- select : now() 함수를 호출하여 현재 시간을 출력

**mybasit.html**
- 메인 페이지