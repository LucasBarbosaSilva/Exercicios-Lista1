package exercise4;

abstract class Shape {
  private Color color;

  public Shape(String color){
    this.color = Color.valueOf(color);
  }

  public Color color(){
    return color;
  }
  abstract public double area();
}
