package co.jp.mamol.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import co.jp.mamol.Dto.UserDto;
import co.jp.mamol.Repository.UserRepository;
import co.jp.mamol.Util.BusinessException;
import co.jp.mamol.Util.StaticSample;
import co.jp.mamol.Util.TestSample;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserService userService;

	@Test
	public void findUserTest001() {

		Integer user_id_seq = 100;


		doReturn(null).when(userRepository).findUserById(user_id_seq);

		String expected = "co.jp.mamol.Util.BusinessException";
		String actual = "";
		try {
			userService.findUser(user_id_seq);
		} catch (BusinessException e) {
			actual = e.getClass().getName();

		}

		assertEquals(expected, actual);
	}

	@Test
	public void findUserTest002() {
		UserDto userDto = new UserDto();
		userDto.setUser_id_seq(100);
		userDto.setName("Tom");

		Integer user_id_seq = 100;

		doReturn(userDto).when(userRepository).findUserById(user_id_seq);

		UserDto actual = null;
		try {
			actual = userService.findUser(user_id_seq);
		} catch (BusinessException e) {
			fail();
		}

		assertEquals(userDto, actual);

	}


	//static
	@Test
	public void test101() throws Exception {
		MockedStatic<StaticSample> mock = Mockito.mockStatic(StaticSample.class);

		mock.when(() -> StaticSample.sMethod(any(), any())).thenReturn("OKOK");

		assertEquals(userService.methodB("aaa"), "OKOK");

	}

	//private 直接呼び出す
	@Test
	public void test102() throws Exception {

		Method method = UserService.class.getDeclaredMethod("methodA", String.class);

		method.setAccessible(true);

		String actual = (String) method.invoke(userService, "hoge");

		assertEquals("hoge", actual);

	}


	//local 変数(コンストラクタのモック化)
	@Test
	public void test104() {

		mockConstruction(TestSample.class,

				(mock, ctx) -> {

					doReturn("11111").when(mock).methodA(anyString());

					doReturn("22222").when(mock).methodB(anyString());

				}

		);

		assertEquals("1111122222", userService.methodD("aaaa"));

	}

}
