/**
 * Triangle class to calculate area of the triangle.
 * 
 * @author Gianni LaMartina
 *
 */
public class Triangle {
  double side1;
  double side2;
  double side3;
  
  Triangle() {
    side1 = 1;
    side2 = 1;
    side3 = 1;
  }
  
  public double getSide1() {
    return side1;
  }
  public void setSide1(double side1) {
    if (side1 > 0) {
    this.side1 = side1;
    }
  }
  public double getSide2() {
    return side2;
  }
  public void setSide2(double side2) {
    if (side2 > 0) {
    this.side2 = side2;
    }
  }
  public double getSide3() {
    return side3;
  }
  public void setSide3(double side3) {
    if (side3 > 0 ) {
    this.side3 = side3;
    }
  }
  
  public double calculatePerimeter() {
    return side1 + side2 + side3;
  }
  
  public double calculateArea() {
    //square root of p(p-a)(p-b)(p-c) where p is half the perimeter
    double halfPer = calculatePerimeter() / 2;
    return Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
  }

  @Override
  public String toString() {
    return "Triangle: side1= " + side1 + ", side2= " + side2 + ", side3= " + side3;
  }
 
}


