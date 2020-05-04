package ue02_serienschaltung;

import java.util.Scanner;

public class SerienschaltungRechner {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Please enter the current: ");
                final double strom = sc.nextDouble();
                serienschaltung.setStrom(strom);
                break;
            } catch (java.util.InputMismatchException ex) {

            }
        }

        try {
            while(true) {
                System.out.print("Please enter a resistor: ");
                final double widerstand = sc.nextDouble();
                serienschaltung.addWiderstand(widerstand);
            }
        } catch(InvalidResistorValueException ex) {
            System.out.println("Fehler aufgetreten bei " + ex.getInvalidValue() + ". Ergebnis wird berechnet!");
            ex.printStackTrace(System.out);
            System.out.println("Spannung: " + serienschaltung.getSpannung());
        }
    }
}
