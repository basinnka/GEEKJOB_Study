<%-- 
    HTMLの入力データの取得と表示
    Document   : outputchallenge01601
    Created on : 2017/07/31, 15:20:44
    Author     : MAZHENHUA
    課題：以下の機能を実装してください。
        「入力フィールド」の課題で作成したHTMLの入力データを取得し、画面に表示する
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTMLの入力データの取得と表示</title>
    </head>
    <body>
        <%
          out.print("<br><br>");
          //受け取るパラメータの文字コード
          request.setCharacterEncoding("UTF-8");
          //テキストボックスの情報
          out.print(request.getParameter("txtName")+"<br>");
          // ラジオボタンの情報
          out.print(request.getParameter("rdoSample")+"<br>");
          // テキストエリアの情報
          out.print(request.getParameter("mulText")+"<br>");
      %>
    </body>
</html>
