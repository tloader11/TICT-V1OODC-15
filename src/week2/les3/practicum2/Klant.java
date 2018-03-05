package week2.les3.practicum2;


public class Klant
{
    private String naam;
    private double kortingsPercentage;
    public Klant(String naam)
    {
        this.naam = naam;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return this.naam + " (korting: " + this.kortingsPercentage + "%)";
    }
}
