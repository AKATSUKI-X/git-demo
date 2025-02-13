package co.jp.mamol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.jp.mamol.Dto.UserDto;
import co.jp.mamol.Service.UserService;
import co.jp.mamol.Util.BusinessException;

@Controller
@RequestMapping(value = "/userajax")
public class AjaxUserController {
	@Autowired
	MessageSource messageSource;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/input")
	public String userInput(Model model) {
		return "ajax_userInput";
	}

	@RequestMapping(value = "/info")
	@ResponseBody
	public  UserDto userInfo( @RequestBody String searchid) throws BusinessException {

		UserDto userDto = null;

		userDto = userService.findUser(Integer.parseInt(searchid));

		return userDto;

	}


}
