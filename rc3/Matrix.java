import java.util.Scanner;

public class Matrix{
  public static void main(String[] args){

       Scanner sc=new Scanner(System.in);
       int i, j;

       System.out.print("Enter the first matrix row size:");
       int r1=sc.nextInt();

       System.out.print("Enter the first matrix column size:");
       int c1=sc.nextInt();

       System.out.print("Enter the second matrix row size:");
       int r2=sc.nextInt();

       System.out.print("Enter the second matrix column size:");
       int c2=sc.nextInt();

       int[][] A = new int[r1][c1];
       int[][] B = new int[r2][c2];

       System.out.println("Enter elements for matrix A: ");
       for(i=0;i<r1;i++){
           for(j=0;j<c1;j++){
               A[i][j] = sc.nextInt();
           }
       }

       System.out.println("Enter elements for matrix B: ");
       for(i=0;i<r2;i++){
           for(j=0;j<c2;j++){
               B[i][j] = sc.nextInt();
           }
       }

       while(true){
          System.out.print("\n----MENU----");
          System.out.print("\n1.Addition");
          System.out.print("\n2.Multiplication");
          System.out.print("\n3.Exit");

          System.out.print("\nEnter your option:");
          int choice = sc.nextInt();
          if(choice==3) break;

          switch(choice){
              case 1:
                   if(r1==r2 && c1==c2){
                     System.out.println("Sum Matrix: ");
                     for(i=0;i<r1;i++){
                         for(j=0;j<c1;j++){
                             System.out.print(A[i][j]+B[i][j]+"\t");
                         }
                         System.out.println();
                     }
                   }else{
                      System.out.println("Eror: Dimensions must be same for Addition");
                   }
                   break;

              case 2:
                   if(c1==r2){
                      System.out.println("Product Matrix:");
                      int[][] c= new int[r1][c2];

                      for(i=0;i<r1;i++){
                          for(j=0;j<c2;j++){
                              c[i][j]=0;
                              for(int k=0;k<c1;k++){
                                  c[i][j]+=A[i][k]*B[k][j];
                              }
                              System.out.print(c[i][j]+"\t");
                          }
                          System.out.println();
                      }
                   }
                   else{
                      System.out.print("Error:col of A must equal Row of B");
                   }
                   break;

              default:
                  System.out.println("Invalid Choice!");
          }
       }
   }
}

