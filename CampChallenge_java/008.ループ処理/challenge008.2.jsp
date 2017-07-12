<%-- 
    Document   : challenge008.2
    Created on : 2017/07/12, 15:48:59
    Author     : MAZHENHUA
    Title      : 課題for文2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //for文を利用して、適当な変数へ文字連結を行い、中に"A"が30個入った状態にしてください。
    //希望打30层
    int lay=30;
    //表示有多少层
    for(int i=1;i<=lay;i++){    
        //打印"A"
        for(int j=1;j<=i;j++){
            out.print("A");
        }
        //打印出一个换行
        out.print("</br>");
    }
    
    
    
    %>
