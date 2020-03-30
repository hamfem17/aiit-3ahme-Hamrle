package ue01_taschenrechner;

import java.util.Scanner;

public class TestTaschenrechner
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Wert a:");
		Taschenrechner.a = reader.nextDouble();
		
		System.out.print("Wert b:");
		Taschenrechner.b = reader.nextDouble();
		reader.close();
		
		String addition = String.format("%.3f", Taschenrechner.getAdditionResult(Taschenrechner.a, Taschenrechner.b));
        	String subtraction = String.format("%.3f", Taschenrechner.getSubtractionResult(Taschenrechner.a, Taschenrechner.b));
        	String multiplication = String.format("%.3f", Taschenrechner.getMultiplicationResult(Taschenrechner.a, Taschenrechner.b));
        	String division = String.format("%.3f", Taschenrechner.getDivisionResult(Taschenrechner.a, Taschenrechner.b));
		
		System.out.println(Taschenrechner.getAdditionResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getSubtractionResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getMultiplicationResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getDivisionResult(Taschenrechner.a, Taschenrechner.b));
	}
}
