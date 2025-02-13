
<!DOCTYPE html>
<html>
<head>
<title>ユーザ検索</title>
</head>
<body>
	<div>
		<p style="color:red;">
			<c:out value="${message}" />
		</p>
	</div>

	<form:form modelAttribute="userForm"
		action="${pageContext.request.contextPath}/user/info">
		<form:label path="userid">ユーザID:</form:label>
		<form:input path="userid" />
		<form:errors path="userid" cssStyle="color:red" />
		<br>
		<input type="submit" />
	</form:form>

<c:if test="${userForm.userDto!=null}">
	<table>
		<tr>
			<td>ユーザID</td>
			<td><c:out value="${userForm.userDto.user_id_seq}"></c:out></td>
		</tr>
		<tr>
			<td>パスワード</td>
			<td><c:out value="${userForm.userDto.password}"></c:out></td>
		</tr>
		<tr>
			<td>ユーザ名</td>
			<td><c:out value="${userForm.userDto.name}"></c:out></td>
		</tr>
		<tr>
			<td>メール</td>
			<td><c:out value="${userForm.userDto.mail}"></c:out></td>
		</tr>
		<tr>
			<td>電話番号</td>
			<td><c:out value="${userForm.userDto.tel}"></c:out></td>
		</tr>
		<tr>
			<td>開始日</td>
			<td><c:out value="${userForm.userDto.startdate}"></c:out></td>
		</tr>
		<tr>
			<td>終了日</td>
			<td><c:out value="${userForm.userDto.enddate}"></c:out></td>
		</tr>


	</table>
</c:if>

</body>
</html>