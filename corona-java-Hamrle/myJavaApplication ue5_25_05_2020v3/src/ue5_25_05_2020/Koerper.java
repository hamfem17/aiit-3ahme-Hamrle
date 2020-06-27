package ue5_25_05_2020;


public abstract class Koerper
{
    protected double dichte;
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;

    public Koerper(double dichte) throws IllegalArgumentException
    {
        if (dichte < 0)
        {
            throw new IllegalArgumentException("invalid parameter dichte");
        }
        this.dichte = dichte;
    }

    public double getDichte()
    {
        return dichte;
    }

    public void setDichte(double dichte)
    {
        this.dichte = dichte;
    }
    
    public abstract double oberflache();

    public abstract double volumen();
    
    public double masse()
    {
        return dichte * volumen();
    }
    

    
    
}
