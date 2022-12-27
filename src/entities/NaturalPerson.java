package entities;
public class NaturalPerson extends IncomeTax{
  private Double healthExpenses;
  public NaturalPerson(){
    super();
  };
  public NaturalPerson(String name, Double incomeYear, Double healthExpenses){
    super(name, incomeYear);
    this.healthExpenses = healthExpenses;
  };
  public Double getHealthExpenses(){
    return this.healthExpenses;
  };

  public Double incomeTax(){
    Double tax = 0.0;
    if(getIncomeYear() <= 20000.00 && healthExpenses > 0){
      tax = (this.getIncomeYear() * (15.0/100.0) - (healthExpenses * (50.0/100.0)));
    }else if(this.getIncomeYear() > 20000 && healthExpenses > 0){
      tax = (this.getIncomeYear() * (25.0/100.0) - (healthExpenses * (50.0/100.0)));
    }else if(this.getIncomeYear()<=20000 && healthExpenses == 0){
      tax = (this.getIncomeYear() * (15.0/100.0));
    }else if(this.getIncomeYear()>20000 && healthExpenses == 0){
      tax = (this.getIncomeYear() * (25.0/100.0));
    }else{};
    return tax;
  };
}
