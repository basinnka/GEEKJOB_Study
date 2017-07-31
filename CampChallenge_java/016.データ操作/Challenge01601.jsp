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
        <title>JSP Page</title>
    </head>
    <body>
      <form action="./test.jsp" method="post">
      <!-- formタグで括られた入力項目はこれら -->
      <%
          out.print("名前:");
      %>
      <!--テキストボックス-->
      <input type="text" name="txtName">
      <%
          out.print("<br>"+"性別:");
      %>
      <!--ラジオボタン-->
      <input type="radio" name="rdoSample">
      <%
          out.print("男性");
      %>
      <!--ラジオボタン-->
      <input type="radio" name="rdoSample">
      <%
          out.print("女性"+"<br>");
      %>
      <%
          out.print("趣味:"+"<br>");
      %>
      <!--複数行テキストボックス-->
      <textarea name="mulText"></textarea>
      </form>
        
    </body>
</html>
