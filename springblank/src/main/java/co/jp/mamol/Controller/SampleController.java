package co.jp.mamol.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping(value = "/sample/init")
	public String init(Model model) {

		return "sample";
	}

	@RequestMapping(value = "/sample/change")
	@ResponseBody
	public String change(String inputvalue) {

		//inputvalueは画面から受け取ったパラメータで
		//それで検索を行い、resultに設定する。

        String result = inputvalue+"kkk";


		return result;
	}

}
