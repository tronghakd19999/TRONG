package testdao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;


import dao.DAO;
import dao.VungDAO;
import junit.framework.Assert;
import model.Vung;

public class TestVungDAO extends DAO{
	
	@Test
	public void testVungDAO1() throws Exception{
		VungDAO vungDAO = new VungDAO();
		
		Connection connection = vungDAO.getDAOConnection();
		connection.setAutoCommit(false);
		
		
		try {
			
			ArrayList<Vung> vungTest = new ArrayList<Vung>();

			//Fake data
			Vung vungCheck = vungDAO.getEditVung(1);
			Vung vungCheck2 = new Vung(1, 1, 4430000);
			vungTest.add(new Vung(0, 1, 4430000));
			vungDAO.saveVung(vungCheck);
			
			Vung vungReal = vungDAO.getEditVung(0);
			ArrayList<Vung> realData = vungDAO.getVung("1");
			realData.add(vungReal);
			
			assertEquals(vungTest, vungReal);
			
		} finally {
			connection.rollback();
			connection.close();
		} 
				

	}
	@Test
	public void testVungDAO1InputChar() throws Exception{
		VungDAO vungDAO = new VungDAO();
		
		Connection connection = vungDAO.getDAOConnection();
		connection.setAutoCommit(false);
		
		
		try {
			
			ArrayList<Vung> vungTest = new ArrayList<Vung>();
			vungTest = vungDAO.getVung("abc");
			ArrayList<Vung> vung = new ArrayList<Vung>();

			
			assertEquals(vungTest, vung);
			
		} finally {
			connection.rollback();
			connection.close();
		} 
				

	}
	@Test
	public void testSaveVung() throws Exception{
		VungDAO vungDAO = new VungDAO();
		
		Connection connection = vungDAO.getDAOConnection();
		connection.setAutoCommit(false);
		
		
		try {
			
			Vung vungTest = new Vung(1, 1, 4430000);
			vungDAO.saveVung(vungTest);
			Vung vungReal = vungDAO.getEditVung(1);

			
			assertEquals(vungReal, vungTest);
			
		} finally {
			connection.rollback();
			connection.close();
		} 
				

	}

}
