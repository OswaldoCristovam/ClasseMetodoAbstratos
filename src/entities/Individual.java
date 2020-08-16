package entities;

public class Individual extends TaxPayer {

	private final Double INCOME = 20000.0;
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		
		if(getanualIncome() < INCOME) {
			tax = 0.15;
		}else {
			tax = 0.25;
		}
		
		return (getanualIncome() * tax) - (healthExpenditures * 0.5);
	}

}
