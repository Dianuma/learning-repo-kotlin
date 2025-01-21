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
- Controller
- ZipCodeDAO 를 통해 Datebase 에서 가져온 데이터를 View 로 전달
- searchAll(): ZipCode Table 전체 반환
- searchByDong(): 동으로 검색하여 반환

**ZipCodeDAO**
- jdbcTemplate을 사용하여 데이터 베이스 연결
- selectAll(): ZipCode Table 전체 반환
- selectByDong(): 동으로 검색하여 반환

**ZipCodeDTO**
- ZipCode Table 의 데이터를 담는 객체
- zipcode, sido, gugun, dong, ri, bunji, seq

**zipcode.html**
- 메인 페이지
- Controller 로부터 ZipCode Table 에 대한 데이터를 받아와 표로 출력
