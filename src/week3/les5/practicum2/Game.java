package week3.les5.practicum2;

import java.time.LocalDate;

/**
 * Created by Tristan on 3/20/2018.
 */
public class Game
{
    private String naam;
    private int release;
    private double prijs;

    public Game(String naam, int release, double prijs) {
        this.naam = naam;
        this.release = release;
        this.prijs = prijs;
    }

    public double huidigeWaarde()
    {
        int loss = LocalDate.now().getYear() - release;
        double multiplier = (70^(1+loss));
        return prijs * multiplier/100;
    }

}
