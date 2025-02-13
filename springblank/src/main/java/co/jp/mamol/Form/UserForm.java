package co.jp.mamol.Form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import co.jp.mamol.Dto.UserDto;

public class UserForm implements Serializable{

	@Pattern(regexp = "[0-9]+", message="数字で入力してください")
	private String userid;

	private UserDto userDto;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}


}
