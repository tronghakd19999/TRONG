package testdao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.BaoCaoThueDAO;
import model.KhachHang;

public class TestBaoCaoThueDAO {

	@Test
	public void testBaoCaoThue() {
		BaoCaoThueDAO testBCTDAO = new BaoCaoThueDAO();
		
		try {
			ArrayList<KhachHang> listKHDTD = testBCTDAO.getAllKhachHangDongThueDu();
			ArrayList<KhachHang> listKHDTT = testBCTDAO.getAllKhachHangDongThueThieu();
			for(KhachHang khachhang : listKHDTD) {
				if (khachhang.getId() == 1) {
					assertEquals(khachhang.getName().trim(), "Trần Mạnh Đạt");
					assertEquals(khachhang.getAddress().trim(), "Hà Nội");
					assertEquals(khachhang.getMST().trim(), "579218892");
				}
				
				if (khachhang.getId() == 3) {
					assertEquals(khachhang.getName().trim(), "Trần Quốc Công");
					assertEquals(khachhang.getAddress().trim(), "Huế");
					assertEquals(khachhang.getMST().trim(), "481985898");
				}
			}
			
			for(KhachHang khachhang : listKHDTT) {
				if (khachhang.getId() == 2) {
					assertEquals(khachhang.getName().trim(), "Dương Tiến Thái");
					assertEquals(khachhang.getAddress().trim(), "Hà Nội");
					assertEquals(khachhang.getMST().trim(), "412859748");
				}
				
				if (khachhang.getId() == 4) {
					assertEquals(khachhang.getName().trim(), "Phạm Minh Hiếu");
					assertEquals(khachhang.getAddress().trim(), "Bắc Ninh");
					assertEquals(khachhang.getMST().trim(), "948272989");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
