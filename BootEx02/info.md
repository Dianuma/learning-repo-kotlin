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
```

## 파일 내용
**JdbcController**
- 데이터 베이스 연결
- jdbc1(): 데이터 베이스 연결 후 데이터 베이스 연결 출력
- jdbc2(): jdbcTemplate을 사용하여 데이터 베이스 연결 후 템플릿 출력
- jdbc3(): JdbcDAO 를 통해 jdbcTemplate 출력

**JdbcDAO**
- jdbcTemplate을 사용하여 데이터 베이스 연결
- selectNow(): jdbcTemplate 및 현재 시간 출력

**jdbc1.html**
- 메인 페이지
