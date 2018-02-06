package week2.les3.opdracht2;

public class Eigenaar
{
    private String naam;
    private int giroNr;
    private Huisdier Beestje;

    public Eigenaar(String naam)
    {
        this.naam = naam;
        this.giroNr = 0;
        this.Beestje = new Huisdier(null, null);
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

    public Huisdier getBeestje() {
        return Beestje;
    }

    public void setBeestje(Huisdier beestje) {
        Beestje = beestje;
    }

    @Override
    public String toString() {
        return this.naam+" heeft giro " + this.giroNr + ". En is het baasje van " + this.Beestje.toString();
    }
}
