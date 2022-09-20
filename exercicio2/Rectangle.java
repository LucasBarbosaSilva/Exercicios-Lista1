package exercicio2;

public class Rectangle {
  private double width;
  private double height;
  
  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }
  public double area(){
    double area = this.height*this.width;
    return area;
  }

  public double perimeter(){
    double perimeter = 2*this.width + 2*this.height;
    return perimeter; 
  }

  public double diagonal(){
    double diagonal= Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    return diagonal;
  }
}
