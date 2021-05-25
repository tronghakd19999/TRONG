<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.*, dao.*"%>

<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<jsp:include page="../include.jsp" />
<!--Custom styles-->
<link rel="stylesheet" href="../vendor/css/main_view.css">
<title> Xuất báo cáo thuế TNCN</title>
</head>

<body>
	<h3>Xuất báo cáo theo tháng đóng tiền thuế tháng 2</h3>
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
										<th>Danh sách xuất báo cáo</th>
										
													
									</tr>
								</thead>
								<tbody>
									
									<tr>
										<td><%=1%></td>
										<td>Danh sách khách hàng đóng thuế đầy đủ</td>
										 <td>
											<button class="btn btn-info" type="button"
												data-toggle="tooltip" data-placement="left"
												title="Xem báo cáo" id=1
												onclick="location.href='GDXuatBaoCaoDu.jsp?id=1';">
												<i class="fas fa-receipt"></i>
											</button>
										</td> 
									</tr>
									<tr>
										<td><%=2%></td>
										<td>Danh sách khách hàng đóng thuế muộn</td>

										 <td>
											<button class="btn btn-info" type="button"
												data-toggle="tooltip" data-placement="left"
												title="Xem báo cáo" id=2
												onclick="location.href='GDXuatBaoCaoMuon.jsp?id=2';">
												<i class="fas fa-receipt"></i>
											</button>
										</td> 
									</tr>
									
									<tr>
										<td><%=3%></td>
										<td>Danh sách khách hàng đóng thuế thiếu</td>

										 <td>
											<button class="btn btn-info" type="button"
												data-toggle="tooltip" data-placement="left"
												title="Xem báo cáo" id=3
												onclick="location.href='GDXuatBaoCaoThieu.jsp?id=3';">
												<i class="fas fa-receipt"></i>
											</button>
										</td> 
									</tr>
									
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