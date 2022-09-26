package exercise10;

import java.util.ArrayList;

public class User {
  
  private String name;
  private String job;
  private String registration;
  private String email;
  private ArrayList<Email> listSendMails;
  private ArrayList<Email> listReceivedMails;

  public User(String name, String job, String registration, String email){
    this.name = name;
    this.job = job;
    this.email = email;
    this.registration = registration;
    this.listReceivedMails = new ArrayList<Email>();
    this.listSendMails = new ArrayList<Email>();
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }
  public String getRegistration() {
    return registration;
  }
  public void setRegistration(String registration) {
    this.registration = registration;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public ArrayList<Email> getListSendMails() {
    return listSendMails;
  }
  public void addSendEmailToList(Email email) {
    this.listSendMails.add(email);
  }
  public ArrayList<Email> getListReceivedMails() {
    return listReceivedMails;
  }
  public void addReceivedEmailToList(Email email) {
    this.listReceivedMails.add(email);
  }
      
  public String getInfo(){
    String emailsReceived = "";
    for (Email email: this.listReceivedMails){
      emailsReceived = emailsReceived + email.getInfo() + "\n";
    }

    String emailsSend = "";
    for (Email email: this.listSendMails){
      emailsSend = emailsSend+email.getInfo() + "\n";
    }

    return "Name: "+this.name+"\n"+
           "Job: "+this.job+"\n"+
           "Registration: "+getRegistration()+"\n"+
           "Emails send: \n"+emailsSend+
           "-----------------\n"+
           "Emails received: \n"+emailsReceived;
  }
}
