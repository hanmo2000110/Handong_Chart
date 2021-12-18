package com.mycom.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list",boardService.getBoardList());
		return "posts";
	}
	
	@RequestMapping(value = "/board/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	@RequestMapping(value = "/board/addOk", method = {RequestMethod.POST,RequestMethod.GET})
	public String addSong(BoardVO vo,Model model) {
		boardService.insertBoard(vo);
		model.addAttribute("list",boardService.getBoardList());
		return "posts";
	}
	
	@RequestMapping(value = "/board/editok", method = {RequestMethod.POST,RequestMethod.GET})
	public String editSong(BoardVO vo,Model model) {
		boardService.updateBoard(vo);
		model.addAttribute("list",boardService.getBoardList());
		return "posts";
	}
	
	@RequestMapping(value = "/board/deleteok/{id}", method = {RequestMethod.GET,RequestMethod.POST})
	public String deletesong(Model model,@PathVariable ("id") int id) {
		boardService.deleteBoard(id);
		System.out.print(id);
		model.addAttribute("list",boardService.getBoardList());
		return "posts";
	}
	
	@RequestMapping(value = "/board/edit/{id}", method = {RequestMethod.GET,RequestMethod.POST})
	public String editsong(@PathVariable ("id") int id) {
		return "editform.jsp?iddd=" + id;
	}
	
	@RequestMapping(value = "/board/editform/{id}", method = RequestMethod.GET)
    public String update(BoardVO vo,@PathVariable ("id") int id, Model model) {
		BoardVO boardDto = boardService.getBoard(id);
		System.out.print(boardDto.getCreator());
        model.addAttribute("song", boardDto);
        return "editform";
    }
}