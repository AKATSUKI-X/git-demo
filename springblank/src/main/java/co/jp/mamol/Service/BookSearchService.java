package co.jp.mamol.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.mamol.Dto.BookDto;
import co.jp.mamol.Dto.BookSearchCondition;
import co.jp.mamol.Repository.BookRepository;


@Service
public class BookSearchService {
	
	@Autowired
	BookRepository bookDao;

	public int getTotalPage(BookSearchCondition condition, int pageSize) {

		int total = bookDao.getCount(condition);

		int totalPage=total/pageSize;

		if (total % pageSize != 0) {

			totalPage++;

		}

		return totalPage;
	}

	//BL0008 T2 書籍検索
	public List<BookDto> bookSearch(BookSearchCondition condition, int pageNum, int pageSize) {

		condition.setStartNo((pageNum - 1) * pageSize + 1);
		condition.setEndNo(pageNum * pageSize);

		List<BookDto> bookList = bookDao.bookSearch(condition);

		return bookList;
	}
}
