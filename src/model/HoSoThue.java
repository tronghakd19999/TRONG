package model;

import java.util.ArrayList;

public class HoSoThue {
	public int Id;
	public String GhiChu;
	public int KhachHangId;
	public ArrayList<LichSuThue> LichSu;
	public HoSoThue() {
		
	}
	
	
	public HoSoThue(int id, String ghiChu, int khachHangId, ArrayList<LichSuThue> lichSu) {
		super();
		Id = id;
		GhiChu = ghiChu;
		KhachHangId = khachHangId;
		LichSu = lichSu;
	}


	public ArrayList<LichSuThue> getLichSu() {
		return LichSu;
	}


	public void setLichSu(ArrayList<LichSuThue> lichSu) {
		LichSu = lichSu;
	}


	public HoSoThue(int id, String ghiChu, int khachHangId) {
		super();
		Id = id;
		GhiChu = ghiChu;
		KhachHangId = khachHangId;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	public int getKhachHangId() {
		return KhachHangId;
	}
	public void setKhachHangId(int khachHangId) {
		KhachHangId = khachHangId;
	}
}
