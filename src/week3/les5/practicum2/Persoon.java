package week3.les5.practicum2;

import java.util.ArrayList;

/**
 * Created by Tristan on 3/20/2018.
 */
public class Persoon
{
    private String naam;
    private double geld;
    private ArrayList<Game> games;

    public Persoon(String naam, double geld) {
        this.naam = naam;
        this.geld = geld;
        games = new ArrayList<>();
    }

    public boolean koop(Game g)
    {
        System.out.println(g.huidigeWaarde());
        if(g.huidigeWaarde() <= this.geld && this.games.indexOf(g) == -1)
        {
            geld -= g.huidigeWaarde();
            games.add(g);
            return true;
        }

        return false;
    }

    public double getGeld()
    {
        return geld;
    }

    public void betaal(double bedrag)
    {
        this.geld -= bedrag;
    }
    public void AddGame(Game g)
    {
        this.games.add(g);
    }
    public boolean verkoop(Game g, Persoon p)
    {
        if(p.hasGame(g) == -1 && this.games.indexOf(g) != -1 && p.getGeld() >= g.huidigeWaarde())
        {
            p.betaal(g.huidigeWaarde());
            this.geld += g.huidigeWaarde();
            this.games.remove(g);
            p.AddGame(g);
            return true;
        }
        return false;
    }

    public int hasGame(Game g)
    {
        return this.games.indexOf(g);
    }

}
