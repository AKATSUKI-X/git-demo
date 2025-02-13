package co.jp.mamol.Dto;

import java.io.Serializable;

/*
 * ユーザマスタDTO
 */
public class UserDto implements Serializable{
	/*
	 *ユーザID
	 */
	Integer user_id_seq;
	/*
	 *パスワード
	 */
	String password;
	/*
	 *ユーザ名
	 */
	String name;
	/*
	 * メール
	 */
	String mail;
	/*
	 * 電話番号
	 */
	String tel;
	/*
	 * 権限区分（"1":一般ユーザ "2":管理者）
	 */
	String role_class;
	/*
	 * 開始日 (YYYY/MM/DD)
	 */
	String startdate;
	/*
	 * 終了日 (YYYY/MM/DD)
	 */
	String enddate;

	public Integer getUser_id_seq() {
		return user_id_seq;
	}
	public void setUser_id_seq(Integer user_id_seq) {
		this.user_id_seq = user_id_seq;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRole_class() {
		return role_class;
	}
	public void setRole_class(String role_class) {
		this.role_class = role_class;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


}
