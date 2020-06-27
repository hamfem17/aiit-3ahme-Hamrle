package ue5_25_05_2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KoerperGruppe
{
    private final List<Koerper> koerperList = new ArrayList<>();
    private double dichte;

    public KoerperGruppe()
    {
        
    }
    
    public KoerperGruppe (Collection<Koerper> koerperList, double dichte)
    {
        this.koerperList.addAll(koerperList);
        setDichte(dichte);
    }

    public int size()
    {
        return koerperList.size();
    }

    public boolean contains(Koerper k)
    {
        return koerperList.contains(k);
    }

    public boolean add(Koerper k)
    {
        k.setDichte(dichte);
        return koerperList.add(k);
    }

    public boolean remove(Koerper k)
    {
        return koerperList.remove(k);
    }

    public double getDichte() {
        return dichte;
    }

    public final void setDichte(double dichte) {
        this.dichte = dichte;
        for (Koerper k : this.koerperList)
        {
            k.setDichte(dichte);
        }
    }

    public List<Koerper> getKoerperListe ()
    {
        return koerperList;
    }
    
    public Koerper[] toArray()
    {
        Koerper [] rv = new Koerper [koerperList.size()];
        koerperList.toArray(rv);
        return rv;
    }
    
    public double gesamtMasse()
    {
        double rv = 0.0;
        for(Koerper k: koerperList)
        {
            rv += k.masse();
        }
        return rv;
    }
    
    public double gesamtVolumen()
    {
        double rv = 0.0;
        for(Koerper k: koerperList)
        {
            rv += k.volumen();
        }
        return rv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("[\n");
        boolean firstLine = true;
        for (Koerper k : koerperList)
        {
            if (firstLine)
            {
                firstLine = false;
            }else{
                sb.append(",\n");
            }
            sb.append("   ").append(k.toString());
        }
        sb.append("\n]");
        return sb.toString();
    }
    

}