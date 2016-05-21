<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
  Hello ${user.name}
  <br>
  Authorities ${user.roles}
  <tr>
    <td>Name</td>
    <td>${user.name}</td>
  </tr>
</table>
<%--<a href="Web/ ../login.jsp">Home</a>--%>
</body>
</html>
