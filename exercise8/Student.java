package exercise8;

import java.util.ArrayList;

public class Student {
  private String fullName;
  private String registration;
  private ArrayList<Grade> studentGrades = new ArrayList<>(5);
  private double semesterGrade;
  private double finalGrade;

  public Student(String fullName, String registration, ArrayList<Grade> grades){
    setFullName(fullName);
    setRegistration(registration);
    setStudentGrades(studentGrades);
    System.out.println(studentGrades);
    calcSemesterGrade();
    calcFinalGrade();
  }

  public void setFullName(String fullName) {
    if(fullNameIsValid(fullName)){
      this.fullName = fullName;
    }else{
      System.out.println("Invalid name: must have at least two names and less than 50 characters");
    }
  }

  public static boolean fullNameIsValid(String fullName){
    if(fullName.split(" ").length > 1 &&
       fullName.length() <=50
    ){
      return true;
    }else{
      return false;
    }
  }

  public void setRegistration(String registration) {
    if(registrationIsValid(registration)){
      this.registration = registration;
    }else{
      System.out.println("Invalid registration: must be 8 characters long and start with \"201\"");
    }
  }

  public static boolean registrationIsValid(String registration){
    if(registration.length() == 8 && (
       registration.charAt(0) == '2' &&
       registration.charAt(1) == '0' &&
       registration.charAt(2) == '1'
    )){
      return true;
    }else{
      return false;
    }
  }

  public void setStudentGrades(ArrayList<Grade> studentGrades) {
    Grade menor = new Grade(0, "subject");
    for (Grade grade: studentGrades){
      if(grade.getGrade() < menor.getGrade()){
        menor = grade;
      }
    }
    studentGrades.remove(menor);
    this.studentGrades = studentGrades;
  }
  public void calcSemesterGrade() {
    double sumGrades = 0;
    for (Grade grade: studentGrades){
      sumGrades = sumGrades + grade.getGrade();
    }

    this.semesterGrade = sumGrades / 4;
  }
  public void calcFinalGrade() {
    if(this.semesterGrade < 6){
      this.finalGrade = this.semesterGrade * 0.75;
    }else if(this.semesterGrade >= 6 && 
             this.semesterGrade < 7    
    ){
      this.finalGrade = 7.00;
    }else if(this.semesterGrade >= 7 && 
             this.semesterGrade <= 8
    ){
      this.finalGrade = this.semesterGrade*1.15;
    }else{
      this.finalGrade = 10.00;
    }
  }

  public double getFinalGrade() {
    return finalGrade;
  }

  public String getGrades(){
    String grades = "";
    for (Grade grade: this.studentGrades){
      grades = "| "+grades + grade.getInfo() + "\n";
    }
    return grades;
  }

  public String getReportCard(){
    String reportCard = "Registration: "+this.registration+
                        "\nFull name: "+this.fullName+
                        "\nGrades:\n"+this.getGrades()+
                        "Semester grade: "+ this.semesterGrade+
                        "\nFinal grade: "+ this.finalGrade;
    return reportCard;
  }
}
