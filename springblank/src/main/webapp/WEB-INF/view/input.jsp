
<!DOCTYPE html>
<html>
<head>
<title>Echo Application</title>
</head>
<body>
	<form:form modelAttribute="echoForm" action="/springblank/echo">

		<form:label path="name">名前:</form:label>
		<form:input path="name" />
		<form:errors path="*"   cssStyle="color:red" />
		<br>
		<input type="submit" />
	</form:form>


</body>
</html>