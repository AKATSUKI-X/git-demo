
<!DOCTYPE html>
<html>
<head>
<title>書籍検索</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript">
function search(){

    var bsc={
    		name:$("#name").val(),
    		author:$("#author").val(),
    		isbn:$("#isbn").val(),
    		category_class:$("#category_class").val(),
    		lendstatus_class:$("#lendstatus_class").val(),
    		res_status_class:$("#res_status_class").val(),
    };

    $.ajax({
        type: "POST",
        url: "${pageContext.request.contextPath}/ajaxbooksearch/search",
        data: JSON.stringify(bsc),
        dataType: "json",
        contentType: "application/json; charset=UTF-8",
        success:function(bookList){

			$("#datatable").html("");

        	for(var book of bookList){

                   var innerHtml =
                	   "<tr>"+
                	   "<td>"+book.book_id_seq+"</td>"+
                	   "<td>"+book.name+"</td>"+
                	   "<td>"+book.author+"</td>"+
                	   "<td>"+book.isbn+"</td>"+
                	   "<td>"+book.category_class+"</td>"+
                	   "<td>"+book.lendstatus_class+"</td>"+
                	   "<td>"+book.res_status_class+"</td>"+
                	   "</tr>";

                   $("#datatable").append(innerHtml);

        	}

        	}
        });
}

</script>
</head>
<div class="center_a">
	<br /> <br />
	<h2>書籍検索</h2>
		<table style="border-style: inset; border-color: lightgrey">
			<tr>
				<td align="center" width=100><label>書籍名</label></td>
				<td width=200><input  type="text" id="name" /></td>
			</tr>
			<tr>
				<td align="center" width=100><label>著者名</label></td>
				<td width=200><input type="text" id="author" /></td>
			</tr>

			<tr>
				<td align="center" width=100><label>ISBN</label></td>
				<td width=200><input type="text" id="isbn" /></td>
			</tr>

			<tr>
				<td align="center" width=100><label>カテゴリ</label></td>
				<td width=200>
				   <select id="category_class">
						<option value="0">未設定</option>
						<option value="1">図書</option>
						<option value="2">資料</option>
						<option value="3">雑誌</option>
						<option value="4">ビデオ</option>
					</select></td>
			</tr>
			<tr>
				<td align="center" width=100><label>貸出状態</label></td>
				<td width=200><select id="lendstatus_class">
						<option value="0">未設定</option>
						<option value="1">在架</option>
						<option value="2">貸出中</option>
					</select></td>
			</tr>
			<tr>
				<td align="center" width=100><label>予約状態</label></td>
				<td width=200>
				    <select id="res_status_class">
						<option value="0">未設定</option>
						<option value="1">予約なし</option>
						<option value="2">予約あり</option>
					</select></td>
			</tr>
		</table>
		<div align="left">
			<button id="searchbutton" onclick="search()">検索</button>
		</div>

	<br />

		<table id="datatable" style="border-style: inset; border-color: lightgrey">
		</table>
</div>
</html>