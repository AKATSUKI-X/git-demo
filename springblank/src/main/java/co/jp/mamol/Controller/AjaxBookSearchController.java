package co.jp.mamol.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.jp.mamol.Dto.BookDto;
import co.jp.mamol.Dto.BookSearchCondition;
import co.jp.mamol.Service.BookSearchService;


@Controller
@RequestMapping(value = "/ajaxbooksearch")
public class AjaxBookSearchController {

	@Autowired
	HttpSession session;

	@Autowired
	BookSearchService bookSearchService;

	@RequestMapping(value = "/init")
	public String init(Model model) {

		return "ajax_booksearch";

	}

	@RequestMapping(value = "/search")
	@ResponseBody
	//@CrossOrigin
	public List<BookDto> search(@RequestBody BookSearchCondition bsc) {

		List<BookDto> list = bookSearchService.bookSearch(bsc, 1, 10);

		return list;
	}




}
