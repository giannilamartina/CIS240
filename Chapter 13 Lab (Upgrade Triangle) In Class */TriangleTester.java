import java.util.ArrayList;
import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Triangle triangle = new Triangle(Color.white, false);
    System.out.print("Please enter the first side:");
    triangle.setSide1(input.nextDouble());
    System.out.print("Please enter the second side:");
    triangle.setSide2(input.nextDouble());
    System.out.print("Please enter the third side:");
    triangle.setSide3(input.nextDouble());
    Rectangle rectangle = new Rectangle();
    System.out.print("Please enter the Rectangle height: ");
    rectangle.setHeight(input.nextDouble());
    System.out.print("Please enter the Rectangle width: ");
    rectangle.setWidth(input.nextDouble());
    
    ArrayList<GeometricObject> shapes = new ArrayList<GeometricObject>();
    
    
    for (GeometricObject s : shapes) {
      System.out.println("Perimeter: " + s.calculatePerimeter());
      System.out.println("Area: " + s.calculateArea());
      System.out.println("ToString: " + s.toString());
    }
    
    


  }

}
