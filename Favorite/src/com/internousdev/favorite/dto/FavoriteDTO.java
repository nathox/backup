package com.internousdev.favorite.dto;

public class FavoriteDTO {

	private int id;
	private String product_id;
	private String product_name;
	private String product_name_kana;
	private String category_id;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}


	public String getProduct_id(){
		return product_id;
	}

	public void setProduct_id(String product_id){
		this.product_id = product_id;
	}


	public String getProduct_name(){
		return product_name;
	}

	public void setProduct_name(String product_name){
		this.product_name = product_name;
	}

	public String getProduct_name_kana(String product_name_kana){
		return product_name_kana;
	}

	public void setCategory_id(String category_id){
		this.category_id = category_id;
	}










}

