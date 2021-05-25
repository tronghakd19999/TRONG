package dao;
import model.HoSoThue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.LichSuThue;

public class HoSoThueDAO extends DAO{
	public HoSoThueDAO() {
		super();
	}
	private static final String  GetHoSoById = "Select distinct a.ID, a.GhiChu, b.ID as LichSuID, b.SoTienNop, b.NgayNop, b.GhiChu as LichSuGhiChu, b.HanNop, b.TrangThai"
			+ " from hosothue a, lichsuthue b where a.ID = b.ID and a.KhachHangID = ?";
	
	public HoSoThue getHoSoByKhachHangId(int id) throws SQLException {
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GetHoSoById + id);
			ResultSet resultSet = preparedStatement.executeQuery();
			HoSoThue model = new HoSoThue();
			model.setId(resultSet.getInt("ID"));
			model.setGhiChu(resultSet.getString("GhiChu"));
			
			while(resultSet.next()) {
				LichSuThue item = new LichSuThue();
				item.setId(resultSet.getInt("LichSuID"));
				item.setSoTienNop(resultSet.getFloat("SoTienNop"));
				item.setHanNop(resultSet.getDate("HanNop"));
				item.setNgayNop(resultSet.getDate("NgayNop"));
				item.setGhiChu(resultSet.getString("LichSuGhiChu"));
				item.setTrangThai(resultSet.getString("TrangThai"));
				model.LichSu.add(item);
			}
			
			return model;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
