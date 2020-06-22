package ue02_serienschaltung;

import java.util.Scanner;

public class SerienschaltungRechner
{
    public static void main(String[] args)
    {
        final Serienschaltung serienschaltung = new Serienschaltung();
        try
        {
            System.out.print("Strom/A: ");
            final double strom = new Scanner(System.in).nextDouble();
            serienschaltung.setStrom(strom);
        }catch (Exception ex)
        {
            System.exit(1);
        }
        while(true)
        {
            System.out.print("Widerstand/Ohm: ");
            double r = new Scanner(System.in).nextDouble();
            try
            {
                serienschaltung.addWiderstand(r);
            }catch (InvalidResistorValueException ex)
            {
                System.out.println("Ergebnis:");
                System.out.println(serienschaltung);
                return;
            }

        }
    }
}
