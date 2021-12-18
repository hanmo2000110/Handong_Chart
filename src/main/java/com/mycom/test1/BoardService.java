package com.mycom.test1;

import java.util.List;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int deleteBoard(int n);
	public int updateBoard(BoardVO vo);
	public BoardVO getBoard(int seq);
	public List<BoardVO> getBoardList();

}