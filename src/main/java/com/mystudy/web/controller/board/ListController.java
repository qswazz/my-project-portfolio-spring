package com.mystudy.web.controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mystudy.web.dao.BoardDAO;
import com.mystudy.web.entity.BoardModel;

public class ListController implements Controller
{

	private BoardDAO boardDAO;
	
	
	public void setBoardDAO(BoardDAO boardDAO)
	{
		this.boardDAO = boardDAO;
	}

	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{	
		ModelAndView mv = new ModelAndView("board/list");
	
		List<BoardModel> items = boardDAO.getItems("TITLE", "");
		mv.addObject("items", items);
		
		return mv;
	}

}
