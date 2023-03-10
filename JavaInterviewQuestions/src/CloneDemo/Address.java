package CloneDemo;

public class Address implements Cloneable {
	
	//This program is for Deep clone where we clone object with Address(reference) also.
	
	String city;
	int pin;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}

}