package week2.les3.practicum1;

public class Huis
{
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;
    public Huis(String adres, int bouwjaar)
    {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + this.adres + " is gebouwd in " + this.bouwjaar + "\nEn heeft huisbaas " + this.huisbaas;
    }
}
