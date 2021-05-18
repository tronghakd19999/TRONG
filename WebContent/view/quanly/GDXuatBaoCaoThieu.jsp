<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.*, dao.*"%>
<%
ArrayList<KhachHang> listkh = new ArrayList<KhachHang>();
listkh = (new BaoCaoThueDAO()).getAllKhachHangDongThueThieu();
%>


<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<jsp:include page="../include.jsp" />
<!--Custom styles-->
<link rel="stylesheet" href="../vendor/css/main_view.css">
<title> Xuất báo cáo thuế TNCN</title>
</head>
<%
if (listkh != null ) {
%>
<body>
	<h3>Xuất báo cáo theo tháng đóng tiền thuế thiếu tháng 2</h3>
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
										<th>T.T</th>
										<th>Họ và tên</th>
										<th>Mã số thuế</th>
										<th>Số điện thoại</th>
										<th>Địa chỉ</th>
										<th>Nghề</th>
										<th>Mức lương</th>
										<th>Tiền đóng thuế</th>
													
									</tr>
								</thead>
								<tbody>
									<%
									for (int i = 0; i < listkh.size() ; i++) {
									%>
									<tr>
										<td><%=i+1%></td>
										<td><%=listkh.get(i).getName()%></td>
										<td><%=listkh.get(i).getMST()%></td>
										<td><%=listkh.get(i).getPhone()%></td>
										<td><%=listkh.get(i).getAddress()%></td>
										<td><%=listkh.get(i).getJob()%></td>
										<td><%=listkh.get(i).getSalary()%></td>
										<td> <%=listkh.get(i).getTaxValue()%></td> 
										
										<%-- <td>
											<button class="btn btn-info" type="button"
												data-toggle="tooltip" data-placement="left"
												title="Xuất báo cáo"
												onclick="location.href='?id=<%=listkh.get(i).getId()%>';">
												<i class="fas fa-receipt"></i>
											</button>
										</td> --%>
									</tr>
									<%
									}
									}
									%>
								</tbody>
							</table>
							<div class="card-footer d-flex justify-content-end">
								<button class="btn btn-outline-secondary px-4" type="button" name="back">Xuất báo cáo</button>
							</div>
							<div class="card-footer d-flex justify-content-end">
								<button class="btn btn-outline-secondary px-4" type="button" name="back" onclick="history.back()">Quay
									lại</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>