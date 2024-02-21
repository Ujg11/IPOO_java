package MisFunciones;
import java.util.Scanner;

public class LongCalculoFactorial {
     public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        long n, fact;

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
//La ventatge és que el rang de valors del tipus long és més fran que el tipus
//int, així que podem fer el factorial de nombres més grans sense que el valor
//sobrepassi el rang