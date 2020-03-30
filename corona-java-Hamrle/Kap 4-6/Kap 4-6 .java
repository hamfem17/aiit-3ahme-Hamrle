/**
	 * 1.) Primitive Datentypen
	 * 
	 * Datentypen		Laenge
	 * 
	 * boolean				1
	 * char					2
	 * byte					1
	 * short				2
	 * int					4
	 * long					8
	 * float				4
	 * double				8
	 * 
	 * 2.) Die Fließkommazahlen
	 * 
	 * MAX_VALUE				Größter darstellbarer positiver Wert 
	 * MIN_VALUE				Kleinster darstellbarer positiver Wert
	 * NaN						Not-A-Number 
	 * NEGATIVE_INFINITY		Negativ unendlich
	 * POSITIVE_INFINITY		Positiv unendlich 
	 * 
	 */

import java.io.*;

public class ue1
{
	public static byte fromUnsignedInt(int value)
	{
		return (byte)value;
	}
	public static byte fromChar(char c)
	{
		return (byte)(c & 0xFF);
	}
	public static int toUnsignedInt(byte value)
	{
		return (value & 0x7F) + (value < 0 ? 128 : 0);
	}
	public static char toChar(byte value)
	{
		return (char)toUnsignedInt(value);
	}
	public static String toBitString(byte value)
	{
		char[] chars = new char[8];
		int mask = 1;
		for (int i = 0; i < 8; ++i)
		{
			chars[7 - i] = (value & mask) != 0 ? '1' : '0';
			mask <<= 1;
		}
		return new String(chars);
	}
	public static void Test1(int i)
	{
		int k;
		if (i >= 2)
		{
			k = 5;
		}else
		{
			k = 0;
		}
		System.out.println(k);
	}
	public static void Test2(int i)
	{
		int k = 0;
		if (i < 2)
		{
			k = 1;
		}
		
		if (i > 2)
		{
			k = 6;
		}
		System.out.println(k);
	}
	public static void Test3()
	{
	int a = 5;
	double x = 3.14;
	
	System.out.println("a = " + a);
	System.out.println("x = " + x);
	}
	class Punkt
	{
		int x;
		int y;
		
		Punkt(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	public class SimpleIntList
	{
		private int[] data;
		private int   len;
	
		public SimpleIntList(int size)
		{
			this.data = new int[size];
			this.len  = 0;
		}
		public void add(int value)
		{
			if (full())
			{ 
				throw new RuntimeException("Liste voll");
			}
			data[len++] = value;
			assert !empty(); 
		}
		public void bubblesort()
		{
			if (!empty())
			{
				int cnt = 0;
				while (true)
				{
					assert cnt++ < len: "Zu viele Iterationen"; 
					boolean sorted = true;
					for (int i = 1; i < len; ++i)
					{
						if (sortTwoElements(i - 1, i))
						{
							sorted = false;
						}
					}
					if (sorted)
					{
						break;
					}
				}
			}
		}
		public boolean empty()
		{
			return len <= 0;
		}
		public boolean full()
		{
		return len >= data.length;
		}
		private boolean sortTwoElements(int pos1, int pos2)
		{
			assert (pos1 >= 0 && pos1 < len); 
			assert (pos2 >= 0 && pos2 < len); 
			boolean ret = false;
			if (data[pos1] > data[pos2])
			{
				int tmp = data[pos1];
				data[pos1] = data[pos2];
				data[pos2] = tmp;
				ret = true;
			}
			
			assert data[pos1] <= data[pos2] : "Sortierfehler"; 
			return ret;
		}
	}
	
	
	public static void main(String[] args)
	{
		int a = 1;
		char b = 'x';
		double c = 3.1415;
		boolean d = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int[] x = {1,2,3,4,5};
		int[] e;
		double[] f;
		boolean[] g;
		boolean[] y = {true, true};
		
		e = new int[5];
		f = new double[10];
		g = new boolean[15];
		
		int[] h = new int[5];
		boolean[] i = {true,false};
		h[0] = 2;
		h[1] = 3;
		h[2] = 5;
		h[3] = 7;
		h[4] = 11;
		
		System.out.println("\nh hat "+h.length+" Elemente");
		System.out.println("i hat "+i.length+" Elemente");
		System.out.println(h[0]);
		System.out.println(h[1]);
		System.out.println(h[2]);
		System.out.println(h[3]);
		System.out.println(h[4]);
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println();
		
		int[][] j = new int[3][3];
		
		j[0][0] = 1;
		j[0][1] = 2;
		j[0][2] = 3;
		j[1][0] = 4;
		j[1][1] = 5;
		j[1][2] = 6;
		j[2][0] = 7;
		j[2][1] = 8;
		j[2][2] = 9;
		
		System.out.println(""+j[0][0]+j[0][1]+j[0][2]);
		System.out.println(""+j[1][0]+j[1][1]+j[1][2]);
		System.out.println(""+j[2][0]+j[2][1]+j[2][2]);
		System.out.println();
		
		int[][] k = { {0},
					  {1,2},
					  {3,4,5},
					  {6,7,8,9}
					};
		for (int l = 0; l < k.length; ++l)
		{
			for (int m = 0; m < k[l].length; ++m)
			{
				System.out.print(k[l][m]);
			}
			System.out.println();
		}
		System.out.println();
		for (int n = 0; n < 256; ++n)
		{
			byte o = ue1.fromUnsignedInt(n);
			char p = ue1.toChar(o);
			
			System.out.print(" n =" + n);
			System.out.print(" o =" + ue1.toBitString(o));
			System.out.print(" p =" + (p >= 32 ? p : '.'));
			System.out.println();
		}
		
		ue1.Test1(4);
		ue1.Test2(1);
		ue1.Test3();
		
		System.out.println("\n3 + 4 = " + 3 + 4);
		System.out.println("3 + 4 = " + (3 + 4));
		
		String q = new String("hallo");
		String r = new String("hallo");
		System.out.println("a == b liefert " + (q == r));
		System.out.println("a != b liefert " + (q != r));
		System.out.println();
		
		int s = 55;
		int t = 97;
		if ((s & 15) < (t & 15))
		{ 
			System.out.println("LowByte(55) < LowByte(97)");
		}
		else
		{
			System.out.println("LowByte(55) >= LowByte(97)");
		}
		
		int[][] data = new int[10][10];

		//Multiplikationstafel erstellen
		for (int u = 1; u <= 10; ++u)
		{
			for (int v = 1; v <= 10; ++v)
			{
				data[u - 1][v - 1] = u * v;
			}
		}
		
		//Produkt größer 43 suchen 
		loop1:
		for (int u = 1; u <= 10; ++u)
		{
			for (int v = 1; v <= 10; ++v)
			{
				if (data[u - 1][v - 1] > 43)
				{
					System.out.println(u + "*" + v + "=" + (u * v));
					break loop1;
				}
			}
		}
		System.out.println();
		
		ue1.SimpleIntList;
		
	}
}
