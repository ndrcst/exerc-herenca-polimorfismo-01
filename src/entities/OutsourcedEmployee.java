package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1);
		
	}
	

}
