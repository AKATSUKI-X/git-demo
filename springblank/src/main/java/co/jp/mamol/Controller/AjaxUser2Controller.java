package co.jp.mamol.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.jp.mamol.Dto.UserDto;
import co.jp.mamol.Service.UserService;
import co.jp.mamol.Util.BusinessException;

@Controller
@RequestMapping(value = "/user2ajax")
public class AjaxUser2Controller {
	@Autowired
	MessageSource messageSource;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/input")
	public String userInput(Model model) {
		return "ajax_user2Input";
	}

	@RequestMapping(value = "/info")
	@ResponseBody
	public  UserDto userInfo(@RequestBody int searchid) throws BusinessException {
		UserDto userDto = null;

			userDto = userService.findUser(searchid);

		return userDto;
	}

	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public List<String> handleHttpBusinessException(BusinessException e) {

		String message = e.getMessage();
		List<String> megs = new ArrayList<String>();
		megs.add(message);
		megs.add("日本語hogehoge");

		return megs;
	}

}
