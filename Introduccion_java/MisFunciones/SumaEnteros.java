package MisFunciones;
import java.util.Scanner; 

public class SumaEnteros {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe un entero:");
        x = scanner.nextInt();
        System.out.println("Escribe otro entero:");
        y = scanner.nextInt();
        System.out.println(x + " + " + y + " = " + (x + y));
        scanner.close();
    }
}
