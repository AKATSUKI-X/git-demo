package co.jp.mamol.Repository;

import java.util.List;

import co.jp.mamol.Dto.BookDto;
import co.jp.mamol.Dto.BookSearchCondition;


public interface BookRepository {

	//書籍検索
	public List<BookDto> bookSearch(BookSearchCondition con);

	//総件数取得
	public int getCount(BookSearchCondition con);

}
