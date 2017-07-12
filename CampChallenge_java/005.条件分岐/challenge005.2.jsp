<%-- 
    Document   : challenge005.2
    Created on : 2017/07/12, 12:01:30
    Author     : MAZHENHUA
    Title      : switch文1の課題
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int num=1;
    
    switch (num){
        case 1:
            out.println("one");
            break;
        case 2:
            out.println("two");
            break;
        default:
            out.println("想定外");
            break;
    }
    %>
