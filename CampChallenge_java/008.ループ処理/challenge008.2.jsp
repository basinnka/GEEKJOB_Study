<%-- 
    Document   : challenge008.2
    Created on : 2017/07/13, 11:07:40
    Author     : MAZHENHUA
    Title      : 課題for文2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //for文を利用して、適当な変数へ文字連結を行い、中に"A"が30個入った状態にしてください。
    
    String mozi="";
    String mozi2="";
    for(int i=1;i<=30;i++){
        mozi=mozi+"A";
        mozi2="回目:";
        out.print(i+mozi2+mozi+"</br>");
    }
    %>
    
