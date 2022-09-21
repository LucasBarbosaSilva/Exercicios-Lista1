package exercise4;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(String color, double width, double height){
    super(color);
    this.height = height;
    this.width = width;
  }

  public double area(){
    return this.height * this.width;
  }
}
