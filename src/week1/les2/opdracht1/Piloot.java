package week1.les2.opdracht1;

/**
 * Created by universal on 2/6/2018.
 */
public class Piloot {
    private String naam;
    private int VliegUren;
    private double Salaris;
    public Piloot(String naam)
    {
        this.naam = naam;
        this.VliegUren = 0;
        this.Salaris = 0.0;
    }

    public int getVlieguren() {
        return this.VliegUren;
    }

    public void verhoogVliegurenMet(int vliegUren) {
        this.VliegUren += vliegUren;
    }

    public double getSalaris() {
        return this.Salaris;
    }

    public void setSalaris(double salaris) {
        this.Salaris = salaris;
    }

    @Override
    public String toString() {
        //John Travolta heeft 0 vlieguren gemaakt en verdient 123456.78
        return this.naam + " heeft " + this.VliegUren + " vlieguren gemaakt en verdient " + this.Salaris;
    }
}
