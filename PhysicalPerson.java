package entities;

public class PhysicalPerson extends Person {
	private Double healthSpent;

	public PhysicalPerson(String name, Double annualIncome, Double healthSpent) {
		super(name, annualIncome);
		this.healthSpent = healthSpent;
	}

	public Double getHealthSpent() {
		return healthSpent;
	}

	public void setHealthSpent(Double healthSpent) {
		this.healthSpent = healthSpent;
	}

	@Override
	public Double taxCalculation() {
		double gastoSaude;
		
		double tax;
		if (annualIncome >= 20000) {
			tax = 0.25;
		} else {
			tax = 0.15;
		}
		
		if (healthSpent > 0) {
			gastoSaude = healthSpent/2;
			return (annualIncome * tax) - (gastoSaude);
		}else {
			return annualIncome * tax;
		}
		

	}
	
	
	
	
}
