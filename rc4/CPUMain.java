import java.util.Scanner;

class CPU {
    double price;

    CPU(double c2) {
        price = c2;
    }

    class Processor {
        int no_of_corse;
	String manufacturer;
	
        Processor(int p2, String m) {
            no_of_corse = p2;
            manufacturer=m;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int m1, String m3 ) {
            memory = m1;
            manufacturer=m3;
        }
    }
}

public class CPUMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("CPU price: ");
        int c2 = sc.nextInt();
        sc.nextLine();
        CPU c = new CPU(c2);
        
        
        System.out.println("Processor cores: ");
        int p2 = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Manufactorer: ");
        String m = sc.nextLine();
        CPU.Processor p = c.new Processor(p2,m);
        
        System.out.println("RAM Memory: ");
        int m1 = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Manufactorer: ");
        String m3 = sc.nextLine();
        CPU.RAM r = new CPU.RAM(m1,m3);
        
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + c.price);
        System.out.println("Processor Cores: " + p.no_of_corse);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Memory: " + r.memory);
        System.out.println("RAM Manufacturer: " + r.manufacturer);
        
    }
}


