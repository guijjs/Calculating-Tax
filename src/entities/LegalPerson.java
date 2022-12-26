package entities;
public class LegalPerson extends IncomeTax{
  private Integer numberEmployees;
  private Double tax;
  public LegalPerson(){
    super();
  };
  public LegalPerson(String name, Double incomeYear, Integer numberEmployees){
    super(name, incomeYear);
    this.numberEmployees = numberEmployees;
  };
  
  public void calculatingTax(){
    if(this.numberEmployees > 10){
      this.tax += incomeYear * (14/100);
    }else{
      this.tax += incomeYear * (16/100);
    }
  };
  public Double incomeTax(){
    return this.tax;
  }
  public Integer getNumberEmployees(){
    return this.numberEmployees;
  }
}
