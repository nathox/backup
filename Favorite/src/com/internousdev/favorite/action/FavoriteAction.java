package com.internousdev.favorite.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.favorite.dao.FavoriteDAO;
import com.internousdev.favorite.dto.FavoriteDTO;


public class FavoriteAction {

	private static final String SUCCESS = null;
	private static final String ERROR = null;
	private String product_id ;
	private String product_name;
	private String product_name_kana;
	private String category_id;
	private Map<String, Object> session;
	private String name;
	private String password;

	public String execute() throws SQLException{
		String ret = ERROR;
		FavoriteDAO dao = new FavoriteDAO();
		FavoriteDTO dto = new FavoriteDTO();

		dto = dao.select(product_id,product_name,product_name_kana,category_id);
		if(product_id.equals(dto.getProduct_id())){
			if(product_name.equals(dto.getProduct_name())){
				ret = SUCCESS;
			}
		}

		session.put("product_id",dto.getProduct_id());
		return ret;
	}


		public String getName(){
			return name;

		}

		public void setName(String name){
			this.name = name;
		}

		public String getPassword(){
			return password;

		}


		public void setPassword(String password){
			this.password = password;

		}

		public Map<String, Object> getSession(){
			return session;
		}


		public void setSession(Map<String, Object> session){
			this.session = session;
		}







	}

