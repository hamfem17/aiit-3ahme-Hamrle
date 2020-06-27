package ue5_25_05_2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KoerperGruppe
{
    private final List<Koerper> koerperList = new ArrayList<>();
    setDichte(dichte);
    private double dichte;
    
    public KoerperGruppe (Collection<Koerper> koerperList, double dichte)
    {
        this.koerperList.addAll(koerperList);
        this.dichte = dichte;
        for (Koerper k : this.koerperList)
        {
            k.setDichte(dichte);
        }
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
        return koerperList.add(k);
    }

    public boolean remove(Koerper k)
    {
        return koerperList.remove(k);
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
        for (Koerper k : this.koerperList)
        {
            k.setDichte(dichte);
        }
    }

    public Koerper[] toArray()
    {
        Koerper [] rv = new Koerper [koerperList.size()];
        koerperList.toArray(rv);
        return rv;
    }
    
}

//Time 22:15
