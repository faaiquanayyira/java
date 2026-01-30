import java.util.Scanner;
class Complex{
    double real;
    double img;
    Complex(){
    real=0;
    img=0;
    } 
    Complex(double r,double i){
    real=r;
    img=i;
    }
    Complex add(Complex a){
       Complex result = new Complex();
       result.real = real + a.real;
       result.img = img + a.img;
       return result;
    }
    Complex substract(Complex s){
       Complex result = new Complex();
       result.real = real - s.real;
       result.img = img - s.img;
       return result;
    }
    Complex multy(Complex m){
       Complex result = new Complex();
       result.real =(real * m.real) - (img * m.img) ;
       result.img = (real * m.img) + (img * m.real);
       return result;
    }
    void display(){
      System.out.println(real + " + " + img + " i ");
    }
}

public class ComplexNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first Real Part:");
        double r1=sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter the first imaginary Part:");
        double i1=sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter the second Real Part:");
        double r2=sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter the second imaginary Part:");
        double i2=sc.nextDouble();
        sc.nextLine();
        
        Complex comp1= new Complex(r1,i1);
        Complex comp2=new Complex(r2,i2);
        
        Complex sum = comp1.add(comp2);
        Complex diff = comp1.substract(comp2);
        Complex prod = comp1.multy(comp2);
        
        System.out.print("Sum:  ");
        sum.display();  
        
        System.out.print("Difference:  ");
        diff.display();
        
        System.out.print("product:  ");
        prod.display();
    }
}
