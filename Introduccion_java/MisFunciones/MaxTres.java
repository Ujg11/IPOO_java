package MisFunciones;

import java.util.Scanner;

    public class MaxTres {
        public static void main(String[] args) {
            int x,y,z, max;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escribe un entero:");
            x = scanner.nextInt();
            max = x;
            System.out.println("Escribe otro entero:");
            y = scanner.nextInt();
            if (y > max)
                max = y;
            System.out.println("Escribe un último entero");
            z = scanner.nextInt();
            if (z > max)
                max = z;
            System.out.println("Máximo = " + max);
            scanner.close();
    }
}
