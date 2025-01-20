<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- gugudanPrint.jsp로 전송 -->
<form action="./controller?path=gugudan_ok" method="post">
    <table border="1" cellspacing="0">
        <tr>
            <td>
                시작단 : <input type="text" name="startDan" placeholder="시작단 입력">
                ~
                끝단 : <input type="text" name="endDan" placeholder="끝단 입력">
                <input type="submit" value="구구단 출력">
            </td>
        </tr>
    </table>
</form>
</body>
</html>