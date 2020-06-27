package ue5_25_05_2020;


public class Koerper
{
    private double dichte;
    public static double DICHTE_EICHE = 670;
    public static double DICHTE_BUCHE = 690;

    public Koerper(double dichte)
    {
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
    
    public double masse()
    {
        return dichte * volumen();
    }
    
    public double oberflache()
    {
        return dichte;
    }
    
    public double volumen()
    {
        return dichte;
    }
    
}
