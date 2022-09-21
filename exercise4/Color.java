package exercise4;

public enum Color {
  BLACK(1), BLUE(2), RED(3);  

  private int value;

  private Color(int op){
    this.value = op;
  }

  public int getValue() {
    return value;
  }
}
