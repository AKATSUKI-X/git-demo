package co.jp.mamol.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jp.mamol.Dto.BookSearchCondition;
import co.jp.mamol.Form.BookSearchForm;
import co.jp.mamol.Service.BookSearchService;

@Controller
@RequestMapping(value = "/booksearch")
public class BookSearchController {

	@Autowired
	MessageSource messageSource;

	@Autowired
	BookSearchService bookSearchService;

	@Autowired
	HttpSession session;

	@ModelAttribute("bookSearchForm")
	public BookSearchForm setForm() {

		BookSearchForm form = new BookSearchForm();
		return form;
	}

	@RequestMapping(value = "/init")
	public String init() {

		return "booksearch";
	}

	@RequestMapping(value = "/search")
	public String search(BookSearchForm form, Model model) {

		session.setAttribute("BookSearchCon", form.getCondition());

		form.setBookList(bookSearchService.bookSearch(form.getCondition(), 1, 10));

		int i = bookSearchService.getTotalPage(form.getCondition(), 10);

		form.setTotalPage(i);
		form.setPageNum(1);

		return "booksearch";
	}

	@RequestMapping(value = "/paging")
	public String paging( BookSearchForm form, @RequestParam("pageNum") Integer pagenum) {

		BookSearchCondition searchcondition = (BookSearchCondition) session.getAttribute("BookSearchCon");

		form.setBookList(bookSearchService.bookSearch(searchcondition, pagenum, 10));

		form.setTotalPage(bookSearchService.getTotalPage(searchcondition, 10));

		form.setPageNum(pagenum);

		return "booksearch";
	}

}
