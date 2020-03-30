package ue01_taschenrechner;

import java.util.Scanner;

public class TestTaschenrechner {
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Wert a:");
		Taschenrechner.a = reader.nextDouble();
		
		System.out.println("Wert b:");
		Taschenrechner.b = reader.nextDouble();
		reader.close();
		
		
		
		System.out.println(Taschenrechner.getAdditionResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getSubtractionResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getMultiplicationResult(Taschenrechner.a, Taschenrechner.b));
		System.out.println(Taschenrechner.getDivisionResult(Taschenrechner.a, Taschenrechner.b));
	}
}
