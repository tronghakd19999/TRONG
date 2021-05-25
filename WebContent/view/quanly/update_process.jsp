<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page import="java.util.ArrayList, dao.*, model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
String id = request.getParameter("id");
String mucToiThieu = request.getParameter("muctoithieu");
Vung vung = new Vung();
float mucToiThieuVung = Float.parseFloat(mucToiThieu);
int idVung = (Integer)session.getAttribute("Vungid");

vung = (Vung)session.getAttribute("Vung");
vung.setMucToiThieu(mucToiThieuVung);

VungDAO vungDao = new VungDAO();
boolean result = vungDao.saveVung(vung);
if(result == true){
	response.sendRedirect("GDChinhNVQuanly.jsp?result=SaveSuccess");
}
else{
	response.sendRedirect("GDChinhNVQuanly.jsp?result=SaveFail");
}
%>

