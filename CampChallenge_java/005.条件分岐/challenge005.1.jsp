<%-- 
    Document   : challenge005.1
    Created on : 2017/07/12, 11:04:05
    Author     : MAZHENHUA
    Tittle     :変数の宣言と表示（if文）の課題
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int num=1;
    
    if(num==1){
        out.println("1です!");
    }else if(num==2){
        out.println("プログラミングキャンプ!");
    }else{
        out.print("その他です!");
    }
    
    %>
