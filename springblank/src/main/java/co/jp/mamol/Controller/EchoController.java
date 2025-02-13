package co.jp.mamol.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.mamol.Form.EchoForm;

@Controller
public class EchoController {

	@Autowired
	MessageSource messageSource;

	@ModelAttribute("echoForm") // Form指定
	public EchoForm setEchoForm() {

		EchoForm echoForm = new EchoForm();

		return echoForm;

	}

	@RequestMapping(value = "/")
	public String index() {

		return "input";
	}

	@RequestMapping(value = "/echo", method = RequestMethod.POST)

	public String echo(@Validated EchoForm form, BindingResult result, Model model) { // (6)

		//result.reject("key111");

		if (result.hasErrors()) {

			return "input";

		}

		String[] messparms = {"名前",form.getName()};

		String message = messageSource.getMessage("MES0001", messparms, Locale.JAPANESE);

		model.addAttribute("message", message);

		return "echo";

	}


}
