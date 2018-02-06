package week2.les3.opdracht2;

public class Huisdier
{
    private String naam;
    private String ras;
    private Double gewicht;
    public Huisdier(String naam, String ras)
    {
        this.naam = naam;
        this.ras = ras;
        this.gewicht = 0.0;
    }

    @Override
    public String toString() {
        if(this.naam != null || this.ras != null || this.gewicht != 0.0)
        {
            return this.naam + ", de " + this.ras + ", weegt "+ this.gewicht+" kg";
        }
        return null;
    }
}
