package week2.les3.opdracht1;

public class Eigenaar
{
    private String naam;
    private int giroNr;

    public Eigenaar(String naam)
    {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public void setGiroNr(int giroNr) {
        this.giroNr = giroNr;
    }

    @Override
    public String toString() {
        return this.naam+" heeft giro " + this.giroNr;
    }
}
