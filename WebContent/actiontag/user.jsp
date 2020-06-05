<%@page import="domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- user 클래스 사용하고 싶다면> --%>
    <jsp:useBean id="user" class ="domain.User"/>
    <jsp:setProperty property="name" name="user" value="홍길동"/>
    <h1><jsp:getProperty property="name" name="user"/></h1>
    <% 
    /*User user = new User();
     user.setName("홍길동"); */
    %>
<%-- <h1><%=user.getName() %></h1> --%>