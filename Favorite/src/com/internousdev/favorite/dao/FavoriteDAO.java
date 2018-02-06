package com.internousdev.favorite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.favorite.dto.FavoriteDTO;
import com.internousdev.favorite.util.DBConnector;

public class FavoriteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();




	public ArrayList<FavoriteDTO> getMyPageUserInfo(String item_transaction_id, String user_master_id)throws SQLException{
		ArrayList<FavoriteDTO> myPageDTO = new ArrayList<FavoriteDTO>();
		String sql = "SELECT ";


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,user_master_id);


	ResultSet resultSet = preparedStatement.executeQuery();

	while(resultSet.next()){
		FavoriteDTO dto = new FavoriteDTO();
		dto.setId(resultSet.getString("id"));
		dto.setUser_id(resultSet.getString("user_id"));
		dto.setProduct_id(resultSet.getString("product_id"));
		dto.setRegist_date(resultSet.getString("regist_date"));
		FavoriteDTO.add(dto);
	}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return FavoriteDTO;
}





	public FavoriteDTO select(String id, String user_id, String product_id, String regist_date) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}



















































//2.
//package com.internousdev.favorite.dao;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.internousdev.favorite.dto.FavoriteDTO;
//
//public class FavoriteDAO {
//
//	public static void main(String[] args){
//		List<String> list = new ArrayList<>();
//
//		list.add("id");
//		list.add("user_id");
//		list.add("product_id");
//		list.add("regist_date");
//
//
//		for(String s : list) {
//			System.out.println(s);
//		}
//
//		list.forEach(System.out::println);
//	}
//
//	public FavoriteDTO select(String id, String user_id, String product_id, String regist_date) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//
//}



























//1.
//
//package com.internousdev.favorite.dao;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.internousdev.favorite.dto.FavoriteDTO;
//import com.internousdev.favorite.util.DBConnector;
//
//public class FavoriteDAO {
//
//
//	public FavoriteDTO select(String product_id,String product_name,String product_name_kana,String category_id) throws SQLException{
//		FavoriteDTO dto=new FavoriteDTO();
//		DBConnector db = new DBConnector();
//		Connection con = db.getConnection();
//		String sql="select * favorite_info";
//
//	try{
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, product_id);
//		ps.setString(2, product_name);
//		ps.setString(3, product_name_kana);
//		ps.setString(4, category_id);
//		ResultSet rs = ps.executeQuery();
//
//		if(rs.next()){
//			dto.setProduct_id(rs.getString("product_id"));
//			dto.setProduct_name(rs.getString("product_name"));
//			dto.getProduct_name_kana(rs.getString("product_name_kana"));
//			dto.setCategory_id(rs.getString("category_id"));
//		}
//
//
//	}catch (SQLException e){
//		e.printStackTrace();
//
//	}finally{
//
//		con.close();
//	}
//
//	return dto;
//
//	}
//
//
//
//
//
