package exercise10;

import java.util.ArrayList;

public class Program {
  
  static ArrayList<User> users = new ArrayList<User>();
  static ArrayList<Email> emails = new ArrayList<Email>();
  public static void main(String[] args) {
    users.add(new User("João", "Faxineiro", "0001", "joaozinho@tmail.com"));
    users.add(new User("Maria", "Top", "0002", "maria@tmail.com"));
    Email email1 = new Email("Email 1");
    email1.setEmail("sssssssssssssssssssssssssssssssssssssssssssssssssssss");
    email1.setSourceUser(users.get(0));
    email1.setTargeUser(users.get(1));
    emails.add(email1);
    Email email2 = new Email("Email 2");
    email2.setEmail("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    email2.setSourceUser(users.get(1));
    email2.setTargeUser(users.get(0));
    emails.add(email2);

    for (Email e: emails){
      SendMail.sendMail(e);
    }
    System.out.println("Lista de usuários: ");
    for (User user: users){
      System.out.println(user.getInfo());
      System.out.println("---------------------------");
    }
  }
  
  public static boolean validatorUserExistent(String nameUser){
    boolean isExistent = false;
    for (User user: users){
      if(user.getName() == nameUser){
        isExistent = true;
        break;
      }
    }
    return isExistent;
  }

  public static boolean validatorEmailUnic(String email){
    boolean isUnic = true;
    for (User user: users){
      if(user.getEmail() == email){
        isUnic = false;
        break;
      }
    }
    return isUnic;
  }
}
