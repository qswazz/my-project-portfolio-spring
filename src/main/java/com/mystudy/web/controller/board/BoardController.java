package com.mystudy.web.controller.board;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mystudy.web.dao.BoardDAO;
import com.mystudy.web.entity.BoardModel;

@Controller
@RequestMapping("/board/")
public class BoardController
{

	@Autowired
	private BoardDAO boardDAO;
	
	
	@RequestMapping("list")
	public ModelAndView list() throws ClassNotFoundException, SQLException
	{
		ModelAndView mv = new ModelAndView("board/list");
		
		List<BoardModel> items = boardDAO.getItems("TITLE", "");
		
		mv.addObject("items", items);
		
		return mv;
	}
	
	
	@RequestMapping("detail")
	public ModelAndView detail(int id) throws ClassNotFoundException, SQLException
	{
		ModelAndView mv = new ModelAndView("board/detail");
		
		BoardModel selectedItem = boardDAO.getItem(id);
		
		mv.addObject("selectedItem", selectedItem);
		
		return mv;
	}


	@RequestMapping("newList")
	public String newList()
	{
		return "board/newList";
	}

}
