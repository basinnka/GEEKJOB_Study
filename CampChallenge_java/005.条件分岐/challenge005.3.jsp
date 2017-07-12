<%-- 
    Document   : challenge005.3
    Created on : 2017/07/12, 12:44:34
    Author     : MAZHENHUA
    Title      : switch文2の課題
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    char kamoku ='A';
    
    switch (kamoku){
        case 'A':
            out.println("英語");
            break;
        case 'あ':
            out.println("日本語");
            break;
        default:
            out.println();
            break;
        
    }
    %>
