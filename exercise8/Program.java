package exercise8;

import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    
    String[][] datas = {{"Lucas", "12345678","5","Nota 1","6","Nota 2","7","Nota 3","8","Nota 4","9","Nota 5"},
                   {"Lucas "+
                   "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "201456789","-1","","6","Nota 2","7","Nota 3","8","Nota 4","9","Nota 5"},
                   {"Lucas Barbosa", "20145678","5","","6","Nota 2","7","Nota 3","8","Nota 4","9","Nota 5"},
                   {"Lucas Barbosa", "20145678","5","Nota 1","6","Nota 2","7","Nota 3","8","Nota 4","9","Nota 5"}};
    ArrayList<Student> students = new ArrayList<Student>();
    for (String[] data: datas){
      String name = data[0];
      if(!Student.fullNameIsValid(name)){
        System.out.println("Invalid name!");
        continue;
      }
      String registration = data[1];
      if(!Student.registrationIsValid(registration)){
        System.out.println("Invalid registration");
        continue;
      }

      boolean gradesOK = true;
      ArrayList<Grade> studentGrades = new ArrayList<Grade>();
      for (int i = 2; i < 12; i = i+2){
        double gradeValue = Double.parseDouble(data[i]);
        if(!Grade.gradeIsValid(gradeValue)){
          System.out.println("Invalid grade");
          gradesOK = false;
          break;
        } 
        String subject = data[i+1];
        if(!Grade.subjectIsValid(subject)){
          System.out.println("Invalid subject");
          gradesOK = false;
          break;
        } 
        Grade grade = new Grade(gradeValue, subject);
        studentGrades.add(grade);
        System.out.println(studentGrades);
      }
      if(!gradesOK){
        continue;
      }
      System.out.println(studentGrades);
      Student student = new Student(name, registration, studentGrades);
      students.add(student);
    }
    
    if(students.size() > 0){
      System.out.println("Alunos cadastrados com sucesso:\n");
    for (Student student: students){
      System.out.println("-------------------------------------------");
      System.out.println(student.getReportCard());
      System.out.println("-------------------------------------------");
    }
    }else{
      System.out.println("Nenhum aluno válido");
    }
    
  }
  
}