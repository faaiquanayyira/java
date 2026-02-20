import java.util.Scanner;

class Geometry {

   double area (double r){
	return Math.PI*r*r;   
   }
   double area(double l,double b){
      return l*b;
   }
   double area(double a, double b, double c){
       if( (a+b <= c) | (a+c <= b) | (b+c <= a)){
            System.out.println("Check your values:");
            return 0.0;
       }
     double s = (a + b + c) / 2.0;
   	return Math.sqrt(s * (s - a) * (s - b) * (s - c));
   
   }
}

public class MethodOverloadingDemo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("--- Method Overloading: Area Calculation ---\n");
      Geometry geo = new Geometry();
      
      System.out.print("Enter radius of the Circle: ");
      double r = sc.nextDouble();
      System.out.println("The area of the circle is: " + geo.area(r));
      
      System.out.print("\nEnter length and breadth of the Rectangle: ");
      double l = sc.nextDouble();
      double b = sc.nextDouble();
      System.out.println("The area of the Rectangle is: " + geo.area(l,b));
      
      System.out.print("\nEnter three sides of the Triangle (a b c): ");
      double sideA = sc.nextDouble();
      double sideB = sc.nextDouble();
      double sideC = sc.nextDouble();
      System.out.println("The area of the Triangle is: " + geo.area(sideA,sideB,sideC));
   }
}
