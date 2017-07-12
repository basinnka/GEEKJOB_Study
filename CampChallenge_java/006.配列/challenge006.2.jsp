<%-- 
    Document   : challenge006.2
    Created on : 2017/07/12, 13:46:45
    Author     : MAZHENHUA
    Title      : 課題配列の変更
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<String> data = new ArrayList<String>();
    data.add("10");
    data.add("100");
    data.add("soeda");
    data.add("hayashi");
    data.add("-20");
    data.add("118");
    data.add("END");
    
    data.set(2, "33");
    
    
    
    


    %>
