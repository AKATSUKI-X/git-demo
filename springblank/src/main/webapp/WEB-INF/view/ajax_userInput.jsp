<!DOCTYPE html>
<html>
<head>
<title>ユーザ検索</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript">

function search(){

    $.ajax({
        type: "POST",
        url: "${pageContext.request.contextPath}/userajax/info",
        data: $("#searchuserid").val(),
        dataType: "json",
        contentType: "application/json; charset=UTF-8",
        success: function(userDto) {

        		$("#mytable").css('display', 'block');

        		$("#user_id_seq").text(userDto.user_id_seq);

        		$("#password").text(userDto.password);

        		$("#name").text(userDto.password);

        		$("#mail").text(userDto.mail);

        		$("#tel").text(userDto.tel);

        		$("#startdate").text(userDto.startdate);
        		$("#enddate").text(userDto.enddate);
        }
    });

};

</script>
</head>
<body>

	<div>
		<label>ユーザID</label> <input id="searchuserid" type="text" /> <input
			type="button" value="検索" onclick="search()" />
	</div>
	<table id="mytable" style="display:none;">
		<tr>
			<td>ユーザID</td>
			<td><p id="user_id_seq"></p></td>
		</tr>
		<tr>
			<td>パスワード</td>
			<td><p id="password"></p></td>
		</tr>
		<tr>
			<td>ユーザ名</td>
			<td><p id="name"></p></td>
		</tr>
		<tr>
			<td>メール</td>
			<td><p id="mail"></p></td>
		</tr>
		<tr>
			<td>電話番号</td>
			<td><p id="tel"></p></td>
		</tr>
		<tr>
			<td>開始日</td>
			<td><p id="startdate"></p></td>
		</tr>
		<tr>
			<td>終了日</td>
			<td><p id="enddate"></p></td>
		</tr>
	</table>
</body>
</html>