<%-- 
    Document   : challenge003.1
    Created on : 2017/07/11, 18:17:53
    Author     : MAZHENHUA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int num1=10;
    int num2=20;
    final int num3=30;
    final int num4=40;
    int num5;
    int num6;
    int num7;
    int num8;
    double num9;
    
    out.print(num1+"<br>");
    out.print(num2+"<br>");
    out.print(num3+"<br>");
    out.print(num4+"<br>");
    
    //足し算
    num5=num1+num2;
    //引き算
    num6=num3-num2;
    //掛け算
    num7=num5*num6;
    //割り算
    num8=num7/num1;
    //剰余算
    num9=num7%num4;
    
    
    out.print(num5+"<br>");
    out.print(num6+"<br>");
    out.print(num7+"<br>");
    out.print(num8+"<br>");
    out.print(num1+"<br>");
    out.print(num9+"<br>");
    
%>
