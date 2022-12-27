package entities;
public class LegalPerson extends IncomeTax{
  private Integer numberEmployees;
  public LegalPerson(){
    super();
  };
  public LegalPerson(String name, Double incomeYear, Integer numberEmployees){
    super(name, incomeYear);
    this.numberEmployees = numberEmployees;
  };
  
  @Override
  public Double incomeTax(){
    Double tax;
    if(numberEmployees > 10){
      tax = getIncomeYear() * (14.0/100.0);
    }else{
      tax = getIncomeYear() * (16.0/100.0);
    };
    return tax;
  };
  public Integer getNumberEmployees(){
    return numberEmployees;
  }
}
