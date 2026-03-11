import java.util.Scanner;
import mathutils.Calculator;

public class Cal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number: ");
    double a = sc.nextDouble();
    
    System.out.println("Enter second number: ");
    double b = sc.nextDouble();
    
    Calculator calc = new Calculator();
    
    System.out.println("Addition: " + calc.addition(a, b));
    System.out.println("Subtraction: " + calc.subtraction(a, b));
    System.out.println("Multiplication: " + calc.multiplication(a, b));
    System.out.println("Division: " + calc.division(a, b));
    
  }

} 
