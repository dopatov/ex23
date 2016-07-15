import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc=new Scanner(System.in);
        int Numero;
        int MultiploDe3=0;
        int ContadorMultiplos=0;

        for (int i=0; i<=4; i++)
        {
            System.out.println("introduce un numero");
            Numero=sc.nextInt();

            if (Numero%3==0) {
                MultiploDe3 = Numero;
                ContadorMultiplos++;
            }
        }

        if (MultiploDe3==0)
            System.out.println("no hay ningún multiplo");
        else
        {
            System.out.println("Hay " +ContadorMultiplos +" multiplos de tres");
        }
    }
}
