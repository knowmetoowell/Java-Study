<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="i" value="10"/>
${i}
<hr/>
\${10 + 5} = ${10 + 5}<br/>
\${10 - 5} = ${10 - 5}<br/>
\${10 * 5} = ${10 * 5}<br/>
\${10 / 5} = ${10 / 5}<br/>
\${10 % 5} = ${10 % 5}<br/>
\${10 mod 5} = ${10 mod 5}<br/>
</body>
</html>
