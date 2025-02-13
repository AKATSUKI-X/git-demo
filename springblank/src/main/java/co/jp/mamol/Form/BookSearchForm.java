package co.jp.mamol.Form;


import java.io.Serializable;
import java.util.List;

import co.jp.mamol.Dto.BookDto;
import co.jp.mamol.Dto.BookSearchCondition;

public class BookSearchForm implements Serializable{

	//書籍検索条件DTO
	private BookSearchCondition condition;

	//書籍情報リスト
	private List<BookDto> bookList;

	//ページ番号
	private int pageNum;

	//総ページ数
	private int totalPage;

	public BookSearchCondition getCondition() {
		return condition;
	}
	public void setCondition(BookSearchCondition condition) {
		this.condition = condition;
	}
	public List<BookDto> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookDto> bookList) {
		this.bookList = bookList;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "BookSearchForm [condition=" + condition + ", bookList=" + bookList + ", pageNum=" + pageNum
				+ ", totalPage=" + totalPage + "]";
	}



}
