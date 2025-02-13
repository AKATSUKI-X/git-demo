package co.jp.mamol.Repository;

import co.jp.mamol.Dto.UserDto;

public interface UserRepository {
			//test1  DA2001	select user information according to userid
			public UserDto findUserById(Integer user_id_seq);

			//test1 DA2002	userLogin
			public boolean regist(UserDto userDto);

			//test1 Da2003 get userid
			public int getIdSeq();

}
