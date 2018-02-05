package com.internousdev.favorite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.favorite.dto.FavoriteDTO;
import com.internousdev.favorite.util.DBConnector;

public class FavoriteDAO {


	public FavoriteDTO select(String product_id,String product_name,String product_name_kana,String category_id) throws SQLException{
		FavoriteDTO dto=new FavoriteDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql="select * from user where user_name=? and password=?";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, product_id);
		ps.setString(2, product_name);
		ps.setString(3, product_name_kana);
		ps.setString(4, category_id);
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
			dto.setProduct_id(rs.getString("product_id"));
			dto.setProduct_name(rs.getString("product_name"));
			dto.getProduct_name_kana(rs.getString("product_name_kana"));
			dto.setCategory_id(rs.getString("category_id"));
		}


	}catch (SQLException e){
		e.printStackTrace();

	}finally{

		con.close();
	}

	return dto;

	}





}