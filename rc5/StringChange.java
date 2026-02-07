import java.util.Scanner;

public class StringChange{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a string: ");
     String s1 = new String(sc.nextLine());
     System.out.print("");
     
     System.out.println("Length os the string is: "+s1.length());
     System.out.println(" ");
     
     System.out.println("Enter a string for concatinate: ");
     String s2 = new String(sc.nextLine());
     String s3 = s1+" "+s2;
     System.out.println("Concatinated string is: "+s3);
     System.out.println(" ");
     
     char ch = s1.charAt(2);
     System.out.println("Character at index 2 in s1: "+ch);
     System.out.println(" ");
     
     System.out.println("Enter a new string: ");
     String s4 = sc.nextLine();
     System.out.println("Using equals(): "+s1.equals(s4));
     System.out.println("Using CompareTo(): "+s1.compareTo(s4));
     System.out.println(" ");
     
     int index = s3.indexOf("a");
     System.out.println("IndexOf a is:"+index);
     System.out.println(" ");
     
     String s6 = new String("Hello");
     String re = s6.replace("Hello", "hi");
     System.out.println(" ");
     
     System.out.println("Have to replace:"+s6);
     System.out.println("Replaced code is: "+re);
     System.out.println(" ");
     
     System.out.println("Enter a string for uppercase: ");
     String s5 = new String(sc.nextLine());
     System.out.println("Uppercase: "+s5.toUpperCase());
     System.out.println(" ");
     
     System.out.println("Enter a number: ");
     int num = sc.nextInt();
     sc.nextLine();
     String numStr = String.valueOf(num);
     System.out.println("String value of number: " + numStr);
     System.out.println(" ");

      System.out.println("Enter a string to split (use comma): ");
      String str = sc.nextLine();
      String[] languages = str.split(",");
      System.out.println("Split string: ");
      for(String lang : languages){
          System.out.println(lang);
      }    
      System.out.println(" ");
  
      System.out.println("Enter a string for StringBuffer: ");
      String sbInput = sc.nextLine();
      StringBuffer sb = new StringBuffer(sbInput);

      System.out.println("Enter a string to append: ");
      String appendStr = sc.nextLine();
      sb.append(" ").append(appendStr);

      System.out.println("StringBuffer result: " + sb);

  }
}

