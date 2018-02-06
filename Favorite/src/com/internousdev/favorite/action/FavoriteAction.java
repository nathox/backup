package com.internousdev.favorite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.favorite.dao.FavoriteDAO;
import com.internousdev.favorite.dto.FavoriteDTO;
import com.opensymphony.xwork2.ActionSupport;


public class FavoriteAction {

	public Map<String,Object> session;

	private FavoriteDAO FavoriteDAO = new FavoriteDAO();
	private ArrayList<FavoriteDTO> favoriteList = new ArrayList<favoriteDTO>();
	private String deleteFlg;
	private String message;

	private static final String SUCCESS = null;
	private static final String ERROR = null;


	public String id ;
	public String user_id;
	public String product_id;
	public String regist_date;
	public Map<String, Object> session;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}










	public String execute() throws SQLException{
		String ret = ERROR;
		FavoriteDAO dao = new FavoriteDAO();
		FavoriteDTO dto = new FavoriteDTO();

		dto = dao.select(id,user_id,product_id,regist_date);
		if(id.equals(dto.getProduct_id())){
			if(id.equals(dto.getProduct_id())){
				ret = SUCCESS;
			}
		}

		session.put("product_id",dto.getProduct_id());
		return ret;
	}


		public String getId(){
			return id;

		}

		public void setId(String id){
			this.id = id;
		}

		public String getUser_id(){
			return user_id;

		}


		public void setProduct_id(String product_id){
			this.product_id = product_id;

		}

		public String getProduct_id(){
			return product_id;

		}


		public void setRegist_date(String regist_date){
			this.regist_date = regist_date;

		}

		public String getRegist_date(){
			return regist_date;

		}



		public Map<String, Object> getSession(){
			return session;
		}


		public void setSession(Map<String, Object> session){
			this.session = session;
		}

	}

















//2.
//package com.internousdev.favorite.action;
//
//import java.sql.SQLException;
//import java.util.Map;
//
//import com.internousdev.favorite.dao.FavoriteDAO;
//import com.internousdev.favorite.dto.FavoriteDTO;
//
//
//public class FavoriteAction {
//
//	private static final String SUCCESS = null;
//	private static final String ERROR = null;
//	private String id ;
//	private String user_id;
//	private String product_id;
//	private String regist_date;
//	private Map<String, Object> session;
//
//	public String execute() throws SQLException{
//		String ret = ERROR;
//		FavoriteDAO dao = new FavoriteDAO();
//		FavoriteDTO dto = new FavoriteDTO();
//
//		dto = dao.select(id,user_id,product_id,regist_date);
//		if(id.equals(dto.getProduct_id())){
//			if(id.equals(dto.getProduct_id())){
//				ret = SUCCESS;
//			}
//		}
//
//		session.put("product_id",dto.getProduct_id());
//		return ret;
//	}
//
//
//		public String getId(){
//			return id;
//
//		}
//
//		public void setId(String id){
//			this.id = id;
//		}
//
//		public String getUser_id(){
//			return user_id;
//
//		}
//
//
//		public void setProduct_id(String product_id){
//			this.product_id = product_id;
//
//		}
//
//		public String getProduct_id(){
//			return product_id;
//
//		}
//
//
//		public void setRegist_date(String regist_date){
//			this.regist_date = regist_date;
//
//		}
//
//		public String getRegist_date(){
//			return regist_date;
//
//		}
//
//
//
//		public Map<String, Object> getSession(){
//			return session;
//		}
//
//
//		public void setSession(Map<String, Object> session){
//			this.session = session;
//		}
//
//	}























//1.
//package com.internousdev.favorite.action;
//
//import java.sql.SQLException;
//import java.util.Map;
//
//import com.internousdev.favorite.dao.FavoriteDAO;
//import com.internousdev.favorite.dto.FavoriteDTO;
//
//
//public class FavoriteAction {
//
//	private static final String SUCCESS = null;
//	private static final String ERROR = null;
//	private String product_id ;
//	private String product_name;
//	private String product_name_kana;
//	private String category_id;
//	private Map<String, Object> session;
//	private String name;
//	private String password;
//
//	public String execute() throws SQLException{
//		String ret = ERROR;
//		FavoriteDAO dao = new FavoriteDAO();
//		FavoriteDTO dto = new FavoriteDTO();
//
//		dto = dao.select(product_id,product_name,product_name_kana,category_id);
//		if(product_id.equals(dto.getProduct_id())){
//			if(product_name.equals(dto.getProduct_name())){
//				ret = SUCCESS;
//			}
//		}
//
//		session.put("product_id",dto.getProduct_id());
//		return ret;
//	}
//
//
//		public String getName(){
//			return name;
//
//		}
//
//		public void setName(String name){
//			this.name = name;
//		}
//
//		public String getPassword(){
//			return password;
//
//		}
//
//
//		public void setPassword(String password){
//			this.password = password;
//
//		}
//
//		public Map<String, Object> getSession(){
//			return session;
//		}
//
//
//		public void setSession(Map<String, Object> session){
//			this.session = session;
//		}
//
//
//
//
//
//
//
//	}
