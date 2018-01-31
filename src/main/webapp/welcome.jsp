
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<h2 align="center">hi ${login}</h2>
   <table border = "2" width = "100%">
   <tbody>
   <tr><th>Name</th><th>Age</th><th>Height</th><th>Gender</th></tr>
   <c:forEach items="${list}" var="emp">
   <tr><td><c:out value="${emp.getName()}"></c:out></td>
   <td><c:out value="${emp.getAge()}"></c:out></td>
   <td><c:out value="${emp.getHeight()}"></c:out></td>
   <td><c:out value="${emp.getSex()}"></c:out></td></tr>
   </c:forEach>
   </tbody>
   </table>
</body>
</html>