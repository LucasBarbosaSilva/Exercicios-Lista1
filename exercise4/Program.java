package exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++ ){
      System.out.printf("**Shape #%d data:**%n", i);
      System.out.print("Rectangle or Circle (r/c)? ");
      String shape = sc.nextLine();
      System.out.println(shape);
      System.out.print("Color (BLACK/BLUE/RED): ");
      String color = sc.nextLine();
      System.out.println();
      if(shape == "r"){
        System.out.print("Width: ");
        double width = sc.nextDouble();  
        System.out.print("Height: ");
        double height = sc.nextDouble();  
        Rectangle rec = new Rectangle(color, width, height);
        System.out.println("SHAPE AREAS:");
        System.out.println();
        System.out.printf("%.2f",rec.area());
      }else{
        System.out.print("Radius: ");
        double radius = sc.nextDouble();  
        System.out.println();  
        Circle circ = new Circle(color, radius);
        System.out.println("SHAPE AREAS:");
        System.out.println();
        System.out.printf("%.2f",circ.area());
      }
      System.out.println();
    }
    
    sc.close();
  }
}
