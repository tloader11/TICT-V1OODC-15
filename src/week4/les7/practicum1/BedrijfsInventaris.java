package week4.les7.practicum1;

import java.util.ArrayList;
import java.util.List;

public class BedrijfsInventaris
{
    private String bedrijfsnaam;
    private double budget;
    private List<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }

    public void schafAan(Goed g)
    {
        if(!alleGoederen.contains(g))alleGoederen.add(g);
    }

    @Override
    public String toString() {

        String returnval = "HU met inventaris:\r\n";
        for(Goed g : alleGoederen)
        {
            returnval += g.toString();
        }
        return returnval;
    }
}
