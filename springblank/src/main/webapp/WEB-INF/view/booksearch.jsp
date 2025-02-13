
<!DOCTYPE html>
<html>
<head>
<title>書籍検索</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.simplePagination.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/simplePagination.css">
<script type="text/javascript">
$(function() {
		$(".pagination").pagination({
			items : '${bookSearchForm.totalPage}',
			currentPage : '${bookSearchForm.pageNum}',
			displayedPages : '10',
			prevText : "前へ",
			nextText : "次へ",
			cssStyle : 'light-theme',
			onPageClick : function(currentPageNumber) {

				window.location.href ='${pageContext.request.contextPath}/booksearch/paging?pageNum='+currentPageNumber;

			}

         })
});
</script>
</head>
<div class="center_a">
	<br /> <br />
	<h2>書籍検索</h2>

	<form:form modelAttribute="bookSearchForm"
	action="${pageContext.request.contextPath}/booksearch/search">

		<table style="border-style: inset; border-color: lightgrey">
			<tr>
				<td align="center" width=100><label>書籍名</label></td>
				<td width=200><form:input path="condition.name" /></td>
			</tr>
			<tr>
				<td align="center" width=100><label>著者名</label></td>
				<td width=200><form:input path="condition.author" /></td>
			</tr>

			<tr>
				<td align="center" width=100><label>ISBN</label></td>
				<td width=200><form:input path="condition.isbn" /></td>
			</tr>

			<tr>
				<td align="center" width=100><label>カテゴリ</label></td>
				<td width=200>
					<form:select path="condition.category_class">
						<form:option value="0">未設定</form:option>
						<form:option value="1">図書</form:option>
						<form:option value="2">資料</form:option>
						<form:option value="3">雑誌</form:option>
						<form:option value="4">ビデオ</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td align="center" width=100><label>貸出状態</label></td>
				<td width=200>
				    <form:select path="condition.lendstatus_class">
						<form:option value="0">未設定</form:option>
						<form:option value="1">在架</form:option>
						<form:option value="2">貸出中</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td align="center" width=100><label>予約状態</label></td>
				<td width=200><form:select path="condition.res_status_class">
						<form:option value="0">未設定</form:option>
						<form:option value="1">予約なし</form:option>
						<form:option value="2">予約あり</form:option>
					</form:select></td>
			</tr>
		</table>
		<div align="left">
			<form:button>検索</form:button>
		</div>

	</form:form>
	<br />


	<c:if test="${not empty bookSearchForm.bookList}">
		<table>
			<tr>
				<td colspan="8">
					<div id="pagetitle">
						page:
						<c:out value="${bookSearchForm.pageNum}" />
						/
						<c:out value="${bookSearchForm.totalPage}" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<!-- ページングバー -->
					<div class="pagination-holder clearfix">
						<div id="light-pagination" class="pagination"></div>
					</div>
				</td>

			</tr>
		</table>

		<table style="border-style: inset; border-color: lightgrey">
			<tr bgcolor="#a899ff">
				<td width="100">書籍ID</td>
				<td width="400">書籍名</td>
				<td width="200">著者名</td>
				<td width="200">ISBN</td>
				<td width="100">カテゴリ</td>
				<td width="100">貸出状態</td>
				<td width="100">予約状態</td>
			</tr>

			<c:forEach var="v" items="${bookSearchForm.bookList}">
				<tr>
					<td><c:out value="${v.book_id_seq}" /></td>
					<td><c:out value="${v.name}" /></td>
					<td><c:out value="${v.author}" /></td>
					<td><c:out value="${v.isbn}" /></td>
					<td><c:if test="${v.category_class==1}">
							<font>図書</font>
						</c:if> <c:if test="${v.category_class==2}">
							<font>資料</font>
						</c:if> <c:if test="${v.category_class==3}">
							<font>雑誌</font>
						</c:if> <c:if test="${v.category_class==4}">
							<font>ビデオ</font>
						</c:if></td>
					<td><c:if test="${v.lendstatus_class==1}">
							<font>在架</font>
						</c:if> <c:if test="${v.lendstatus_class==2}">
							<font>貸出中</font>
						</c:if></td>
					<td><c:if test="${v.res_status_class==1}">
							<font>予約なし</font>
						</c:if> <c:if test="${v.res_status_class==2}">
							<font>予約あり</font>
						</c:if></td>

				</tr>
			</c:forEach>
		</table>

	</c:if>
</div>
</html>