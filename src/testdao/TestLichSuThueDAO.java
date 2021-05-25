package testdao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.LichSuThueDAO;
import model.LichSuThue;

public class TestLichSuThueDAO {

	@Test
	public void testLichSuThue1() {
		LichSuThueDAO testLichSuThue = new LichSuThueDAO();
		
		try {
			int id = 1;
			ArrayList<LichSuThue> lichSuThue = testLichSuThue.getThueCaNhanKhachHangId(id);
			System.out.println(lichSuThue.get(0).getNgayNop());
			assertTrue(lichSuThue.get(1).getNgayNop().equals("2021-02-15"));
			assertTrue(lichSuThue.get(1).getTrangThai().equals("Da nop"));
			assertTrue(lichSuThue.get(1).getGhiChu().equals("Nop du"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testLichSuThue2() {
		LichSuThueDAO testLichSuThue = new LichSuThueDAO();
		
		try {
			int id = 3;
			ArrayList<LichSuThue> lichSuThue = testLichSuThue.getThueCaNhanKhachHangId(id);
			System.out.println(lichSuThue.get(0).getNgayNop());
			assertTrue(lichSuThue.get(1).getNgayNop().equals("2021-02-17"));
			assertTrue(lichSuThue.get(1).getTrangThai().equals("Da nop"));
			assertTrue(lichSuThue.get(1).getGhiChu().equals("Nop du"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testLichSuThue3() {
		LichSuThueDAO testLichSuThue = new LichSuThueDAO();
		
		try {
			int id = 5;
			ArrayList<LichSuThue> lichSuThue = testLichSuThue.getThueCaNhanKhachHangId(id);
			System.out.println(lichSuThue.get(0).getNgayNop());
			assertTrue(lichSuThue.get(1).getNgayNop().equals("	2021-03-01"));
			assertTrue(lichSuThue.get(1).getTrangThai().equals("Da nop"));
			assertTrue(lichSuThue.get(1).getGhiChu().equals("Nop du"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testLichSuThue4() {
		LichSuThueDAO testLichSuThue = new LichSuThueDAO();
		
		try {
			int id = 4;
			ArrayList<LichSuThue> lichSuThue = testLichSuThue.getThueCaNhanKhachHangId(id);
			System.out.println(lichSuThue.get(3).getNgayNop());
			assertTrue(lichSuThue.get(3).getNgayNop().equals("2021-02-10"));
			assertTrue(lichSuThue.get(3).getTrangThai().equals("Dang nop"));
			assertTrue(lichSuThue.get(3).getGhiChu().equals("Nop thieu"));
			
			assertTrue(lichSuThue.get(2).getNgayNop().equals("2021-02-13"));
			assertTrue(lichSuThue.get(2).getTrangThai().equals("Dang nop muon"));
			assertTrue(lichSuThue.get(2).getGhiChu().equals("Nop thieu"));
			
			assertTrue(lichSuThue.get(1).getNgayNop().equals("2021-02-16"));
			assertTrue(lichSuThue.get(1).getTrangThai().equals("Dang nop"));
			assertTrue(lichSuThue.get(1).getGhiChu().equals("Nop thieu"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
