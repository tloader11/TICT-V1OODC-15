package week3.les6.hotelapp;

/**
 * Created by universal on 3/15/2018.
 */
public class Kamer
{
    private int kamernummer;
    private KamerType type;
    private boolean onbekend;

    public Kamer(int kamernummer, KamerType type, boolean onbekend) {
        this.kamernummer = kamernummer;
        this.type = type;
        this.onbekend = onbekend;
    }
}
