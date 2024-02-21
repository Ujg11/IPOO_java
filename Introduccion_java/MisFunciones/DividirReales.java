package MisFunciones;
import java.util.Scanner;

public class DividirReales {
    public static void main(String[] args) {
        float x,y,div;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe un numero real:");
        x = scanner.nextFloat();
        System.out.println("Escribe otro numero real:");
        y = scanner.nextFloat();
        if (y != 0)
        {
             div = x / y;
             System.out.println("Máximo = " + div);
        }
        else
            System.out.println("No se puede dividir por 0");
        scanner.close();
    }
}
