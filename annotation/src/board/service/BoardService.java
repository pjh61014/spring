package board.service;

import board.dto.BoardDTO;

public interface BoardService {
	
	//�Խù� ���
	void insert (BoardDTO brd);
	
	//�Խù� ����
	void update (BoardDTO brd);
}
