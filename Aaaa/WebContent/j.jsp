<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

MyDBAccess db = new MyDBAccess();

// データベースへのアクセス
db.open();

// メンバーを取得
ResultSet rs = db.getResultSet("select * from member");

// メンバー一覧表示用のテーブル
String tableHTML = "<table border=1>";
tableHTML += "<tr bgcolor=\"000080\"><td><font color=\"white\">No</font></td>"
    + "<td><font color=\"white\">名前</font></td>"
    + "<td><font color=\"white\">数</font></td>";

// 取得された各結果に対しての処理
while(rs.next()) {

    int id = rs.getInt("No"); // メンバーIDを取得
    String name = rs.getString("name"); // メンバー名を取得
    String suu = rs.getString("suu"); // メンバー名(カナ)を取得

    // 文字コードを EUC_JP からUnicode へ変換
    name = new String(name.getBytes("8859_1"), "EUC_JP");
    kana = new String(kana.getBytes("8859_1"), "EUC_JP");

    // テーブル用HTMLを作成
    tableHTML += "<tr><td align=\"right\">" + no + "</td>"
              + "<td>" + name + "</td><td>" + suu + "</td></tr>";
}

tableHTML += "</table>";

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><title>データベースへのアクセス</title></head>
<body>
<p>-- データベースへのアクセス --</p>
<p>
<b>メンバーの一覧</b><br>

</p>












</body>
</html>