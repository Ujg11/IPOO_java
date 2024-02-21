package HolaMundo;

public class HolaAdios {
    public static void main(String[] argv)
    {
        int i = 1;

        while (i < 11)
        {
            if (i  % 2 == 0)
                System.out.println(i + ": Adiós mundo cruel!");
            else
                System.out.println(i + ": Hola mundo feliz!");
            i++;
        }
    }
}
