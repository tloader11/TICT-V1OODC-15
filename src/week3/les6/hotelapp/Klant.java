package week3.les6.hotelapp;

/**
 * Created by universal on 3/15/2018.
 */
public class Klant
{
    private String naam;
    private String plaats;

    public Klant(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
    }

    @Override
    public String toString() {
        return this.naam + " woont in " + this.plaats;
    }
}
