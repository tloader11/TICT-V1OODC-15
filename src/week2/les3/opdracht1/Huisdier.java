package week2.les3.opdracht1;

public class Huisdier
{
    private String naam;
    private String ras;
    private Double gewicht;
    private Eigenaar Baasje;
    public Huisdier(String naam, String ras)
    {
        this.naam = naam;
        this.ras = ras;
        this.Baasje = new Eigenaar(null);
        this.gewicht = 0.0;
    }

    public Eigenaar getBaasje() {
        return Baasje;
    }

    public void setBaasje(Eigenaar baasje) {
        Baasje = baasje;
    }

    @Override
    public String toString() {
        return this.naam + ", de " + this.ras + ", weegt "+ this.gewicht+" kg\r\n"+"En de eigenaar is: " + Baasje.toString();
    }
}
