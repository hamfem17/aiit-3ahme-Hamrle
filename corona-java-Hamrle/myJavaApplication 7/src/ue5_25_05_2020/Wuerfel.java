package ue5_25_05_2020;

import java.util.Locale;


public class Wuerfel extends Koerper
{
    private double a;

    public Wuerfel (double a)
    {
        super(0.0);
        if (a <= 0)
        {
            throw new IllegalArgumentException("invalid parameter a");
        }
        this.a = a;
    }
    
    public Wuerfel(double a, double dichte) throws IllegalArgumentException
    {
        super(dichte);
        this.a = a;
    }

    public double getA()
    {
        return a;
    }
    
    public void setA(double a)
    {
        this.a = a;
    }
    
    @Override
    public double oberflache()
    {
        return (a*a)*6;
    }
    @Override
    public double volumen()
    {
        return (a*a*a);
    }

    @Override
    public String toString()
    {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"dichte\":%e}", a, dichte);
    }
    
    
}
