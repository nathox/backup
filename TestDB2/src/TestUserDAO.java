
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class TestUserDAO {

//	String name = "";
//	String password = "";
//public void select(String name,String password){
//	DBConnector db = new DBConnector();
//	Connection con = db.getConnection();
//
//	String sql ="select * fron test_table where user_name=? and password=?";
//	try {
//
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, name);
//		ps.setString (2, password);
//		ResultSet rs = ps. executeQuery();
//		if (rs.next()){
//			System.out.println(rs.getString("user_name"));
//			System.out.println(rs.getString("password"));
//		}
//	}	catch (SQLException e) {
//		e.printStackTrace();
//		}
//		try{
//			con.close();
//		}   catch (SQLException e){
//			e.printStackTrace();
//
//
//	}
//}


//	public void selectAll(){
//		DBConnector db = new DBConnector();
//		Connection con = db.getConnection();
//
//		String sql ="select * fron test_table";
//		try{
//			PreparedStatement ps = con.prepareStatement(sql);
//			ResultSet rs=ps.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getString("user_name"));
//				System.out.println(rs.getString("password"));
//			}
//		} catch (SQLException e ){
//			e.printStackTrace();
//
//		}
//		try {
//			con.close();
//
//
//		} catch (SQLException e ){
//			e.printStackTrace();
//
//		}
//
//
//	}
//
//}



//public void selectByName(String name){
//	DBConnector db = new DBConnector();
//	Connection con = db.getConnection();
//
//	String sql ="select * test_table where user_name=?";
//	try{
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, name);
//		ResultSet rs=ps.executeQuery();
//		while (rs.next()) {
//			System.out.println(rs.getString("user_name"));
//			System.out.println(rs.getString("password"));
//		}
//	} catch (SQLException e ){
//		e.printStackTrace();
//
//	}
//	try {
//		con.close();
//
//
//	} catch (SQLException e ){
//		e.printStackTrace();
//
//	}
//
//
//}
//
//}

//データベースの接続ページ１１


//public void selectByPassword(String password){
//	DBConnector db = new DBConnector();
//	Connection con = db.getConnection();
//
//	String sql ="select * from test_table where password=?";
//	try{
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, password);
//		ResultSet rs=ps.executeQuery();
//		while (rs.next()) {
//			System.out.println(rs.getString("user_name"));
//			System.out.println(rs.getString("password"));
//		}
//	} catch (SQLException e ){
//		e.printStackTrace();
//
//	}
//	try {
//		con.close();
//
//
//	} catch (SQLException e ){
//		e.printStackTrace();
//
//	}
//
//
//}
//
//}
///////////////////////////////



//データベースの接続　ページ１１～１２


//public void updateUserNameByUserName(String oldName,String newName){
//	DBConnector db = new DBConnector();
//	Connection con = db.getConnection();
//
//	String sql ="update test_table set user_name=? where user_name=?";
//	try{
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, newName);
//		ps.setString(2, oldName);
//		int i=ps.executeUpdate();
//		if (i>0){
//			System.out.println("件更新されました");
//		}else{
//			System.out.println("該当するデータはありませんでした");
//		}
//	}catch (SQLException e) {
//		e.printStackTrace();
//	}
//
//	try {
//		con.close();
//
//
//	} catch (SQLException e ){
//		e.printStackTrace();
//
//	}
//
//
//}



//////////////////////////終了




/////////////////////////javaとデータベースの接続13ページ

public void delete(String name){
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	String sql ="update test_table set user_name=? where user_name=?";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		//ps.setString(2, oldName);
		int i=ps.executeUpdate();
		if (i>0){
			System.out.println(i + "件削除されました");
//			System.out.println("件更新されました");
//		}else{
//			System.out.println("該当するデータはありませんでした");
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}

	try {
		con.close();


	} catch (SQLException e ){
		e.printStackTrace();

	}


}

}










































