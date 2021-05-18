package model;

import java.sql.Date;

public class LichSuThue {
	public int Id;
	public float SoTienNop;
	public Date NgayNop;
	public String GhiChu;
	public Date HanNop;
	public String TrangThai;
	public int HoSoThueId;
	
	public LichSuThue() {
		
	}
	
	public LichSuThue(int id, float soTienNop, Date ngayNop, String ghiChu, Date hanNop, String trangThai,
			int hoSoThueId) {
		super();
		Id = id;
		SoTienNop = soTienNop;
		NgayNop = ngayNop;
		GhiChu = ghiChu;
		HanNop = hanNop;
		TrangThai = trangThai;
		HoSoThueId = hoSoThueId;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getSoTienNop() {
		return SoTienNop;
	}
	public void setSoTienNop(float soTienNop) {
		SoTienNop = soTienNop;
	}
	public Date getNgayNop() {
		return NgayNop;
	}
	public void setNgayNop(Date ngayNop) {
		NgayNop = ngayNop;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	public Date getHanNop() {
		return HanNop;
	}
	public void setHanNop(Date hanNop) {
		HanNop = hanNop;
	}
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	public int getHoSoThueId() {
		return HoSoThueId;
	}
	public void setHoSoThueId(int hoSoThueId) {
		HoSoThueId = hoSoThueId;
	}
}
