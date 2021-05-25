<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page import="java.util.ArrayList, dao.*, model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<Vung> listVung = new ArrayList<Vung>();
listVung = (new VungDAO()).getAllVung();
/* listSearchKH = (new KhachHangDAO()).getSearchKhachHang(); */
%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<jsp:include page="../include.jsp" />
<!--Custom styles-->
<link rel="stylesheet" href="../vendor/css/main_view.css">
<title> Cấu hình vùng </title>
</head>
<%
if (listVung != null) {
%>
<body>
	<h3>Cấu hình vùng</h3>
	<div class="d-flex" id="wrapper">

		<%@include file="menu.jsp"%>

		<!-- Page Content -->
		<div id="page-content-wrapper">

			<%@include file="navbar.jsp"%>

			<div class="container-fluid">
				<!-- Code in here -->
				<div class="card mt-3">
					<div class="card-header d-flex justify-content-between">
						<div class="my-auto"></div>
					</div>
					<div class="card-body">
						<form>
							<table class="table" id="bang_cau_hinh">
								<thead>
									<tr>
										<th>T.T</th>
										<th>Giá Trị Vùng</th>
										<th>Mức Tối Thiểu</th>
									</tr>
								</thead>
								<tbody>
									<%
									for (int i = 0; i < listVung.size(); i++) {
									%>
									<tr>
										<td><%=i+1%></td>
										<td><%=listVung.get(i).getValue()%></td>
										<td><%=listVung.get(i).getMucToiThieu()%></td>
										<td>
											<button class="btn btn-info" type="button"
												data-toggle="tooltip" data-placement="left"
												title="Sửa" id=<%=listVung.get(i).getId()%>
												onclick="location.href='GDSuaVung.jsp?id=<%=listVung.get(i).getId()%>';">
												<i class="fas fa-receipt"></i>
											</button>
										</td>
									</tr>
									<%
									}
									}
									%>
								</tbody>
							</table>
							<div class="card-footer d-flex justify-content-end">
								<button class="btn btn-outline-secondary px-4" type="button" name="back" onclick="history.back()">Quay
									lại</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>