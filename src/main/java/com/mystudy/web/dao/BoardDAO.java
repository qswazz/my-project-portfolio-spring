package com.mystudy.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystudy.web.entity.BoardModel;

@Service
public class BoardDAO implements IBoardDAO
{
	@Autowired
	private DataSource dataSource;
	
	

	public List<BoardModel> getItems(String field, String query) throws ClassNotFoundException, SQLException
	{
		String sql = "SELECT * FROM NOTICE WHERE " + field + " LIKE ?";

		Connection con = dataSource.getConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%" + query + "%");
		
		ResultSet rs = st.executeQuery();
		
		List<BoardModel> result = new ArrayList<BoardModel>();
		
		while(rs.next())
		{
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("HIT");
			
			BoardModel listModel = new BoardModel(id, title, writerId, regDate, content, hit);
			
			result.add(listModel);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return result;
	}
	
	
	public BoardModel getItem(int selectedID) throws ClassNotFoundException, SQLException
	{
		String sql = "SELECT * FROM NOTICE WHERE ID = '" + selectedID + "'";

		Connection con = dataSource.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		BoardModel result = new BoardModel(); 
		
		while(rs.next())
		{
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("HIT");
			
			result.setId(id);
			result.setTitle(title);
			result.setWriterId(writerId);
			result.setRegDate(regDate);
			result.setContent(content);
			result.setHit(hit);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return result;
	}
	
	
	public int insertItem(String title, String writerId, String content) throws ClassNotFoundException, SQLException
	{
		String sql = "INSERT INTO NOTICE (title, writerId, regDate, content) VALUES (?, ?, ?, ?)";

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, writerId);
		pstmt.setString(3, content);
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return result;
	}
	
	
}
