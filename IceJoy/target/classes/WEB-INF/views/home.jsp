<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="user/profile" commandName="user" method="POST">
    <table>
      <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
      </tr>
      <tr>
        <td><form:label path="password">Age</form:label></td>
        <td><form:input path="password" /></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="Submit"/>
        </td>
      </tr>
    </table>
  </form:form>
</body>
</html>
