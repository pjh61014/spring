package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	@Qualifier("boarddao")
	BoardDAO dao;
	
	@Override
	public void insert(BoardDTO brd) {
		dao.insert(brd);

	}

	@Override
	public void update(BoardDTO brd) {
		// TODO Auto-generated method stub

	}

}
