package model;

public class Vung {
	public int Id;
	public int Value;
	public float MucToiThieu;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	public float getMucToiThieu() {
		return MucToiThieu;
	}
	public void setMucToiThieu(float mucToiThieu) {
		MucToiThieu = mucToiThieu;
	}
	
	public Vung() {
		
	}
	public Vung(int id, int value, float mucToiThieu) {
		Id = id;
		Value = value;
		MucToiThieu = mucToiThieu;
	}
	
}
