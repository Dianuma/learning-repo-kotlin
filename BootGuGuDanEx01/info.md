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
```

## 파일 내용
**GugudanController**
- URL 로부터 dan 을 입력받아 gugudan.html 로 전달.

**gugudan.html**
- 메인 페이지
- dan 을 받아와 구구단 출력.