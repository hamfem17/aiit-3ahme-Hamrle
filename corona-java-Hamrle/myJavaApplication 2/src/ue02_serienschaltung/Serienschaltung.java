package ue02_serienschaltung;

public class Serienschaltung
{
    private double strom;
    private double spannung;
    private double[] widerstandFeld;
    
    private void updateSpannung()
    {
        if(widerstandFeld == null)
        {
            return;
        }
        
        double gesammtwiderstand = 0.0;
        for( double Widerstand :  widerstandFeld){
            gesammtwiderstand += Widerstand;
        }
        spannung = gesammtwiderstand * strom;
        
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException
    { 
        if(widerstandInOhm < 0 || widerstandInOhm > 10E6)
        {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        
        if(widerstandFeld == null)
        {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        } else {
            final double [] neuesFeld = new double[widerstandFeld.length + 1];
            for (int i = 0; i < widerstandFeld.length; i++)
            {
                neuesFeld[i] = widerstandFeld[i];
            }
            neuesFeld[neuesFeld.length - 1] = widerstandInOhm;
            widerstandFeld = neuesFeld; 
        }  
        updateSpannung();
    }
    
    public double getStrom()
    {
        return this.strom;
    }
    
    public void setStrom(double strom)
    {
        this.strom = strom;
        updateSpannung();
    }
    
    public double getSpannung()
    {
        return this.spannung;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandFeld=" + widerstandFeld + '}';
    }
    
    

    

    
}
