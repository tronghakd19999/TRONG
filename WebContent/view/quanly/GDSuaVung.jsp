<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page import="java.util.ArrayList, dao.*, model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int id = Integer.parseInt(request.getParameter("id").toString());
Vung vung = (new VungDAO()).getEditVung(id);
%>

<!DOCTYPE html>
<html>

<body>
	<h1>Cấu Hình Mức Tối Thiểu Vùng</h1>
	<%
	if (vung != null) {
	%>
	<form method="post" action="update_process.jsp">
		Khu vực vùng:<br>
		<input type="number" name="id"
			value="<%=vung.getValue() %>" 
			disable="true"> <br>
		Mức tối thiểu:<br> 
		<input maxlength="8" 
			type="number"
			name = "muctoithieu" 
			value="<%=vung.getMucToiThieu()%>" 
			/> 
			<input type="submit"
			value="save">
	</form>
	<%
		}
	%>
	<div class="card-footer d-flex justify-content-end">
								<button class="btn btn-outline-secondary px-4" type="button" name="back" onclick="history.back()">Quay
									lại</button>
							</div>
</body>
</html>