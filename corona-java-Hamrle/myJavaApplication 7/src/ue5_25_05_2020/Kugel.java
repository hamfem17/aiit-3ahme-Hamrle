package ue5_25_05_2020;

import java.util.Locale;

public class Kugel extends Koerper
{
    public double r;
    
    public Kugel(double r)
    {
        super(0.0);
        if (r <= 0)
        {
            throw new IllegalArgumentException("invalid parameter r");
        }
        this.r = r;
    }
    public Kugel(double r,double dichte)
    {
        super(dichte);
        this.r = r;
    }
    public double getR()
    {
        return r;
    }
    public void setR(double r)
    {
        this.r = r;
    }
    
    @Override
    public double oberflache()
    {
        return (r*r)*4.0*(22.0/7.0);
    }
    @Override
    public double volumen()
    {
        return (4.0/3.0)*(22.0/7.0)*(r*r*r);
    }
    @Override
    public String toString()
    {
        return String.format(Locale.ENGLISH, "{\"r\":%e,\"dichte\":%e}", r, dichte);
    }
}
