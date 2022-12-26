import entities.LegalPerson;
import entities.NaturalPerson;
import entities.IncomeTax;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  
    List<IncomeTax> listaDeTaxas = new ArrayList<>();

    System.out.print("NÚMERO DE TAXAS QUE QUEIRA CALCULAR: ");
    Integer n = sc.nextInt();
    for(int i = 0; i<n; i++){
      System.out.print("PESSOA FISICA OU PESSOA JURICA(F/J): ");
      char typePerson = sc.next().toLowerCase().charAt(0);
      if(typePerson == 'f'){
        sc.nextLine();
        System.out.print("NOME: ");
        String name = sc.nextLine();
        System.out.print("RENDA ANUAL: ");
        Double incomeYear = sc.nextDouble();
        System.out.print("GASTOS COM SAÚDE: ");
        Double healthExpenses = sc.nextDouble();
        listaDeTaxas.add(new NaturalPerson(name, incomeYear, healthExpenses));
      }else if(typePerson == 'j'){
        sc.nextLine();
        System.out.print("NOME: ");
        String name = sc.nextLine();
        System.out.print("RENDA ANUAL: ");
        Double incomeYear = sc.nextDouble();
        System.out.print("QUANTIDADE DE FUNCIONÁRIOS: ");
        Integer numberEmployees = sc.nextInt();
        listaDeTaxas.add(new LegalPerson(name, incomeYear, numberEmployees));
      }else{
        while(typePerson != 'f' || typePerson != 'j'){
          System.out.print("DIGITE UMA OPÇÃO VÁLIDA: ");
          typePerson = sc.next().toLowerCase().charAt(0);
          if(typePerson == 'f'){
            sc.nextLine();
            System.out.print("NOME: ");
            String name = sc.nextLine();
            System.out.print("RENDA ANUAL: ");
            Double incomeYear = sc.nextDouble();
            System.out.print("GASTOS COM SAÚDE: ");
            Double healthExpenses = sc.nextDouble();
            listaDeTaxas.add(new NaturalPerson(name, incomeYear, healthExpenses));
            break;
          }else if(typePerson == 'j'){
            sc.nextLine();
            System.out.print("NOME: ");
            String name = sc.nextLine();
            System.out.print("RENDA ANUAL: ");
            Double incomeYear = sc.nextDouble();
            System.out.print("QUANTIDADE DE FUNCIONÁRIOS: ");
            Integer numberEmployees = sc.nextInt();
            listaDeTaxas.add(new LegalPerson(name, incomeYear, numberEmployees));
            break;
          }
        }
      }
    }
    for(IncomeTax taxas : listaDeTaxas){
      taxas.calculatingTax();
      System.out.println(taxas.incomeTax());
    }

    System.out.println("\nTAXAS A SER PAGAS: ");
    for(IncomeTax taxas : listaDeTaxas){
      System.out.printf("%s: R$ %.2f\n", taxas.getName(), taxas.incomeTax());
    };
    sc.close();
  }
}
