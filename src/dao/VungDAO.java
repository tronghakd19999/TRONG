package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import model.Vung;

public class VungDAO extends DAO{
	
	private final Connection connection = getConnection();
	public VungDAO() {
		super();
	}
	private static final String GET_AREA = "SELECT * FROM sqa_new.vung;";
	private static final String GET__S_VUNG = "select vung.* "
											+ "from sqa_new.vung "
											+ "where id = ?;";
	private static final String UPDATE_AREA = "update sqa_new.vung \r\n" + 
											  "set vung.MucToiThieu = ?,\r\n" + 
											  "vung.Value = ?\r\n" +
											  "where vung.id = ?;";

	public ArrayList<Vung> getAllVung() throws SQLException {
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_AREA);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<Vung> listVung = new ArrayList<Vung>();
			while (resultSet.next()) {
				Vung vung = new Vung();
				vung.setId(resultSet.getInt("ID"));
				vung.setValue(resultSet.getInt("Value"));
				vung.setMucToiThieu(resultSet.getFloat("MucToiThieu"));
				listVung.add(vung);
			}
			return listVung;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public Vung getEditVung(int VungID) throws SQLException {
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET__S_VUNG);
			preparedStatement.setInt(1, VungID);
			ResultSet resultSet = preparedStatement.executeQuery();
			Vung vung = new Vung();
			while (resultSet.next()) {
				vung.setId(resultSet.getInt("ID"));
				vung.setValue(resultSet.getInt("Value"));
				vung.setMucToiThieu(resultSet.getFloat("MucToiThieu"));
				break;
			}
			return vung;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	public ArrayList<Vung> getVung(String VungID) throws SQLException {
		try {
			Connection connection = getConnection();
			// try-with-resource statement will auto close the connection.
			PreparedStatement preparedStatement = connection.prepareStatement(GET__S_VUNG);
			preparedStatement.setString(1, VungID);
			ResultSet resultSet = preparedStatement.executeQuery();
			ArrayList<Vung> listVung = new ArrayList<Vung>();
			while (resultSet.next()) {
				Vung vung = new Vung();
				vung.setValue(resultSet.getInt("Value"));
				vung.setMucToiThieu(resultSet.getFloat("muctoithieu"));
				listVung.add(vung);
			}
			return listVung;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Vung getCheckVung(String VungID) throws SQLException {
		try {
			Connection connection = getConnection();
			// try-with-resource statement will auto close the connection.
			PreparedStatement preparedStatement = connection.prepareStatement(GET__S_VUNG);
			preparedStatement.setString(1, VungID);
			ResultSet resultSet = preparedStatement.executeQuery();
//			ArrayList<Vung> listVung = new ArrayList<Vung>();
			Vung vung = new Vung();
			while (resultSet.next()) {
				vung.setValue(resultSet.getInt("ID"));
				vung.setMucToiThieu(resultSet.getFloat("muctoithieu"));
//				listVung.add(vung);
			}
			return vung;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean saveVung(Vung vung) throws SQLException {
		boolean Update;
		try {
			Connection connection = getConnection();
			// try-with-resource statement will auto close the connection.
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_AREA);
			preparedStatement.setFloat(1, vung.getMucToiThieu());
			preparedStatement.setInt(2, vung.getValue());
			preparedStatement.setInt(3, vung.getId());
			Update = preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return Update;
	}
	
	public Connection getDAOConnection() {
		return this.connection;
	}
}
