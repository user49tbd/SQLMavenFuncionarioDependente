<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" 
href='<c:url value="./resources/CSS/cf.css"/>'>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div align="center">
<form action="FD" method="post">
<input type="submit" name="btn1" id="btn1" value ="Listar">
</form>
</div>
<br>
<div align="center">
<c:if test="${not empty lis}">
<table border="1">
<thead>
<tr>
<th>Funcionario</th>
<th>Dependente</th>
<th>Funcionario-Salario</th>
<th>Dependente-Salario</th>
</tr>
</thead>
<tbody>
<c:forEach items="${lis}" var="l">
<tr>
<td><c:out value="${l.funcionarioNome}"></c:out></td>
<td><c:out value="${l.dependenteNome}"></c:out></td>
<td><c:out value="${l.funcionarioSal}"></c:out></td>
<td><c:out value="${l.dependenteSal}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
<br>
<br>
<div align="center">
<form action="FD" method="post">
<table border="1">
<tr>
<td><input type="number" name="btnID" id="btnID" placeholder="ID" required step="1"></td>
<td><input type="submit" name="btnBVal" id="btnBVal" value="Buscar Valor"></td>
</tr>
<tr>
<td><input type="number" name="btnVal" id="btnIVal" 
value="<c:out value="${valu}"></c:out>" step="0.01"></td>
</tr>
</table>
</form>
</div>
</body>
</html>