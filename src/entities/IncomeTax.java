package entities;
public abstract class IncomeTax{
  protected String name;
  protected Double incomeYear;
  public IncomeTax(){};
  public IncomeTax(String name, Double incomeYear){
    this.name = name;
    this.incomeYear = incomeYear;
  };
  public String getName(){
    return this.name;
  };
  public void calculatingTax(){};
  public Double getIncomeYear(){
    return this.incomeYear;
  };
  public abstract Double incomeTax();

}
