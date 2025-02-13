package co.jp.mamol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jp.mamol.Dto.UserDto;
import co.jp.mamol.Form.UserForm;
import co.jp.mamol.Service.UserService;
import co.jp.mamol.Util.BusinessException;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	MessageSource messageSource;

	@Autowired
	UserService userService;

	@ModelAttribute("userForm") // Form指定
	public UserForm setForm() {
		UserForm userForm = new UserForm();
		return userForm;
	}

	@RequestMapping(value = "/input")
	public String userInput(Model model) {
		return "userInput";
	}

	@RequestMapping(value = "/info")
	public String userInfo(@Validated UserForm form, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "userInput";
		}

		UserDto userDto = null;

		try {
			userDto = userService.findUser(Integer.parseInt(form.getUserid()));
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
		}

		form.setUserDto(userDto);

		return "userInput";
	}
}
