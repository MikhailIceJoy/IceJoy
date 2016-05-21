<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>

<c:if error="${true}">
  <div class="error">${errorText}</div>
</c:if>

<form name='loginForm'
      action='j_spring_security_check' method="POST">

  <table>
    <tr>
      <td>User:</td>
      <td><input type='text' name='j_username' value=''></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type='password' name='j_password' /></td>
    </tr>
    <tr>
      <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
    </tr>
  </table>

</form>
</body>
</html>
