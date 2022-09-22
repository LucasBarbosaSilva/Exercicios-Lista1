package exercise6;

abstract class Person implements IEntityValidation{
  private String name;

  public Person(String name){
    this.name = name;
  }
  public String toString(){
    return this.name;
  }
}
