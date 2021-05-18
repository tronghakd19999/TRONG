package testdao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.DAO;
import dao.KhachHangDAO;
import model.KhachHang;

public class TestKhachHangDAO extends DAO{

	@Test
	public void testKhachHangDAO() {
		
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		
		try {
			ArrayList<KhachHang> listKhachHang = khachHangDAO.getAllKhachHang();
			// Kiểm tra kết quả có giống trong Database 
			for (KhachHang khachhang : listKhachHang) {
				if (khachhang.getId() == 1) {
					assertTrue(khachhang.getName().equals("Trần Mạnh Đạt"));
					assertTrue(khachhang.getCmnd().equals("032859389"));
					//assertTrue(khachhang.getDob().equals("1999-09-30"));
					assertTrue(khachhang.getAddress().equals("Hà Nội"));
					assertTrue(khachhang.getMST().equals("579218892"));
					assertTrue(khachhang.getJob().equals("Chạy bàn"));
				}
				if (khachhang.getId() == 2) {
					assertTrue(khachhang.getName().equals("Dương Tiến Thái"));
					assertTrue(khachhang.getCmnd().equals("023194860"));
					//assertTrue(khachhang.getDob().equals("1995-04-01"));
					assertTrue(khachhang.getAddress().equals("Hà Nội"));
					assertTrue(khachhang.getMST().equals("412859748"));
					assertTrue(khachhang.getJob().equals("Streamer"));
				}
				if (khachhang.getId() == 3) {
					assertTrue(khachhang.getName().equals("Trần Quốc Công"));
					assertTrue(khachhang.getCmnd().equals("028937658"));
					//assertTrue(khachhang.getDob().equals("1996-05-01"));
					assertTrue(khachhang.getAddress().equals("Huế"));
					assertTrue(khachhang.getMST().equals("481985898"));
					assertTrue(khachhang.getJob().equals("Nhân viên văn phòng"));
				}
				if (khachhang.getId() == 4) {
					assertTrue(khachhang.getName().equals("Phạm Minh Hiếu"));
					assertTrue(khachhang.getCmnd().equals("018958698"));
					//assertTrue(khachhang.getDob().equals("1997-08-23"));
					assertTrue(khachhang.getAddress().equals("Bắc Ninh"));
					assertTrue(khachhang.getMST().equals("948272989"));
					assertTrue(khachhang.getJob().equals("Phụ hồ"));
				}
				if (khachhang.getId() == 5) {
					assertTrue(khachhang.getName().equals("Nguyễn Quang Huy"));
					assertTrue(khachhang.getCmnd().equals("022265892"));
					//assertTrue(khachhang.getDob().equals("1999-05-30"));
					assertTrue(khachhang.getAddress().equals("Hà Tĩnh"));
					assertTrue(khachhang.getMST().equals("421898409"));
					assertTrue(khachhang.getJob().equals("Nhân viên ngân hàng"));
				}
				if (khachhang.getId() == 6) {
					assertTrue(khachhang.getName().equals("Bùi Khôi Nguyên"));
					assertTrue(khachhang.getCmnd().equals("036893657"));
					//assertTrue(khachhang.getDob().equals("1992-03-24"));
					assertTrue(khachhang.getAddress().equals("Quảng Nam"));
					assertTrue(khachhang.getMST().equals("290958189"));
					assertTrue(khachhang.getJob().equals("Nhân viên văn phòng"));
				}
				if (khachhang.getId() == 7) {
					assertTrue(khachhang.getName().equals("Nguyễn Hoàng Hải"));
					assertTrue(khachhang.getCmnd().equals("042238942"));
					//assertTrue(khachhang.getDob().equals("1994-12-05"));
					assertTrue(khachhang.getAddress().equals("Hải Phòng"));
					assertTrue(khachhang.getMST().equals("129383094"));
					assertTrue(khachhang.getJob().equals("Quản lý cửa hàng"));
				}
				if (khachhang.getId() == 8) {
					assertTrue(khachhang.getName().equals("Lưu Hải Nam"));
					assertTrue(khachhang.getCmnd().equals("011249582"));
					//assertTrue(khachhang.getDob().equals("1998-11-30"));
					assertTrue(khachhang.getAddress().equals("Cà Mau"));
					assertTrue(khachhang.getMST().equals("295098480"));
					assertTrue(khachhang.getJob().equals("Bảo vệ"));
				}
				if (khachhang.getId() == 9) {
					assertTrue(khachhang.getName().equals("Nguyễn Hà Anh"));
					assertTrue(khachhang.getCmnd().equals("014989762"));
					//assertTrue(khachhang.getDob().equals("1999-07-24"));
					assertTrue(khachhang.getAddress().equals("Hà Nội"));
					assertTrue(khachhang.getMST().equals("295859209"));
					assertTrue(khachhang.getJob().equals("Quản lý nhà hàng"));
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
