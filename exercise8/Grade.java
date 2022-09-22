package exercise8;

public class Grade {
  private double grade;
  private String subject;

  public Grade(){

  }
  public Grade(double grade, String subject){
    this.setGrade(grade);
    this.subject = subject;
  }

  public void setGrade(double grade){
    if(gradeIsValid(grade)){
      this.grade = grade;
    }else{
      System.out.println("Invalid grade: must be greater than or equal to 0 and less than or equal to 10");
    }
  }

  public static boolean gradeIsValid(double grade){
    if(grade >= 0 && grade <=10){
      return true;
    }else{
      return false;
    }
  }

  public void setSubject(String subject) {
    if(subjectIsValid(subject)){
      this.subject = subject;
    }else{
      System.out.println("Invalid subject: must not be empty");
    }
  }

  public static boolean subjectIsValid(String subject){
    if(subject.length() != 0){
      return true;
    }else{
      return false;
    }
  }

  public double getGrade(){
    return this.grade;
  }

  public String getInfo(){
    return this.grade + " " + this.subject;
  }
}
