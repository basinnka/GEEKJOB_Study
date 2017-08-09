<%-- 
    Document   : outputChallenge01602
    Created on : 2017/08/09, 14:17:16
    Author     : MAZHENHUA
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
          //totalの情報
          out.print("総額:"+request.getParameter("total")+"円"+"<br>");
          // countの情報
          out.print("個数:"+request.getParameter("count")+"個"+"<br>");
          // typeの情報
          out.print("商品種別:");
          
          if (Double.parseDouble(request.getParameter("type"))==3){
              out.print("その他");
          }else if (Double.parseDouble(request.getParameter("type"))==2){
              out.print("生鮮食品");
          }else{
              out.print("雑貨");
          }
          double tt=0.0;
          tt=Double.parseDouble(request.getParameter("total"))/Double.parseDouble(request.getParameter("count"));
          out.print("<br>一個当たりの値段:"+tt+"円");
          double pp=0.0;
          if (Double.parseDouble(request.getParameter("total"))>5000){
              pp=Double.parseDouble(request.getParameter("total"))*0.05;
          }else if (Double.parseDouble(request.getParameter("total"))>3000){
              pp=Double.parseDouble(request.getParameter("total"))*0.04;
          }else{
              pp=0;
          }
          out.print("<br>ポイント:"+pp);
      %>
    </body>
</html>
