package MisFunciones;
import java.util.Scanner;

public class IntCalculoFactorial {
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        int n, fact;

        System.out.println("Introduzca el numero que quieras saber el factorial");
        n = scanner.nextInt();
        fact = 1;
        while (n > 0)
        {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial = " + fact);
        scanner.close();
    }
}

