## 목록
- [파일 내용](#파일-내용)

## 파일 내용
**ControllerServlet**
- DeptDAO.listDepts() 호출
- EmpDAO.listEmps() 호출

**DeptDAO**
- Connection | Statement | ResultSet 객체 생성
- Dept 테이블의 레코드를 조회하는 메소드

**DeptTO**
- data class
- Dept 테이블의 레코드를 저장하는 클래스

**EmpDAO**
- Connection | Statement | ResultSet 객체 생성
- Emp 테이블의 레코드를 조회하는 메소드

**EmpTO**
- data class
- Emp 테이블의 레코드를 저장하는 클래스