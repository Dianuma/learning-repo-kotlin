<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int startDan = Integer.parseInt(request.getParameter("startDan"));
    int endDan = Integer.parseInt(request.getParameter("endDan"));
    // 내부 처리를 미리 선언
    StringBuilder sbHtml = new StringBuilder();

    // 처리부
    sbHtml.append("<table border='1' cellspacing='0' width='1000'>");
    for( int i = startDan; i <= endDan; i++ ) {
        sbHtml.append("<tr>");
        for ( int j = 0; j <= 9; j++ ) {
            String bgColor = ( i % 2 == 0 ) ? "bgcolor='#FFCCCC'" : "bgcolor='#99CCCC'";
            if ( i == 0 && j == 0 ) sbHtml.append("<td " + bgColor + " width='100' align='center'></td>");
            else if ( i == 0 ) sbHtml.append("<td " + bgColor + " width='100' align='center'>X"+j+"</td>");
            else if ( j == 0 ) sbHtml.append("<td " + bgColor + " width='100' align='center'>"+i+"단</td>");
            else sbHtml.append("<td " + bgColor + " width='100' align='center'>" + i + " X " + j + " = " + i * j + "</td>");
        }
        sbHtml.append("</tr>");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- gugudanStartToEndSend.jsp -->
<%
    out.println(sbHtml.toString());
%>
</body>
</html>
