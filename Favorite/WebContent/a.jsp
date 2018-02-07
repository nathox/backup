<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:iterator value="favoriteList">
		<a href="<s:url action="ProductDetailsAction">

		<s:param name="product_id" value="%{product_id}"/>
		</s:url>">

			<span>id:<s:property value="id" /></span>
			<span>userid<s:property value="userid" /></span>
			<span>productid<s:property value="productid" /></span>
			<span>registdate<s:property value="registdate" /></span>

			<img class="image" src="<s:property value='image_file_path'/>" >
			<s:hidden name="product_id" value="%{product_id}"/>

		</a>





</s:iterator>
	<form name="frmMove">
		<script language=javascript>
			function obakasannemou() {
				objChk = frmMove.chkMove //チェックボックスオブジェクトを参照
				str = ""; //チェック内容を代入する変数
				for (i = 0; i < objChk.length; i++) {
					if (objChk[i].checked)
						str += objChk[i].value
				}
				switch (str) {
				case "1":
					location.href = "https://www.yahoo.co.jp/";
					break;
				case "2":
					location.href = "https://www.google.co.jp";
					break;

				case "3":
					location.href = "https://www.biglobe.ne.jp/";
					break;

				case "4":
					location.href = "https://www.goo.ne.jp/";
					break;

				case "5":
					location.href = "https://www.google.co.jp/maps";
					break;

				}
			}
		</script>

		お気に入り画面
		<p>★お気に入りリスト★</p>

		<p>
			<br> <input type="checkbox" value="1" name="chkMove">1.商品
			<br>
			<input type="checkbox" value="2" name="chkMove">2.商品 <br>
			<input type="checkbox" value="3" name="chkMove">3.商品 <br>
			<input type="checkbox" value="4" name="chkMove">4.商品 <br>
			<input type="checkbox" value="5" name="chkMove">5.商品
		</p>

		<p>
			<br>
			<input type="button" value="商品ページへ" onclick="obakasannemou()">


			<INPUT TYPE="button" VALUE="商品一覧へ戻る"
				onClick="location.href='https://www.yahoo.co.jp/'"> <INPUT
				TYPE="button" VALUE="マイページ"
				onClick="location.href='https://www.yahoo.co.jp/'"> <INPUT
				TYPE="button" VALUE="削除" onClick="location.href=''">



		</p>
	</form>





</body>
</html>