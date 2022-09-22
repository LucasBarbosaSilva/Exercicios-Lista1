package exercise6;

public class Validator {
  public static void runValidation(IEntityValidation entity){
    if(entity.isValid()){
        System.out.println("Válido");
    }else{
        System.out.println("Inválido");
    }
  }
}
