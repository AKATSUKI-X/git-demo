package co.jp.mamol.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.mamol.Dto.UserDto;
import co.jp.mamol.Repository.UserRepository;
import co.jp.mamol.Util.BusinessException;
import co.jp.mamol.Util.StaticSample;
import co.jp.mamol.Util.TestSample;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto findUser(Integer user_id_seq) throws BusinessException {
		UserDto userDto = userRepository.findUserById(user_id_seq);

		if (userDto == null) {

			throw new BusinessException("ユーザ存在しません");

		}

		return userDto;


	}

	public String methodA(String s) {

		return s;
	}

	public String methodB(String s) {

		return StaticSample.sMethod("aaa", "bbb");
	}

	public String methodC(String s) {

		return methodA(s);

	}

	public String methodD(String s) {

		TestSample ts = new TestSample("aaa", "bbb");

		return ts.methodA("a") + ts.methodB("b");

	}

}
