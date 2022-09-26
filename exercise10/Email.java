package exercise10;

import java.util.Date;

public class Email {
  private String email;
  private User sourceUser;
  private User targeUser;
  private String subject;
  private Date date;

  public Email(String subject){
    this.subject = subject;
    this.date = new Date();
  }
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    if(email.length() > 0 && email.length() <= 2500){
      this.email = email;
    }else{
      System.out.println("Email inválido");
    }
  }

  public User getSourceUser() {
    return sourceUser;
  }

  public void setSourceUser(User sourceUser) {
    if(Program.validatorUserExistent(sourceUser.getName())){
      this.sourceUser = sourceUser;
    }else{
      System.out.println("Source user invalid");
    }
  }

  public User getTargeUser() {
    return targeUser;
  }

  public void setTargeUser(User targeUser) {
    if(Program.validatorUserExistent(targeUser.getName())){
      this.targeUser = targeUser;
    }else{
      System.out.println("Target user invalid");
    }
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getInfo(){
    return "| Title: "+this.subject+"\n"+
           "| Target User: "+getTargeUser().getName()+"\n"+
           "| Source User: "+getSourceUser().getName()+"\n"+
           "| Email: "+getEmail();
  }
}
