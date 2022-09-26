package exercise10;

public class SendMail {
  public static void sendMail(Email email){
    User sourceUser = email.getSourceUser();
    User targetUser = email.getTargeUser();
    sourceUser.addSendEmailToList(email);
    targetUser.addReceivedEmailToList(email);
  }
}
