package com.internousdev.cherry.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.cherry.dao.MyPageDAO;
import com.internousdev.cherry.dto.MyPageDTO;
import com.internousdev.cherry.util.ErrorMessageConstants;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware, ErrorMessageConstants {

	/**
	 * 1.ログイン状態か確認(sessionにuserIdがあればログイン状態)
	 * 2.未ログインならhome画面に返す
	 * 3.ログイン状態ならユーザー登録情報を取得
	 * @param userId
	 */

	// userId格納
	private String userId;
	// session情報格納
	private Map<String, Object> session;
	// ログイン情報格納DTO
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	// エラーメッセージ
	private String message;

	public String execute() {
		/*---------------------------------------------------------
		 セッション情報取得
		---------------------------------------------------------*/
		if (!(session.containsKey("userId"))) {

			setMessage("このサービスをご利用になるにはログインしてください。");

		}
		String result = ERROR;

		/*---------------------------------------------------------
		   test用
		 ---------------------------------------------------------*/
		// 暫定でセッション値セット//
		// session.put("loginFlg",true);
		// session.put("userId", "a");

		// ログインユーザーのカート情報を引き出す
		// if(session.containsKey("useId") && (boolean)
		// session.get("loginFlg")){

		/*---------------------------------------------------------
		    ユーザー情報取得
		    @param userId
		 ---------------------------------------------------------*/
		if (session.containsKey("userId")) {
			userId = session.get("userId").toString();
			MyPageDAO dao = new MyPageDAO();

	    /*---------------------------------------------------------
			ユーザー情報をリストで受け取り
			リストにデータが入っていたらSUCCESS
		---------------------------------------------------------*/
			myPageList = dao.getUserInfo(userId);
			if (myPageList.size() > 0) {
				result = SUCCESS;
			}
		}
		return result;
	}

	/**
	 * セッション情報を取得するメソッド
	 *
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 *
	 * @param session
	 */
	public void setSession1(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 配列化されたユーザー情報を取得するメソッド
	 *
	 * @return UserList
	 */
	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}

	/**
	 * DTOに格納された情報をmyPageListに格納するメソッド
	 *
	 * @param userList
	 */
	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 *
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 *
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * セッション情報を格納するメソッド
	 *
	 * @param arg0
	 */
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 *
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}