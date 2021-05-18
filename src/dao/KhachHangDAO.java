package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.KhachHang;

public class KhachHangDAO extends DAO{
	public KhachHangDAO() {
		super();
	}
	
	private static final String GetAll = "select * from khachhang";
	private static final String GetTaxList = "select * from khachhang a inner join bacthue b on a.BacThueID = b.ID";
	private static final String GetSearchKH = "select * from khachang where Name.khachhang LIKE '%%'";

	public ArrayList<KhachHang> getAllKhachHang() throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GetAll);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<KhachHang> listContract = new ArrayList<KhachHang>();
			while(resultSet.next()) {
				KhachHang contract = new KhachHang();
				contract.setId(resultSet.getInt("ID"));
				contract.setName(resultSet.getString("Name"));
				contract.setPhone(resultSet.getString("Phone"));
				contract.setAddress(resultSet.getString("Address"));
				contract.setCmnd(resultSet.getNString("Cmnd"));
				contract.setDob(resultSet.getDate("Dob"));
				contract.setMST(resultSet.getString("Mst"));
				contract.setSalary(resultSet.getFloat("Salary"));
				contract.setVungId(resultSet.getInt("VungID"));
				contract.setJob(resultSet.getString("Job"));
				contract.setNote(resultSet.getString("Note"));
				
				listContract.add(contract);
			}
			return listContract;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<KhachHang> getSearchKhachHang() throws SQLException{
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GetSearchKH);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<KhachHang> listKhacHang = new ArrayList<KhachHang>();
			while(resultSet.next()) {
				KhachHang khachhang = new KhachHang();
				khachhang.setId(resultSet.getInt("ID"));
				khachhang.setName(resultSet.getString("Name"));
				khachhang.setPhone(resultSet.getString("Phone"));
				khachhang.setAddress(resultSet.getString("Address"));
				khachhang.setCmnd(resultSet.getNString("Cmnd"));
				khachhang.setDob(resultSet.getDate("Dob"));
				khachhang.setMST(resultSet.getString("Mst"));
				khachhang.setSalary(resultSet.getFloat("Salary"));
				khachhang.setVungId(resultSet.getInt("VungID"));
				khachhang.setJob(resultSet.getString("Job"));
				khachhang.setNote(resultSet.getString("Note"));
				
				listKhacHang.add(khachhang);
			}
			return listKhacHang;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<KhachHang> getKhachHangTax() throws SQLException {
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GetTaxList);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<KhachHang> list = new ArrayList<KhachHang>();
			while(resultSet.next()) {
				KhachHang item = new KhachHang();
				item.setName(resultSet.getString("Name"));
				item.setAddress(resultSet.getString("Address"));
				item.setMST(resultSet.getString("Mst"));
				item.setPhone(resultSet.getString("Phone"));
				item.setSalary(resultSet.getFloat("Salary"));
				item.setGiamTru( item.getSalary() * resultSet.getFloat("GiamTru"));
				item.setTaxValue( item.getSalary() * resultSet.getFloat("Value"));
			}
			return list;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	
	}
}
