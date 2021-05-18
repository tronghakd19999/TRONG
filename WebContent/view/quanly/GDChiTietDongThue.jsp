<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.*, dao.*"%>
<%
int id = Integer.parseInt(request.getParameter("id").toString());
ArrayList<LichSuThue> listdongthue = new ArrayList<LichSuThue>();
LichSuThueDAO thueKhachHang= new LichSuThueDAO();
listdongthue = thueKhachHang.getThueCaNhanKhachHangId(id);
%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<jsp:include page="../include.jsp" />
<!--Custom styles-->
<link rel="stylesheet" href="../vendor/css/main_view.css">
<title>Chi tiết đóng thuế cá nhân</title>
</head>
<%
if (listdongthue != null) {
%>
<body>
	<h3>Cá nhân chi tiết thuế tháng 2</h3>
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
							<table class="table">
								<thead>
									<tr>
										<th>Thứ tự</th>
										<th>Ngày nộp</th>
										<th>Số tiền</th>
										<th>Trạng thái</th>
										<th>Ghi chú</th>
									</tr>
								</thead>
								<tbody>
									<%
									for (int i = 0; i < listdongthue.size(); i++) {
									%>
									<tr>
										<td><%=i+1%></td>
										<td><%=listdongthue.get(i).getNgayNop()%></td>
										<td><%=listdongthue.get(i).getSoTienNop()%></td>
										<td><%=listdongthue.get(i).getTrangThai()%></td>
										<td><%=listdongthue.get(i).getGhiChu()%></td>
									</tr>
									<%
									}
									}
									%>
								</tbody>
							</table>
							<div class="card-footer d-flex justify-content-end">
								<button class="btn btn-outline-secondary px-4" type="button" name="back" onclick="history.back()">Quay lại</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>