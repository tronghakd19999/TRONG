package model;

import java.sql.Date;

public class KhachHang {
	public int Id;
	public String Name;
	public String Cmnd;
	public Date Dob;
	public String Address;
	public float Salary;
	public String Phone;
	public String Note;
	public String MST;
	public String Job;
	public int VungId;
	public int BacThueId;
	public float GiamTru;
	public float TaxValue; //so tien nop thue
	public float getGiamTru() {
		return GiamTru;
	}



	public void setGiamTru(float giamTru) {
		GiamTru = giamTru;
	}



	public float getTaxValue() {
		return TaxValue;
	}



	public void setTaxValue(float taxValue) {
		TaxValue = taxValue;
	}



	public int getBacThueId() {
		return BacThueId;
	}



	public void setBacThueId(int bacThueId) {
		BacThueId = bacThueId;
	}
	public float TienNop;
	
	public float getTienNop() {
		return TienNop;
	}



	public void setTienNop(float tienNop) {
		TienNop = tienNop;
	}



	public KhachHang() {
		
	}
	
	
	
	public KhachHang(int id, String name, String cmnd, Date dob, String address, float salary, String phone,
			String note, String mST, String job, int vungId) {
		super();
		Id = id;
		Name = name;
		Cmnd = cmnd;
		Dob = dob;
		Address = address;
		Salary = salary;
		Phone = phone;
		Note = note;
		MST = mST;
		Job = job;
		VungId = vungId;
	}



	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCmnd() {
		return Cmnd;
	}
	public void setCmnd(String cmnd) {
		Cmnd = cmnd;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public String getMST() {
		return MST;
	}
	public void setMST(String mST) {
		MST = mST;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public int getVungId() {
		return VungId;
	}
	public void setVungId(int vungId) {
		VungId = vungId;
	}
}
