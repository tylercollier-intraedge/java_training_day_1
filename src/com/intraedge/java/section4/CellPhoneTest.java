/**
 * Determine whether this file will compile. If not, how will you fix it, and 
 * if it does compile, what would be the output?
 */
public class CellPhoneTest {
	public static void main(String[] args) {
    	CellPhone phone = new CellPhone();
    	phone.setCarrier("Verizon");
    	String carrierName = phone.getCarrier();
    	System.out.println("Carrier is: "+carrierName);
	}
}

class CellPhone {
	String carrier;
	
	void setCarrier(String carrier) {
		carrier = carrier;
	}
	
	String getCarrier() {
		return carrier;
	}
}