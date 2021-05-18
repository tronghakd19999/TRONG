package model;

public class BacThue {
	public int Id;
	public float ValueFrom;
	public float ValueTo;
	public float GiamTru;
	public float Value;
	
	public BacThue(int id, float valueFrom, float valueTo, float giamTru, float value) {
		super();
		Id = id;
		ValueFrom = valueFrom;
		ValueTo = valueTo;
		GiamTru = giamTru;
		Value = value;
	}
	
	public BacThue() {
		
	}
	
	public float getValue() {
		return Value;
	}
	public void setValue(float value) {
		Value = value;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getValueFrom() {
		return ValueFrom;
	}
	public void setValueFrom(float valueFrom) {
		ValueFrom = valueFrom;
	}
	public float getValueTo() {
		return ValueTo;
	}
	public void setValueTo(float valueTo) {
		ValueTo = valueTo;
	}
	public float getGiamTru() {
		return GiamTru;
	}
	public void setGiamTru(float giamTru) {
		GiamTru = giamTru;
	}
}
