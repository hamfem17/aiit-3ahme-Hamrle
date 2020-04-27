package ue02_serienschaltung;

public class Serienschaltung
{
    private double strom;
    private double spannung;
    private double [] widerstandFeld;
    
    private void updateSpannung()
    {
        double gesammtwiderstand = 0;
        for(int i = 0; i < widerstandFeld.length; i++)
        {
            gesammtwiderstand += widerstandFeld [i];
        }
        
        this.spannung = gesammtwiderstand * strom;
        
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException
    { 
        if(widerstandInOhm > 10000000 || widerstandInOhm < 0)
        {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        
        if(widerstandFeld == null)
        {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        }else{
            double [] widerstandBackup = widerstandFeld;
            widerstandFeld = new double[widerstandFeld.length + 1];
            widerstandFeld[widerstandFeld.length - 1] = widerstandInOhm;
            for(int i = 0; i < widerstandBackup.length; i++)
            {
                widerstandFeld[i] = widerstandBackup[i];
            }
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
