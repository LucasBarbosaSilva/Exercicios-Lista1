package exercise6;

public class Program {
    public static void main(String[] args) {
        Person[] persons = {new PersonIndividual("Isabel Fabiana da Cunha", "53027069461"),
                            new PersonIndividual("João Marcos Vinicius Souza", "01737041405"),
                            new PersonIndividual("Carolina Yasmin Melo", "64023672492"),
                            new PersonLegal("Kaique Matheus Ferreira", "84873933000183"),
                            new PersonLegal("Mateus Ricardo Rezende", "78304212000154"),
                            new PersonLegal("Heloise Vitória Viana", "87051274000198")};
        for (Person person: persons) {
            System.out.println("A pessoa: "+person.toString() +" é:");
            Validator.runValidation(person);

        }
    }
}