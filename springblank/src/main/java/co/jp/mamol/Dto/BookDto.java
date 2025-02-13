package co.jp.mamol.Dto;

import java.io.Serializable;

/*
 * 書籍マスタDTO
 */
public class BookDto implements Serializable{
	/*
	 * 書籍ID
	 */
	Integer book_id_seq;
	/*
	 * 書名
	 */
	String name;
	/*
	 * 著者名
	 */
	String author;
	/*
	 * 出版社
	 */
	String publisher;
	/*
	 * 内容注記
	 */
	String note;
	/*
	 * ISBN
	 */
	String isbn;
	/*
	 * カテゴリ区分
	 */
	String category_class;
	/*
	 * 登録日
	 */
	String regdate;

	/*
	 * 貸出状態区分
	 */
	String lendstatus_class;

	/*
	 * 貸出ユーザID
	 */
	Integer lend_userid;
	/*
	 * 貸出日付
	 */
	String lend_date;
	/*
	 * 返却期限
	 */
	String deadline_date;
	/*
	 * 予約状態区分
	 */
	String res_status_class;
	/*
	 * 予約可否フラグ
	 */
	boolean resable;
	/*
	 * 予約ユーザ
	 */
	Integer res_userid;
	/*
	 * 遅延フラグ
	 */
	boolean delayed;
	/*
	 * チェックフラグ
	 */
	boolean checked;

	public Integer getBook_id_seq() {
		return book_id_seq;
	}
	public void setBook_id_seq(Integer book_id_seq) {
		this.book_id_seq = book_id_seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getLendstatus_class() {
		return lendstatus_class;
	}
	public void setLendstatus_class(String lendstatus_class) {
		this.lendstatus_class = lendstatus_class;
	}
	public Integer getLend_userid() {
		return lend_userid;
	}
	public void setLend_userid(Integer lend_userid) {
		this.lend_userid = lend_userid;
	}
	public String getLend_date() {
		return lend_date;
	}
	public void setLend_date(String lend_date) {
		this.lend_date = lend_date;
	}
	public String getDeadline_date() {
		return deadline_date;
	}
	public void setDeadline_date(String deadline_date) {
		this.deadline_date = deadline_date;
	}
	public String getRes_status_class() {
		return res_status_class;
	}
	public void setRes_status_class(String res_status_class) {
		this.res_status_class = res_status_class;
	}
	public Integer getRes_userid() {
		return res_userid;
	}
	public void setRes_userid(Integer res_userid) {
		this.res_userid = res_userid;
	}
	public boolean isDelayed() {
		return delayed;
	}
	public void setDelayed(boolean delayed) {
		this.delayed = delayed;
	}
	public boolean isResable() {
		return resable;
	}
	public void setResable(boolean resable) {
		this.resable = resable;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
