package board.service;

import board.dto.BoardDTO;

public interface BoardService {
	
	//게시물 등록
	void insert (BoardDTO brd);
	
	//게시물 갱신
	void update (BoardDTO brd);
}
