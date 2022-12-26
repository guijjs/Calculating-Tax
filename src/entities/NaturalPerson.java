package entities;
public class NaturalPerson extends IncomeTax{
  private Double healthExpenses;
  private Double tax;
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

  public void calculatingTax(){
    if(incomeYear <= 20000.00 && healthExpenses > 0){
      this.tax+= (incomeYear * (15/100) - (healthExpenses * (50/100)));
    }else if( incomeYear > 20000 && healthExpenses > 0){
      this.tax+= (incomeYear * (25/100) - (healthExpenses * (50/100)));
    }else if(incomeYear<=20000 && healthExpenses == 0){
      this.tax+= (incomeYear * (15/100));
    }else if(incomeYear>20000 && healthExpenses == 0){
      this.tax+= (incomeYear * (25/100));
    };
  };
  public Double incomeTax(){
    return this.tax;
  }
}
