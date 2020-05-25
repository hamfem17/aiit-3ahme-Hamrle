package ue5_25_05_2020;


public final class Wuerfel extends Koerper
{
    public double a;

    public Wuerfel(double a)
    {
        super(Koerper.DICHTE_EICHE);
    }
    
    public Wuerfel(double a, double dichte)
    {
        super(dichte);
        setA(a);
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
}
