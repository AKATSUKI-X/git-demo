package co.jp.mamol.Dto;

import java.io.Serializable;

/*
 * 書籍検索条件DTO
 */
public class BookSearchCondition implements Serializable{
	/*
	 * 書籍名
	 */
	String name;
	/*
	 * 著者名
	 */
	String author;
	/*
	 * ISBN
	 */
	String isbn;
	/*
	 * カテゴリ
	 */
	String category_class;
	/*
	 * 貸出状態
	 */
	String lendstatus_class;
	/*
	 * 予約状態区分
	 */
	String res_status_class;
	/*
	 * 取得開始番号
	 */
	int startNo;
	/*
	 * 取得終了番号
	 */
	int endNo;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCategory_class() {
		return category_class;
	}
	public void setCategory_class(String category_class) {
		this.category_class = category_class;
	}
	public String getLendstatus_class() {
		return lendstatus_class;
	}
	public void setLendstatus_class(String lendstatus_class) {
		this.lendstatus_class = lendstatus_class;
	}
	public String getRes_status_class() {
		return res_status_class;
	}
	public void setRes_status_class(String res_status_class) {
		this.res_status_class = res_status_class;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}


}
