package com.mystudy.web.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.mystudy.web.entity.BoardModel;

public interface IBoardDAO
{
	void setDataSource(DataSource dataSource);
	
	
	List<BoardModel> getItems(String field, String query) throws ClassNotFoundException, SQLException;
	
	
	BoardModel getItem(int selectedID) throws ClassNotFoundException, SQLException;
	
	
	int insertItem(String title, String writerId, String content) throws ClassNotFoundException, SQLException;
	
}
