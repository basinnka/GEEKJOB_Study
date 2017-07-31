<%--
    入力フィールド
    Document   : Challenge01601
    Created on : 2017/07/31, 14:06:22
    Author     : MAZHENHUA
    課題：以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
        ・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールド</title>
    </head>
    <body>
      <form action="./outputchallenge01601.jsp" method="post">
      <!-- formタグで括られた入力項目はこれら -->
      <%
          out.print("名前:");
      %>
      <!--テキストボックス-->
      <!--requiredは入力が必須の場合に使用する-->
      <input type="text" name="txtName" required>
      <%
          out.print("<br>"+"性別:");
      %>
      
      <!--ラジオボタン-->
      <input type="radio" name="rdoSample" value="男性" required>男性
      
      <!--ラジオボタン-->
      <input type="radio" name="rdoSample" value="女性" required>女性
      
      
      <%
          out.print("<br>"+"趣味:"+"<br>");
      %>
      <!--複数行テキストボックス-->
      <textarea name="mulText" required></textarea>
      <%
          out.print("<br>"+"<br>");
      %>
      <!--送信ボタン　-->
      <input type="submit" name="btnSubmit">
      </form>
      
        
    </body>
</html>
