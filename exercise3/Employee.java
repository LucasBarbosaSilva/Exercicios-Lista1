package exercise3;

import java.text.DecimalFormat;

public class Employee {
  private String name;
  private double grossSalary;
  private double tax;
  private double netSalary;

  public Employee(String name, double grossSalary, double tax){
    this.name = name;
    this.grossSalary = grossSalary;
    this.tax = tax;
  }

  public double netSalary(){
    this.netSalary = this.grossSalary - this.tax;
    DecimalFormat formato = new DecimalFormat("#.##");
    return Double.valueOf(formato.format(this.netSalary));
  }

  public void increaseSalary(double percentagem){
    this.grossSalary = this.grossSalary *(100 + percentagem)/100;
  }

  public void data(){
    this.netSalary();
    System.out.printf(this.name+", $%.2f", this.netSalary);
  }
}