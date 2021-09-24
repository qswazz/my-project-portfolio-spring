package com.mystudy.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.mystudy.web.entity.BoardModel;

public interface IBoardDAO
{
	List<BoardModel> getItems(String field, String query) throws ClassNotFoundException, SQLException;
	
	
	BoardModel getItem(int selectedID) throws ClassNotFoundException, SQLException;
	
	
	int insertItem(String title, String writerId, String content) throws ClassNotFoundException, SQLException;
	
}
