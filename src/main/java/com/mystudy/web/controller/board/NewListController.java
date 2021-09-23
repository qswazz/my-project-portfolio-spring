package com.mystudy.web.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mystudy.web.dao.BoardDAO;
import com.mystudy.web.service.BoardService;

public class NewListController implements Controller
{

	private BoardDAO boardDAO;
	
	
	public void setBoardDAO(BoardDAO boardDAO)
	{
		this.boardDAO = boardDAO;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mv = new ModelAndView("board/newList");
		
		return mv;
	}

}
