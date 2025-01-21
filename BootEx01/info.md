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
**HomeController**
- index(): 메인 페이지를 Web에 출력.
- get1(): url 로부터 data 값을 받아와 출력. HttpServletRequest 사용.
- get2(): url 로부터 data 값을 받아와 출력. RequestParam 사용.
- get3(): url 로부터 data 값을 받아와 출력.
- get4(): url 로부터 data 값을 받아와 출력. PathVariable 사용.
- set1(): HttpServletRequest를 사용하여 data 넘기기.
- set2(): Model을 사용하여 data 넘기기.
- set3(): ModelAndView를 사용하여 data 넘기기.

**index.html**
- 메인 페이지
- data를 받아와 출력.