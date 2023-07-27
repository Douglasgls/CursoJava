package entities;

public class LegalPerson extends Person {

	private int NumberEmployee;

	public LegalPerson(String name, Double annualIncome, int numberEmployee) {
		super(name, annualIncome);
		this.NumberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return NumberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		NumberEmployee = numberEmployee;
	}

	@Override
	public Double taxCalculation() {
		double tax;
		if (NumberEmployee > 10 ) {
			tax = 0.14;
			return  getAnnualIncome() * tax;
		}else {
			tax = 0.16;
			return  getAnnualIncome() * tax;
		}
		
	
	}
	

}
