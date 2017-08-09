<%--
    クエリストリングの利用
    Document   : Challenge01604
    Created on : 2017/08/08, 15:23:06
    Author     : MAZHENHUA
    課題：クエリストリングを利用して、以下の処理を実現してください。

      ○想定されるクエリストリング
      http://localhost:8080/対象ファイル.jsp?total=総額&count=個数&type=商品種別
      例）http://localhost:8080/対象ファイル.jsp?total=1500&count=10&type=2
        ⇒総額1500円、10個、商品種別は2

      1. 受け取った商品種別を以下の対応で日本語表示してください。
　    雑貨、2：生鮮食品、3:その他
　    例)typeが2だったら、「生鮮食品」

      2. 受け取った総額と個数から、１個当たりの値段を算出し、表示してください。

      3. 総額に応じたポイントが付きます。ポイントを計算し、表示してください。
    　 3000円以上で、4%
    　 5000円以上で、5%
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリングの利用</title>
    </head>
    <body>
        <form action="./outputChallenge01602.jsp" method="get" >
      <!-- formタグで括られた入力項目はこれら -->
      <%
          out.print("総額:");
      %>
      <!--テキストボックス-->
      <!--requiredは入力が必須の場合に使用する-->
      <input type="text" name="total" required>円
      <%
          out.print("<br>個数:");
      %>
      <input type="text" name="count" required>個
      <%
          out.print("<br>商品種別:");
      %>
      <input type="text" name="type" required>種
      <%
          out.print("<br>");
      %>
      <input type="submit">
      
      
      
      </form>
    </body>
</html>
