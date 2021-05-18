package testdao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;


import dao.DAO;
import dao.VungDAO;
import model.Vung;

public class TestVungDAO extends DAO{
	
	@Test
	public void testVungDAO() throws Exception{
		VungDAO vungDAO = new VungDAO();
		
		//Connection connection = (Connection) vungDAO.getDAOConnection();
		//((java.sql.Connection) connection).setAutoCommit(false);
		
		
		try {
			
			ArrayList<Vung> vungTest = new ArrayList<Vung>();
			Vung vungTest1 = new Vung();
			vungTest1.setMucToiThieu(4420000);
			vungTest1.setId(1);
			vungTest1.setValue(1);
//			Vung vungTest2 = new Vung();
//			vungTest2.setMucToiThieu(3920000);
//			vungTest2.setId(2);
//			vungTest2.setValue(2);
			vungTest.add(vungTest1);
//			vungTest.add(vungTest2);
			//vungDAO.saveVung(vungTest2);
			
			ArrayList<Vung> vungReal1 = vungDAO.getVung("1");
			ArrayList<Vung> vungReal2 = vungDAO.getVung("2");
			
			assertEquals(vungTest, vungReal1);
			//assertEquals(vungReal2, vungTest2);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
				

	}


}
