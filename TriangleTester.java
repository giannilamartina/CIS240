import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Triangle triangle = new Triangle();
    System.out.print("Please enter the first side:");
    triangle.setSide1(input.nextDouble());
    System.out.print("Please enter the second side:");
    triangle.setSide2(input.nextDouble());
    System.out.print("Please enter the third side:");
    triangle.setSide3(input.nextDouble());
    
    System.out.println("Perimeter: " + triangle.calculatePerimeter());
    System.out.println("Area: " + triangle.calculateArea());
    System.out.println("ToString: " + triangle.toString());


  }

}
