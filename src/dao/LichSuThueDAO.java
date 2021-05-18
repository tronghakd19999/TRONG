package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.LichSuThue;

public class LichSuThueDAO extends DAO{
	public LichSuThueDAO() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private static final String GetThueKH = "select lichsuthue.ID, lichsuthue.NgayNop, "
												+ "lichsuthue.SoTienNop, lichsuthue.TrangThai, lichsuthue.GhiChu \r\n" + 
											 "from lichsuthue, hosothue, khachhang \r\n" + 
											 "where khachhang.id = hosothue.KhachHangID "
											 + "and hosothue.ID = lichsuthue.HoSoThueID "
											 + "and khachhang.id = ?";
	public ArrayList<LichSuThue> getThueCaNhanKhachHangId(int KhachHangid) throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GetThueKH);
			preparedStatement.setInt(1, KhachHangid);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<LichSuThue> listThueKH = new ArrayList<LichSuThue>();
			while(resultSet.next()) {
				LichSuThue thueKhachHang = new LichSuThue();
				thueKhachHang.setId(resultSet.getInt("ID"));
				thueKhachHang.setSoTienNop(resultSet.getFloat("SoTienNop"));
				thueKhachHang.setNgayNop(resultSet.getDate("NgayNop"));
				thueKhachHang.setGhiChu(resultSet.getString("GhiChu"));
				thueKhachHang.setTrangThai(resultSet.getString("TrangThai"));
				listThueKH.add(thueKhachHang);
				}	
				return listThueKH;
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
}
