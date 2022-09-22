package exercise6;

public class PersonLegal extends Person{
  private String cnpj;
  public PersonLegal(String name, String cnpj){
    super(name);
    this.cnpj = cnpj;
  }

  @Override
  public boolean isValid(){
    return false;
  }
  
  public String toString(){
    return super.toString() + this.cnpj;
  }
}
