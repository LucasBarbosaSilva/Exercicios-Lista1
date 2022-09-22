package exercise6;

public class PersonIndividual extends Person{
  private String cpf;
  public PersonIndividual(String name, String cpf){
    super(name);
    this.cpf = cpf;
  }

  @Override
  public boolean isValid(){
    return false;
  }
  
  public String toString(){
    return super.toString() + this.cpf;
  }
}
