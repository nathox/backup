<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

table{
border:0px solid ;

}




</head>
<body>

 <table border="1" cellspacing="0">
        <thead id="hoge-head">
            <tr>
                <td></td>
                <td>No</td>
                <td>商品</td>
                <td>単価</td>
                <td>在庫</td>
                <td>在庫</td>
                <td>在庫</td>
                <td>在庫</td>
            </tr>
        </thead>
        <tbody id="hoge-body">
            <tr>
                <td><input type="checkbox" onclick="remove_row(this)"></td>
                <td>1</td>
                <td>りんご</td>
                <td>80</td>
                <td>120</td>
                <td>120</td>
                <td>120</td>
                <td>120</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>2</td>
                <td>みかん</td>
                <td>45</td>
                <td>88</td>
                <td>45</td>
                <td>88</td>
                <td>45</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>3</td>
                <td>いちじく</td>
                <td>105</td>
                <td>311</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>4</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
            </tr>

            <tr>
                <td><input type="checkbox"></td>
                <td>5</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
            </tr>

            <tr>
                <td><input type="checkbox"></td>
                <td>6</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
            </tr>

            <tr>
                <td><input type="checkbox"></td>
                <td>7</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
                <td>ぶどう</td>
                <td>72</td>
                <td>112</td>
            </tr>

        </tbody>
    </table>





<input class="btn1" type="button" value="削除" onclick="remove_row(this)">





</body>
</html>