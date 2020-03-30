package laborSx;


import java.util.Date;


class Auto
{
	public String name;
	public int    erstzulassung;
	public int    leistung;
}

class Father
{
	private String s1 = labor.getAndPrint("Father.s1");
	public Father()
	{
		labor.getAndPrint("Father.<init>");
	}
}

class Son
extends Father
{
	private String s1 = labor.getAndPrint("Son.s1");
	public Son()
	{
		labor.getAndPrint("Son.<init>");
	}
}


class Cabrio
extends Auto
{
	int vdauer;
}

class ZweisitzerCabrio
extends Cabrio
{
   boolean notsitze;
   public int alter()
   {
	   return 12 * (2000 - erstzulassung);
   }
}

class ClassWithPrivateA
{
	private int a;

	public ClassWithPrivateA(int a)
	{
		this.a = a;
	}
	public void setOtherA(ClassWithPrivateA other, int newvalue)
	{
		other.a = newvalue;
	}
	public String toString()
	{
		return "" + a;
	}
}

class Test
{
	static int i;
	static int j;
	static
	{
		i = 5;
		j = 3 * i;
	}
}


abstract class Mitarbeiter
{
	int persnr;
	String name;
	Date eintritt;

	public Mitarbeiter()
	{
	}
	public abstract double monatsBrutto();
}

class Arbeiter
extends Mitarbeiter
{
	double stundenlohn;
	double anzahlstunden;
	double ueberstundenzuschlag;
	double anzahlueberstunden;
	double schichtzulage;
	public double monatsBrutto()
	{
		return stundenlohn*anzahlstunden+
				ueberstundenzuschlag*anzahlueberstunden+
				schichtzulage;
	}
}


class Angestellter
extends Mitarbeiter
{
	double grundgehalt;
	double ortszuschlag;
	double zulage;
	public double monatsBrutto()
	{
		return grundgehalt+ortszuschlag+zulage;
}
}


class Manager
extends Mitarbeiter
{
	double fixgehalt;
	double provision1;
	double provision2;
	double umsatz1;
	double umsatz2;
	public double monatsBrutto()
	{
		return fixgehalt+umsatz1*provision1/100+
				umsatz2*provision2/100;
	}
}

class GFManager
extends Manager
{
	double gfzulage;

	public double monatsBrutto()
	{
		return super.monatsBrutto()+gfzulage;
	}
}


class SingleValue
{
	protected int value1;

	public SingleValue(int value1)
	{
		this.value1 = value1;
		print();
	}
	public void print()
	{
		System.out.println("value = " + value1);
	}
}


class ValuePair
extends SingleValue
{
	protected int value2;

	public ValuePair(int value1, int value2)
	{
		super(value1);
		this.value2 = value2;
	}
	public void print()
	{
		System.out.println("value = (" + value1 + "," + value2 + ")");
	}
}


public class labor
{
	public String name;
	public int    erstzulassung;
	public int    leistung;
	public int	  vdauer;
	
	public void Auto(String name)
	{
		this.name = name;
	}
	public void Auto(String name,int erstzulassung, int leistung)
	{
		this.name = name;
		this.erstzulassung = erstzulassung;
		this.leistung = leistung;
	}
	public int alter()
	{
		return 2000 - this.erstzulassung;
	}
	public void printAlter(int wieoft)
	{
		while (wieoft-- > 0) {
			System.out.println("Alter = " + alter());
		}
	}
	public int alter(String titel)
	{
		int alter = alter();
		System.out.println(titel+alter);
		return alter;
	}
	
	
	public static String getAndPrint(String s)
	{
		System.out.println(s);
		return s;
	}


	static private int objcnt = 0;
	public labor()
	{
		++objcnt;
	}
	public void finalize()
	{
		--objcnt;
	}
	
	
	private static final double STEUERSATZ = 18.9;
	
	
	private static final int ANZ_MA = 100;
	private static Mitarbeiter[] ma;
	private static double bruttosumme;
	
	
	public static void main(String[] args)
	{
		labor meinKombi;
		meinKombi = new labor();
		labor meinKombi2 = new labor();
		
		meinKombi.name = "Mercedes 600";
		meinKombi.erstzulassung = 1972;
		meinKombi.leistung = 250;
		
		meinKombi2.name = "Mercedes";
		meinKombi2.erstzulassung = 2000;
		meinKombi2.leistung = 400;
		
		System.out.println("Name........: "+meinKombi.name);
		System.out.println("Zugelassen..: "+meinKombi.erstzulassung);
		System.out.println("Leistung....: "+meinKombi.leistung);
		System.out.println();
		
		System.out.println("Name........: "+meinKombi2.name);
		System.out.println("Zugelassen..: "+meinKombi2.erstzulassung);
		System.out.println("Leistung....: "+meinKombi2.leistung);
		System.out.println();
		
		
		labor golf1 = new labor();
		golf1.erstzulassung = 1990;
		System.out.println(golf1.alter());
		System.out.println();
		
		
		Son son = new Son();
		System.out.println();
		
		
		labor kfz1 = new labor();
		kfz1.name = "MX5";
		kfz1.erstzulassung = 1994;
		kfz1.leistung = 115;
		kfz1.vdauer = 120;
		System.out.println("Alter = "+kfz1.alter());
		
		
		ZweisitzerCabrio kfz2 = new ZweisitzerCabrio();
		kfz2.name = "911-T";
		kfz2.erstzulassung = 1982;
		kfz2.leistung = 94;
		kfz2.vdauer = 50;
		kfz2.notsitze = true;
		System.out.println("Alter = "+kfz1.alter());
		System.out.println();
		
		ClassWithPrivateA a1 = new ClassWithPrivateA(7);
		ClassWithPrivateA a2 = new ClassWithPrivateA(11);
		a2.setOtherA(a1, 999);
		System.out.println("a1 = " + a1.toString());
		System.out.println("a2 = " + a2.toString());
		

		 labor auto1;
		 labor auto2 = new labor();
		 System.out.println("Anzahl Testauto-Objekte: " + labor.objcnt);
		 System.out.println();
		 System.out.println();
		 
		 
		 double x, y;
		 for (x = 0.0; x <= 10.0; x = x + 1.0)
		 {
			 y = Math.sqrt(x);
			 System.out.println("sqrt("+x+") = "+y);
		 }
		 
		 ma = new Mitarbeiter[ANZ_MA];
		 bruttosumme = 0.0;
		 
		 /**
		  * for (int i = 0; i < ma.length; ++i)
		  * {
		  * bruttosumme = ma[i].monatsBrutto() + bruttosumme;
		  * }
		  */
		 
		 System.out.println("Bruttosumme = "+bruttosumme);
		 
		 
		 new ValuePair(10,20);
	}
}

