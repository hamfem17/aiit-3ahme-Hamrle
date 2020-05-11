package ue02_serienschaltung;

import java.util.ArrayList;

public class Serienschaltung
{
    private double strom;
    private double spannung;
    ArrayList<Double> widerstandFeld = new ArrayList<>();
    
    private void updateSpannung()
    {
        if(widerstandFeld.isEmpty())
        {
            spannung = 0;
            return;
        }
        
        double gesammtwiderstand = 0.0;
        for(int i = 0; i < widerstandFeld.size(); i++){
            gesammtwiderstand += widerstandFeld.get(i);
        }
        spannung = gesammtwiderstand * strom;
        
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException
    { 
        if(widerstandInOhm < 0 || widerstandInOhm > 10E6)
        {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        
        widerstandFeld.add(widerstandInOhm);
        
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
