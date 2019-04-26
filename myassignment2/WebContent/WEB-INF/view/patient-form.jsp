<%@ taglib prefix ="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Customer Registration form</title>
	<style>
	.error{color:red}
	</style>
</head>
<body>
	<i>Fill out the form. Asterisk(*) means required.</i>
	<br><br>
	
	<form:form  action = "processForm" modelAttribute = "patient">
		Name:<form:input path = "name"/>
		<br><br>
		Address: <form:input path = "address"/>
		<form:errors path = "address" cssClass = "error"/>
		<br><br>
		Email: <form:input path = "email"/>
		<form:errors path = "email" cssClass ="error"/>
		
		<br><br>
		Phone number: <form:input path = "phNumber"/>
		<form:errors path = "phNumber" cssClass ="error"/>
		
		<br><br>
		
		
		Password: <form:input path = "password"/>
		
		
		<input type = "submit" value ="Submit"/>
	</form:form>
	
	<a href = "${pageContext.request.contextPath}/patient/list">Back to List</a>
</body>
</html>