package testdao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.BaoCaoThueDAO;
import model.KhachHang;

public class TestBaoCaoThueDAO {

	@Test
	public void testBaoCaoThueDu() {
		BaoCaoThueDAO testBCTDAO = new BaoCaoThueDAO();
		
		try {
			ArrayList<KhachHang> listKHDTD = testBCTDAO.getAllKhachHangDongThueDu();
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
				
				if (khachhang.getId() == 5) {
					assertEquals(khachhang.getName().trim(), "Trần Quốc Công");
					assertEquals(khachhang.getAddress().trim(), "Hà Tĩnh");
					assertEquals(khachhang.getMST().trim(), "421898409");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void testBaoCaoThueMuon() {
		BaoCaoThueDAO testBCTDAO = new BaoCaoThueDAO();
		
		try {
			ArrayList<KhachHang> listKHDTT = testBCTDAO.getAllKhachHangDongThueDuMuon();
			
			for(KhachHang khachhang : listKHDTT) {
				if (khachhang.getId() == 6) {
					assertEquals(khachhang.getName().trim(), "Bùi Khôi Nguyên");
					assertEquals(khachhang.getAddress().trim(), "Quảng Nam");
					assertEquals(khachhang.getMST().trim(), "	290958189");
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
	@Test
	public void testBaoCaoThueThieu() {
		BaoCaoThueDAO testBCTDAO = new BaoCaoThueDAO();
		
		try {
			ArrayList<KhachHang> listKHDTD = testBCTDAO.getAllKhachHangDongThueThieu();
			for(KhachHang khachhang : listKHDTD) {
				
				if (khachhang.getId() == 2) {
					assertEquals(khachhang.getName().trim(), "Dương Tiến Thái");
					assertEquals(khachhang.getAddress().trim(), "Hà Nội");
					assertEquals(khachhang.getMST().trim(), "412859748");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
