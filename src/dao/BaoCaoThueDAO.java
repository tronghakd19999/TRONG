package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.KhachHang;
import model.LichSuThue;

public class BaoCaoThueDAO extends DAO{
	private static final String GET_BAO_CAO_NOP_DU = "select khachhang.Name, khachhang.Mst, khachhang.Phone, khachhang.Address, khachhang.Job, khachhang.Salary, lichsuthue.SoTienNop\r\n" + 
			"from khachhang, hosothue, lichsuthue\r\n" + 
			"where khachhang.ID = hosothue.KhachHangID and hosothue.ID = lichsuthue.HoSoThueID and lichsuthue.GhiChu = 'Nop du';";
	
	private static final String GET_BAO_CAO_NOP_THIEU = "select khachhang.Name, khachhang.Mst, khachhang.Phone, khachhang.Address, khachhang.Job, khachhang.Salary, lichsuthue.SoTienNop\r\n" + 
			"from khachhang, hosothue, lichsuthue\r\n" + 
			"where khachhang.ID = hosothue.KhachHangID and hosothue.ID = lichsuthue.HoSoThueID and lichsuthue.GhiChu = 'Nop thieu';";
	
	public ArrayList<KhachHang> getAllKhachHangDongThueDu() throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_BAO_CAO_NOP_DU);
			//preparedStatement.setString(1, "Nop du");
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<KhachHang> listContract = new ArrayList<KhachHang>();
			while(resultSet.next()) {
				KhachHang contract = new KhachHang();
				contract.setName(resultSet.getString("Name"));
				contract.setMST(resultSet.getString("Mst"));
				contract.setPhone(resultSet.getString("Phone"));
				contract.setAddress(resultSet.getString("Address"));
				contract.setJob(resultSet.getString("Job"));
				contract.setSalary(resultSet.getFloat("Salary"));
				contract.setTaxValue(resultSet.getFloat("SoTienNop"));
				listContract.add(contract);
			}
			return listContract;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<KhachHang> getAllKhachHangDongThueThieu() throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_BAO_CAO_NOP_THIEU);
			//preparedStatement.setString(1, "Nop thieu");
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<KhachHang> listContract = new ArrayList<KhachHang>();
			while(resultSet.next()) {
				KhachHang contract = new KhachHang();
				contract.setName(resultSet.getString("Name"));
				contract.setMST(resultSet.getString("Mst"));
				contract.setPhone(resultSet.getString("Phone"));
				contract.setAddress(resultSet.getString("Address"));
				contract.setJob(resultSet.getString("Job"));
				contract.setSalary(resultSet.getFloat("Salary"));
				contract.setTaxValue(resultSet.getFloat("SoTienNop"));
				listContract.add(contract);
			}
			return listContract;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<LichSuThue> getTienThue() throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_BAO_CAO_NOP_DU);
			preparedStatement.setString(1, "Da nop");
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<LichSuThue> listTienThue = new ArrayList<LichSuThue>();
			while(resultSet.next()) {
				LichSuThue lsThue = new LichSuThue();
				lsThue.setSoTienNop(resultSet.getInt("SoTienNop"));
				
				listTienThue.add(lsThue);
			}
			return listTienThue;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
