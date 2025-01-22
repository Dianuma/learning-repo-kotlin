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

spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
```

## 파일 내용
**MemberController**
- Controller
- select() : Member 데이터 조회
- insert() : Member 데이터 2개 삽입

**Member**
- @Entity : 테이블과 매핑

**MemberRepository**
- JpaRepository : Member 데이터 조회, 삽입

**select.html**
- select() 시 나타나는 페이지

**insert.html**
- insert() 시 나타나는 페이지