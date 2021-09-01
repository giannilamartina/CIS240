
public class Rectangle extends GeometricObject {
  private double width;
  private double height;
  
  public Rectangle() {};
  
  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    if (width > 0) {
    this.width = width;
    }
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    if (height > 0) {
    this.height = height;
    }
  }
  public double calculateArea() {
    return (getWidth() * getHeight());
  }
  public double calculatePerimeter() {
    return ((getWidth() * 2) + (getHeight() * 2));
  }
  
  @Override
  public String toString() {
    return "ToString: Rectangle:height: " + getHeight() + " width: " + getWidth() + " created on " + getDateCreated() + " color: " + getColor() + " and filled: " + isFilled();
  }
  
}
